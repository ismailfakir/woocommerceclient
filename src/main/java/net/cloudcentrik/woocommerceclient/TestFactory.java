package net.cloudcentrik.woocommerceclient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
}
