package net.cloudcentrik.woocommerceclient.configuration;

import net.cloudcentrik.woocommerceclient.RequestUrlGenerator;
import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class AppConfiguration {


    private static final String BASE_URL = "base-url";
    private static final String CONSUMER_KEY = "consumer-key";
    private static final String CONSUMER_SECRET = "consumer-secret";

    private static  String CONFIG_FILE = "";

    private static final Logger log = LoggerFactory.getLogger(AppConfiguration.class);

    public static String getConfiguration(String key) throws Exception {

        File propertiesFile = new File(CONFIG_FILE);
        if (!propertiesFile.exists()) {
            // file is not exist
            log.warn("configuration file does not exist!");
            return null;
        }

        Configurations configs = new Configurations();
        FileBasedConfigurationBuilder<XMLConfiguration> builder = configs.xmlBuilder(CONFIG_FILE);
        XMLConfiguration config = builder.getConfiguration();

        return config.getString(key);
    }

    public static void setConfiguration(String key, String value) throws Exception {

        File propertiesFile = new File(CONFIG_FILE);
        if (!propertiesFile.exists()) {
            // file is not exist
            log.warn("configuration file does not exist!");
            return;
        }

        Configurations configs = new Configurations();
        FileBasedConfigurationBuilder<XMLConfiguration> builder = configs.xmlBuilder(CONFIG_FILE);
        XMLConfiguration config = builder.getConfiguration();
        config.setProperty(key, value);
        builder.save();
    }

    public static void saveConfiguration(String baseUrl, String consumerKey, String consumerSecret) throws Exception {
        AppConfiguration.setConfiguration(AppConfiguration.BASE_URL, baseUrl);
        AppConfiguration.setConfiguration(AppConfiguration.CONSUMER_KEY, consumerSecret);
        AppConfiguration.setConfiguration(AppConfiguration.CONSUMER_SECRET, consumerSecret);
    }

    public static void loadConfiguration(String configFile) throws Exception {
        CONFIG_FILE=configFile;
        RequestUrlGenerator.baseUrl = AppConfiguration.getConfiguration(AppConfiguration.BASE_URL);
        RequestUrlGenerator.consumerKey = AppConfiguration.getConfiguration(AppConfiguration.CONSUMER_KEY);
        RequestUrlGenerator.consumerSecret = AppConfiguration.getConfiguration(AppConfiguration.CONSUMER_SECRET);
    }

}