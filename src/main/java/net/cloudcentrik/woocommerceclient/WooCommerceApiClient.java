package net.cloudcentrik.woocommerceclient;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class WooCommerceApiClient {

    public static String getBaseGetResponseById(EndpointBaseType endpointBaseType,int id){

        String responseJson = "";
        CloseableHttpResponse response = null;

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(RequestUrlGenerator.makeRequestUrl(HttpMethod.GET, endpointBaseType,id));

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

    public static String getBaseGetResponse(EndpointBaseType endpointBaseType){

        String responseJson = "";
        CloseableHttpResponse response = null;

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(RequestUrlGenerator.makeRequestUrl(HttpMethod.GET, endpointBaseType));

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

    public static String getBasePostResponse(EndpointBaseType endpointBaseType,String jsonData) throws Exception{

        String responseJson = "";
        CloseableHttpResponse response = null;

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost(RequestUrlGenerator.makeRequestUrl(HttpMethod.POST, endpointBaseType));
        httppost.setEntity(new StringEntity(jsonData));
        httppost.setHeader("Content-Type","application/json");

        try {
            response = httpclient.execute(httppost);
            if(response.getStatusLine().getStatusCode()!=200){

                return "ERROR IN REQUEST, REASON :"+response.getStatusLine().getReasonPhrase();
            }
            responseJson = EntityUtils.toString(response.getEntity(), "UTF-8");

        } catch (IOException e) {

        }

        return responseJson;
    }

    public static String getBasePostResponseById(EndpointBaseType endpointBaseType,int id,String jsonData) throws Exception{

        String responseJson = "";
        CloseableHttpResponse response = null;

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost(RequestUrlGenerator.makeRequestUrl(HttpMethod.POST, endpointBaseType,id));
        httppost.setEntity(new StringEntity(jsonData));

        try {
            response = httpclient.execute(httppost);
            if(response.getStatusLine().getStatusCode()!=200){

                return "ERROR IN REQUEST, REASON :"+response.getStatusLine().getReasonPhrase();
            }
            responseJson = EntityUtils.toString(response.getEntity(), "UTF-8");

        } catch (IOException e) {

        }

        return responseJson;
    }

    public static String getSystemStatus()throws Exception{
        return getBaseGetResponse(EndpointBaseType.SYSTEM_STATUS);
    }

    public static String getAllProductAttributes()throws Exception{
        return getBaseGetResponse(EndpointBaseType.PRODUCTS_ATTRIBUTES);
    }

    public static String getAllProduct(){
        return getBaseGetResponse(EndpointBaseType.PRODUCTS);
    }

    public static String createProductAttributes(String attributeJson)throws Exception{
        return getBasePostResponse(EndpointBaseType.PRODUCTS_ATTRIBUTES,attributeJson);
    }


    public static String getProductById(int id) throws Exception{

        return getBaseGetResponseById(EndpointBaseType.PRODUCTS,id);
    }
    public static String getProductByIdTemp(int id) throws Exception{

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
    public static String getResponseTemp()throws Exception {

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
}