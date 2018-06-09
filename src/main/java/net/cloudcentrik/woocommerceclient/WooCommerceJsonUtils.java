package net.cloudcentrik.woocommerceclient;

import com.google.gson.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class WooCommerceJsonUtils {
    private static final Logger log = LoggerFactory.getLogger(WooCommerceJsonUtils.class);

    public static Map<String,String> getEntryAsMap(JsonObject root,String key){

        Map<String,String> map=new HashMap<>();
        for (Map.Entry<String, JsonElement> entry : root.entrySet())
        {
            if(entry.getKey().equals(key)){
                JsonObject envObject=entry.getValue().getAsJsonObject();
                for (Map.Entry<String, JsonElement> env : envObject.entrySet())
                {
                    if(env.getValue().isJsonPrimitive()){
                        map.put(env.getKey(),env.getValue().getAsString());
                    }

                }
            }
        }

        return map;
    }

    public static void prettyPrintJson(String json){
        JsonParser parser = new JsonParser();
        JsonElement jsonTree = parser.parse(json);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        log.info(gson.toJson(jsonTree));

    }



}
