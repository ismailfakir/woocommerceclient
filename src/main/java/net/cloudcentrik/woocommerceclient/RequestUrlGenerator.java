package net.cloudcentrik.woocommerceclient;

import net.cloudcentrik.woocommerceclient.oauth.OAuthConfig;
import net.cloudcentrik.woocommerceclient.oauth.OAuthSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestUrlGenerator {

    public static String consumerKey = "";
    public static String consumerSecret = "";
    public static String baseUrl = "";

    private static final Logger log = LoggerFactory.getLogger(RequestUrlGenerator.class);


    public static String makeRequestUrl(HttpMethod httpMethod, EndpointBaseType endpointBaseType) {

        String requestUrl = "";
        try {
            //AppConfiguration.loadConfiguration();
            OAuthConfig config = new OAuthConfig(baseUrl, consumerKey, consumerSecret);
            String url = baseUrl + ApiVersionType.V2.getValue() + endpointBaseType.getValue();
            String secureUrl = OAuthSignature.getAsQueryString(config, url, httpMethod);
            requestUrl = url + "?" + secureUrl;

            log.info(requestUrl);

            return requestUrl;

        } catch (Exception e) {

        }

        return requestUrl;

    }

    public static String makeRequestUrl(HttpMethod httpMethod, EndpointBaseType endpointBaseType, int id) {

        String requestUrl = "";
        try {
            //AppConfiguration.loadConfiguration();
            OAuthConfig config = new OAuthConfig(baseUrl, consumerKey, consumerSecret);
            String url = baseUrl + ApiVersionType.V2.getValue() + endpointBaseType.getValue() + "/" + id;
            String secureUrl = OAuthSignature.getAsQueryString(config, url, httpMethod);
            requestUrl = url + "?" + secureUrl;

            log.info(requestUrl);

            return requestUrl;

        } catch (Exception e) {

        }

        return requestUrl;

    }
}
