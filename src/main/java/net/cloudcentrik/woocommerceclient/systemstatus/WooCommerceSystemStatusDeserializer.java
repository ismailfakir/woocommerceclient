package net.cloudcentrik.woocommerceclient.systemstatus;

import com.google.gson.*;

import java.lang.reflect.Type;

public class WooCommerceSystemStatusDeserializer implements JsonDeserializer<WooCommerceSystemStatus> {
    @Override
    public WooCommerceSystemStatus deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
            throws JsonParseException {

        final JsonObject jsonObject = json.getAsJsonObject();

        // Delegate the deserialization to the context
        final WooCommerceEnvironment wooCommerceEnvironment = context.deserialize(jsonObject.get("environment"), WooCommerceEnvironment.class);

        // Delegate the deserialization to the context
        final WooCommerceSettings wooCommerceSettings = context.deserialize(jsonObject.get("settings"), WooCommerceSettings.class);

        return new WooCommerceSystemStatus(wooCommerceEnvironment,wooCommerceSettings);

    }
}
