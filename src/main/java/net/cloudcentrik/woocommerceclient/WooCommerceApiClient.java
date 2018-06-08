package net.cloudcentrik.woocommerceclient;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class WooCommerceApiClient {

    public static String getBaseResponse(HttpMethod httpMethod,EndpointBaseType endpointBaseType) throws Exception{

        String responseJson = "";
        CloseableHttpResponse response = null;

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(RequestUrlGenerator.makeRequestUrl(httpMethod, endpointBaseType));

        try {
            response = httpclient.execute(httpget);
            if(response.getStatusLine().getStatusCode()!=200){

                return "ERROR IN REQUEST, REASON :"+response.getStatusLine().getReasonPhrase();
            }
            responseJson = EntityUtils.toString(response.getEntity(), "UTF-8");

        } catch (IOException e) {

        }

        return responseJson;
    }

    public static String getSystemStatus()throws Exception{
        return getBaseResponse(HttpMethod.GET,EndpointBaseType.SYSTEM_STATUS);
    }

    public static String getResponse()throws Exception {

        String responseJson = "";
        CloseableHttpResponse response = null;

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(RequestUrlGenerator.makeRequestUrl(HttpMethod.GET, EndpointBaseType.SYSTEM_STATUS));

        try {
            response = httpclient.execute(httpget);
            if(response.getStatusLine().getStatusCode()!=200){

                return "ERROR IN REQUEST, REASON :"+response.getStatusLine().getReasonPhrase();
            }
            responseJson = EntityUtils.toString(response.getEntity(), "UTF-8");

        } catch (IOException e) {

        }

        return responseJson;
    }

    public static String getProduct(int id) throws Exception{

        String responseJson = "";
        CloseableHttpResponse response = null;

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(RequestUrlGenerator.makeRequestUrl(HttpMethod.GET, EndpointBaseType.PRODUCTS,id));

        try {
            response = httpclient.execute(httpget);
            if(response.getStatusLine().getStatusCode()!=200){

                return "ERROR IN REQUEST, REASON :"+response.getStatusLine().getReasonPhrase();
            }
            responseJson = EntityUtils.toString(response.getEntity(), "UTF-8");

        } catch (IOException e) {

        }

        return responseJson;
    }
}