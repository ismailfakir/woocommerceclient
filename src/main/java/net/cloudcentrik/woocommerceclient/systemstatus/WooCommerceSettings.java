package net.cloudcentrik.woocommerceclient.systemstatus;

public class WooCommerceSettings {

    private Boolean forceSsl;
    private String currency;
    private String thousnadSeparator;
    private String decimalSeparator;
    private Integer numberOfDecimals;

    public WooCommerceSettings() {
    }

    public WooCommerceSettings(Boolean forceSsl, String currency, String thousnadSeparator, String decimalSeparator, Integer numberOfDecimals) {
        this.forceSsl = forceSsl;
        this.currency = currency;
        this.thousnadSeparator = thousnadSeparator;
        this.decimalSeparator = decimalSeparator;
        this.numberOfDecimals = numberOfDecimals;
    }

    public Boolean getForceSsl() {
        return forceSsl;
    }

    public void setForceSsl(Boolean forceSsl) {
        this.forceSsl = forceSsl;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getThousnadSeparator() {
        return thousnadSeparator;
    }

    public void setThousnadSeparator(String thousnadSeparator) {
        this.thousnadSeparator = thousnadSeparator;
    }

    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    public void setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
    }

    public Integer getNumberOfDecimals() {
        return numberOfDecimals;
    }

    public void setNumberOfDecimals(Integer numberOfDecimals) {
        this.numberOfDecimals = numberOfDecimals;
    }

    @Override
    public String toString() {
        return "WooCommerceSettings{" +
                "forceSsl=" + forceSsl +
                ", currency='" + currency + '\'' +
                ", thousnadSeparator='" + thousnadSeparator + '\'' +
                ", decimalSeparator='" + decimalSeparator + '\'' +
                ", numberOfDecimals=" + numberOfDecimals +
                '}';
    }
}
