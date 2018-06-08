package net.cloudcentrik.woocommerceclient;

import net.cloudcentrik.woocommerceclient.oauth.OAuthConfig;
import net.cloudcentrik.woocommerceclient.oauth.OAuthSignature;

public class RequestUrlGenerator {

    public static String consumerKey = "";
    public static String consumerSecret = "";
    public static String baseUrl = "";


    public static String makeRequestUrl(HttpMethod httpMethod,EndpointBaseType endpointBaseType)throws Exception{

        //AppConfiguration.loadConfiguration();
        OAuthConfig config = new OAuthConfig(baseUrl, consumerKey, consumerSecret);
        String url = baseUrl + ApiVersionType.V2.getValue() + endpointBaseType;
        String secureUrl = OAuthSignature.getAsQueryString(config, url, httpMethod);
        String requestUrl = url + "?" + secureUrl;

        return requestUrl;

    }

    public static String makeRequestUrl(HttpMethod httpMethod,EndpointBaseType endpointBaseType,int id)throws Exception{
        //AppConfiguration.loadConfiguration();
        OAuthConfig config = new OAuthConfig(baseUrl, consumerKey, consumerSecret);
        String url = baseUrl + ApiVersionType.V2.getValue() + endpointBaseType+"/"+id;
        String secureUrl = OAuthSignature.getAsQueryString(config, url, httpMethod);
        String requestUrl = url +"?" + secureUrl;

        return requestUrl;

    }
}
