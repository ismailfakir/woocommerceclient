package net.cloudcentrik.woocommerceclient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.cloudcentrik.woocommerceclient.systemstatus.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestFactory {

    private static final Logger log = LoggerFactory.getLogger(TestFactory.class);

    public static void showSystemInfo()throws Exception{
        log.info("Getting system status");
        String response=WooCommerceApiClient.getSystemStatus();
        log.info(response);

        final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(WooCommerceSystemStatus.class, new WooCommerceSystemStatusDeserializer());
        gsonBuilder.registerTypeAdapter(WooCommerceEnvironment.class, new WooCommerceEnvironmentDeserializer());
        gsonBuilder.registerTypeAdapter(WooCommerceSettings.class, new WooCommerceSettingsDeserializer());
        final Gson gson = gsonBuilder.create();

        // Parse JSON to Java
        final WooCommerceSystemStatus wooCommerceSystemStatus = gson.fromJson(
                response, WooCommerceSystemStatus.class);
        log.info(wooCommerceSystemStatus.toString());

    }

    public static void showAllProductAttributes()throws Exception{
        log.info("Getting all product attributes");
        String response=WooCommerceApiClient.getAllProductAttributes();
        log.info(response);
        WooCommerceJsonUtils.prettyPrintJson(response);


    }

    public static void createProductAttribute()throws Exception{
        log.info("Creating product attributes");

        JsonObject attribute=new JsonObject();
        attribute.addProperty("name","color");
        attribute.addProperty("slug","pa-color");
        attribute.addProperty("type","select");
        attribute.addProperty("order_by","menu_order");
        attribute.addProperty("has_archives",true);

        log.info("DATA : "+attribute.toString());

        String response=WooCommerceApiClient.createProductAttributes(attribute.toString());

        log.info(response);


    }

    public static void showAProduct()throws Exception{
        log.info("Getting a product");
        String response=WooCommerceApiClient.getProductById(75);

        log.info(response);
        WooCommerceJsonUtils.prettyPrintJson(response);


    }
}
