package net.cloudcentrik.woocommerceclient;

public enum ApiVersionType {
    V1("wp-json/wc/v1/"),
    V2("wp-json/wc/v2/");

    private String value;

    ApiVersionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
