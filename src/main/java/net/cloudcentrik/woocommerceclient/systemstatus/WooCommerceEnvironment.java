package net.cloudcentrik.woocommerceclient.systemstatus;

public class WooCommerceEnvironment {
    private String woocommerceVersion;
    private String wordpressVersion;
    private String language;
    private String defaultTimeZone;
    private Boolean gzipEnabled;

    public WooCommerceEnvironment() {
    }

    public WooCommerceEnvironment(String woocommerceVersion, String wordpressVersion, String language, String defaultTimeZone, Boolean gzipEnabled) {
        this.woocommerceVersion = woocommerceVersion;
        this.wordpressVersion = wordpressVersion;
        this.language = language;
        this.defaultTimeZone = defaultTimeZone;
        this.gzipEnabled = gzipEnabled;
    }

    public String getWoocommerceVersion() {
        return woocommerceVersion;
    }

    public void setWoocommerceVersion(String woocommerceVersion) {
        this.woocommerceVersion = woocommerceVersion;
    }

    public String getWordpressVersion() {
        return wordpressVersion;
    }

    public void setWordpressVersion(String wordpressVersion) {
        this.wordpressVersion = wordpressVersion;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDefaultTimeZone() {
        return defaultTimeZone;
    }

    public void setDefaultTimeZone(String defaultTimeZone) {
        this.defaultTimeZone = defaultTimeZone;
    }

    public Boolean getGzipEnabled() {
        return gzipEnabled;
    }

    public void setGzipEnabled(Boolean gzipEnabled) {
        this.gzipEnabled = gzipEnabled;
    }

    @Override
    public String toString() {
        return "WooCommerceEnvironment{" +
                "woocommerceVersion='" + woocommerceVersion + '\'' +
                ", wordpressVersion='" + wordpressVersion + '\'' +
                ", language='" + language + '\'' +
                ", defaultTimeZone='" + defaultTimeZone + '\'' +
                ", gzipEnabled=" + gzipEnabled +
                '}';
    }
}
