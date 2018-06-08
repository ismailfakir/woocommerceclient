package net.cloudcentrik.woocommerceclient.systemstatus;

import com.google.gson.*;

import java.lang.reflect.Type;

public class WooCommerceSettingsDeserializer implements JsonDeserializer<WooCommerceSettings> {
    @Override
    public WooCommerceSettings deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

        final JsonObject jsonObject = jsonElement.getAsJsonObject();

        WooCommerceSettings wooCommerceSettings=new WooCommerceSettings();

        wooCommerceSettings.setForceSsl(jsonObject.get("force_ssl").getAsBoolean());
        wooCommerceSettings.setCurrency(jsonObject.get("currency").getAsString());
        wooCommerceSettings.setThousnadSeparator(jsonObject.get("thousand_separator").getAsString());
        wooCommerceSettings.setDecimalSeparator(jsonObject.get("decimal_separator").getAsString());
        wooCommerceSettings.setNumberOfDecimals(jsonObject.get("number_of_decimals").getAsInt());

        return wooCommerceSettings;
    }
}
