package net.cloudcentrik.woocommerceclient;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.net.URLCodec;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OAuthForWooCommerce {

    private static String key = "ck_9c8efb21e8fe68dea344d423116f341b3beb4abf";
    private static String secret = "cs_72de51abfda28d30cf60d7f96386e5be5978e88c";

    private static final String HMAC_SHA1 = "HmacSHA1";

    private static final String ENC = "UTF-8";
    private static final String WP_API_V1 = "wp-json/wc/v1/";
    private static final String WC_API_v2 = "wc-api/v2/";
    private static final String PATH = "orders";

    private static Base64 base64 = new Base64();


    private static String getSignature(String url, String params)
            throws UnsupportedEncodingException, NoSuchAlgorithmException,
            InvalidKeyException, EncoderException {
        /**
         * base has three parts, they are connected by "&": 1) protocol 2) URL
         * (need to be URLEncoded) 3) Parameter List (need to be URLEncoded).
         */
        StringBuilder base = new StringBuilder();
        base.append("GET&");

        //follow Step 2 and encode
        base.append(new URLCodec(Consts.UTF_8.displayName()).encode(url));
        base.append("&");
        base.append(params);

        System.out.println("String for oauth_signature generation: " + base);

        byte[] keyBytes = (String.format("%s", secret)).getBytes(ENC);

        SecretKey key = new SecretKeySpec(keyBytes, HMAC_SHA1);

        Mac mac = Mac.getInstance(HMAC_SHA1);
        mac.init(key);

        // encode it, base64 it, change it to string and return.
        String signature = new String(base64.encode(mac.doFinal(base.toString().getBytes(ENC))), ENC).trim();
        return signature;
    }


    public static void main(String[] args) throws IOException, URISyntaxException, InvalidKeyException,
            NoSuchAlgorithmException, EncoderException {

        String nonce = RandomStringUtils.randomAlphanumeric(32);

        Map<String, String> paramMap = new TreeMap<>();
        paramMap.put("oauth_consumer_key", key);
        paramMap.put("oauth_timestamp", "" + (System.currentTimeMillis() / 1000));
        paramMap.put("oauth_nonce", nonce);
        paramMap.put("oauth_signature_method", "HMAC-SHA1");

        List<NameValuePair> qparams = new ArrayList<>();

        //uksort( $params, 'strcmp' ) mimic
        paramMap.entrySet().stream().forEach(stringStringEntry -> qparams.add(new BasicNameValuePair(stringStringEntry.getKey(), stringStringEntry.getValue())));

        //double encode Step 3 (in order to replace '%' with '%25') after sorting (Step 4)
        String encodedParams = URLEncoder.encode(URLEncodedUtils.format(qparams, ENC), ENC);

        System.out.println("Encoded Params "+ encodedParams);

        String signature = getSignature("http://www.cloudcentrik.net/mouhorna/wc-api/v2/orders", encodedParams);

        qparams.add(new BasicNameValuePair("oauth_signature", signature));

        HttpClient httpclient = HttpClientBuilder.create().build();

        System.out.println("Getting Oauth Signature...");

        // generate URI which lead to access_token and token_secret.
        URI uri = URIUtils.createURI("http", "www.cloudcentrik.net/mouhorna", -1, "wc-api/v2/orders", URLEncodedUtils.format(qparams, ENC), null);

        System.out.println("Connecting to  the URL : \n" + uri.toString());

        HttpGet httpget = new HttpGet(uri);
        httpget.setHeader("X-Stream" , "true");

        // output the response content.
        System.out.println("Getting Response from the server :");

        HttpResponse response = httpclient.execute(httpget);
        HttpEntity entity = response.getEntity();

        System.out.println("Response Code " + response.getStatusLine().getStatusCode());

        if (entity != null) {
            System.out.println("Json response" + IOUtils.toString(entity.getContent(), ENC));
        }
    }
}