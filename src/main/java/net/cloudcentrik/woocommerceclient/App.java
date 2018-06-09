package net.cloudcentrik.woocommerceclient;


import net.cloudcentrik.woocommerceclient.configuration.AppConfiguration;
import net.cloudcentrik.woocommerceclient.scheduler.JobSchedular;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;

import static net.cloudcentrik.woocommerceclient.TestFactory.createProductAttribute;
import static net.cloudcentrik.woocommerceclient.TestFactory.showAProduct;
import static net.cloudcentrik.woocommerceclient.TestFactory.showAllProductAttributes;

public class App
{
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) throws Exception
    {

        if(args.length<1){
            throw new RuntimeException("Configuration file not found");
        }

        //configuration file from program argument
        final String  configFile=args[0];

        log.info("Loding system configuration from "+configFile);
        AppConfiguration.loadConfiguration(configFile);

        //JobSchedular.start();

        //TestFactory.showSystemInfo();
        //createProductAttribute();
        showAllProductAttributes();

        //showAProduct();

    }


}
