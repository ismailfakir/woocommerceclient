package net.cloudcentrik.woocommerceclient.systemstatus;

public class WooCommerceSystemStatus {
    private WooCommerceEnvironment wooCommerceEnvironment;
    private WooCommerceSettings wooCommerceSettings;

    public WooCommerceSystemStatus() {
    }

    public WooCommerceSystemStatus(WooCommerceEnvironment wooCommerceEnvironment, WooCommerceSettings wooCommerceSettings) {
        this.wooCommerceEnvironment = wooCommerceEnvironment;
        this.wooCommerceSettings = wooCommerceSettings;
    }

    public WooCommerceEnvironment getWooCommerceEnvironment() {
        return wooCommerceEnvironment;
    }

    public void setWooCommerceEnvironment(WooCommerceEnvironment wooCommerceEnvironment) {
        this.wooCommerceEnvironment = wooCommerceEnvironment;
    }

    public WooCommerceSettings getWooCommerceSettings() {
        return wooCommerceSettings;
    }

    public void setWooCommerceSettings(WooCommerceSettings wooCommerceSettings) {
        this.wooCommerceSettings = wooCommerceSettings;
    }


    @Override
    public String toString() {
        return "WooCommerceSystemStatus{" +
                "wooCommerceEnvironment=" + wooCommerceEnvironment +
                ", wooCommerceSettings=" + wooCommerceSettings +
                '}';
    }
}
