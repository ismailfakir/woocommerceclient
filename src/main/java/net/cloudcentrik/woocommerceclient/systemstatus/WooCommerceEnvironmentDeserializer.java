package net.cloudcentrik.woocommerceclient.systemstatus;

import com.google.gson.*;

import java.lang.reflect.Type;

public class WooCommerceEnvironmentDeserializer implements JsonDeserializer<WooCommerceEnvironment> {
    @Override
    public WooCommerceEnvironment deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

        final JsonObject jsonObject = jsonElement.getAsJsonObject();

        WooCommerceEnvironment wooCommerceEnvironment=new WooCommerceEnvironment();

        wooCommerceEnvironment.setWoocommerceVersion(jsonObject.get("version").getAsString());
        wooCommerceEnvironment.setWordpressVersion(jsonObject.get("wp_version").getAsString());
        wooCommerceEnvironment.setLanguage(jsonObject.get("language").getAsString());
        wooCommerceEnvironment.setDefaultTimeZone(jsonObject.get("default_timezone").getAsString());
        wooCommerceEnvironment.setGzipEnabled(jsonObject.get("gzip_enabled").getAsBoolean());

        return wooCommerceEnvironment;
    }
}
