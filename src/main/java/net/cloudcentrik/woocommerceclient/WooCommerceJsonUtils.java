package net.cloudcentrik.woocommerceclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

public class WooCommerceJsonUtils {

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



}
