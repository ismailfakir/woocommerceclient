package net.cloudcentrik.woocommerceclient;

import java.util.Map;

public class PrintUtil {
    public static void printMap(Map<String,String> map){
        map.forEach((k,v)->{
            System.out.println("KEY : " + k + "----> VALUE : " + v);

        });
    }

}
