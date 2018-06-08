
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Woocommerce implements Serializable
{

    @SerializedName("wp_mou_woocommerce_sessions")
    @Expose
    @Valid
    private Wp_mou_woocommerce_sessions wp_mou_woocommerce_sessions;
    @SerializedName("wp_mou_woocommerce_api_keys")
    @Expose
    @Valid
    private Wp_mou_woocommerce_api_keys wp_mou_woocommerce_api_keys;
    @SerializedName("wp_mou_woocommerce_attribute_taxonomies")
    @Expose
    @Valid
    private Wp_mou_woocommerce_attribute_taxonomies wp_mou_woocommerce_attribute_taxonomies;
    @SerializedName("wp_mou_woocommerce_downloadable_product_permissions")
    @Expose
    @Valid
    private Wp_mou_woocommerce_downloadable_product_permissions wp_mou_woocommerce_downloadable_product_permissions;
    @SerializedName("wp_mou_woocommerce_order_items")
    @Expose
    @Valid
    private Wp_mou_woocommerce_order_items wp_mou_woocommerce_order_items;
    @SerializedName("wp_mou_woocommerce_order_itemmeta")
    @Expose
    @Valid
    private Wp_mou_woocommerce_order_itemmeta wp_mou_woocommerce_order_itemmeta;
    @SerializedName("wp_mou_woocommerce_tax_rates")
    @Expose
    @Valid
    private Wp_mou_woocommerce_tax_rates wp_mou_woocommerce_tax_rates;
    @SerializedName("wp_mou_woocommerce_tax_rate_locations")
    @Expose
    @Valid
    private Wp_mou_woocommerce_tax_rate_locations wp_mou_woocommerce_tax_rate_locations;
    @SerializedName("wp_mou_woocommerce_shipping_zones")
    @Expose
    @Valid
    private Wp_mou_woocommerce_shipping_zones wp_mou_woocommerce_shipping_zones;
    @SerializedName("wp_mou_woocommerce_shipping_zone_locations")
    @Expose
    @Valid
    private Wp_mou_woocommerce_shipping_zone_locations wp_mou_woocommerce_shipping_zone_locations;
    @SerializedName("wp_mou_woocommerce_shipping_zone_methods")
    @Expose
    @Valid
    private Wp_mou_woocommerce_shipping_zone_methods wp_mou_woocommerce_shipping_zone_methods;
    @SerializedName("wp_mou_woocommerce_payment_tokens")
    @Expose
    @Valid
    private Wp_mou_woocommerce_payment_tokens wp_mou_woocommerce_payment_tokens;
    @SerializedName("wp_mou_woocommerce_payment_tokenmeta")
    @Expose
    @Valid
    private Wp_mou_woocommerce_payment_tokenmeta wp_mou_woocommerce_payment_tokenmeta;
    @SerializedName("wp_mou_woocommerce_log")
    @Expose
    @Valid
    private Wp_mou_woocommerce_log wp_mou_woocommerce_log;
    private final static long serialVersionUID = 6467564175672104720L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Woocommerce() {
    }

    /**
     * 
     * @param wp_mou_woocommerce_downloadable_product_permissions
     * @param wp_mou_woocommerce_log
     * @param wp_mou_woocommerce_tax_rate_locations
     * @param wp_mou_woocommerce_sessions
     * @param wp_mou_woocommerce_shipping_zone_methods
     * @param wp_mou_woocommerce_shipping_zones
     * @param wp_mou_woocommerce_payment_tokens
     * @param wp_mou_woocommerce_api_keys
     * @param wp_mou_woocommerce_order_items
     * @param wp_mou_woocommerce_attribute_taxonomies
     * @param wp_mou_woocommerce_tax_rates
     * @param wp_mou_woocommerce_order_itemmeta
     * @param wp_mou_woocommerce_shipping_zone_locations
     * @param wp_mou_woocommerce_payment_tokenmeta
     */
    public Woocommerce(Wp_mou_woocommerce_sessions wp_mou_woocommerce_sessions, Wp_mou_woocommerce_api_keys wp_mou_woocommerce_api_keys, Wp_mou_woocommerce_attribute_taxonomies wp_mou_woocommerce_attribute_taxonomies, Wp_mou_woocommerce_downloadable_product_permissions wp_mou_woocommerce_downloadable_product_permissions, Wp_mou_woocommerce_order_items wp_mou_woocommerce_order_items, Wp_mou_woocommerce_order_itemmeta wp_mou_woocommerce_order_itemmeta, Wp_mou_woocommerce_tax_rates wp_mou_woocommerce_tax_rates, Wp_mou_woocommerce_tax_rate_locations wp_mou_woocommerce_tax_rate_locations, Wp_mou_woocommerce_shipping_zones wp_mou_woocommerce_shipping_zones, Wp_mou_woocommerce_shipping_zone_locations wp_mou_woocommerce_shipping_zone_locations, Wp_mou_woocommerce_shipping_zone_methods wp_mou_woocommerce_shipping_zone_methods, Wp_mou_woocommerce_payment_tokens wp_mou_woocommerce_payment_tokens, Wp_mou_woocommerce_payment_tokenmeta wp_mou_woocommerce_payment_tokenmeta, Wp_mou_woocommerce_log wp_mou_woocommerce_log) {
        super();
        this.wp_mou_woocommerce_sessions = wp_mou_woocommerce_sessions;
        this.wp_mou_woocommerce_api_keys = wp_mou_woocommerce_api_keys;
        this.wp_mou_woocommerce_attribute_taxonomies = wp_mou_woocommerce_attribute_taxonomies;
        this.wp_mou_woocommerce_downloadable_product_permissions = wp_mou_woocommerce_downloadable_product_permissions;
        this.wp_mou_woocommerce_order_items = wp_mou_woocommerce_order_items;
        this.wp_mou_woocommerce_order_itemmeta = wp_mou_woocommerce_order_itemmeta;
        this.wp_mou_woocommerce_tax_rates = wp_mou_woocommerce_tax_rates;
        this.wp_mou_woocommerce_tax_rate_locations = wp_mou_woocommerce_tax_rate_locations;
        this.wp_mou_woocommerce_shipping_zones = wp_mou_woocommerce_shipping_zones;
        this.wp_mou_woocommerce_shipping_zone_locations = wp_mou_woocommerce_shipping_zone_locations;
        this.wp_mou_woocommerce_shipping_zone_methods = wp_mou_woocommerce_shipping_zone_methods;
        this.wp_mou_woocommerce_payment_tokens = wp_mou_woocommerce_payment_tokens;
        this.wp_mou_woocommerce_payment_tokenmeta = wp_mou_woocommerce_payment_tokenmeta;
        this.wp_mou_woocommerce_log = wp_mou_woocommerce_log;
    }

    public Wp_mou_woocommerce_sessions getWp_mou_woocommerce_sessions() {
        return wp_mou_woocommerce_sessions;
    }

    public void setWp_mou_woocommerce_sessions(Wp_mou_woocommerce_sessions wp_mou_woocommerce_sessions) {
        this.wp_mou_woocommerce_sessions = wp_mou_woocommerce_sessions;
    }

    public Woocommerce withWp_mou_woocommerce_sessions(Wp_mou_woocommerce_sessions wp_mou_woocommerce_sessions) {
        this.wp_mou_woocommerce_sessions = wp_mou_woocommerce_sessions;
        return this;
    }

    public Wp_mou_woocommerce_api_keys getWp_mou_woocommerce_api_keys() {
        return wp_mou_woocommerce_api_keys;
    }

    public void setWp_mou_woocommerce_api_keys(Wp_mou_woocommerce_api_keys wp_mou_woocommerce_api_keys) {
        this.wp_mou_woocommerce_api_keys = wp_mou_woocommerce_api_keys;
    }

    public Woocommerce withWp_mou_woocommerce_api_keys(Wp_mou_woocommerce_api_keys wp_mou_woocommerce_api_keys) {
        this.wp_mou_woocommerce_api_keys = wp_mou_woocommerce_api_keys;
        return this;
    }

    public Wp_mou_woocommerce_attribute_taxonomies getWp_mou_woocommerce_attribute_taxonomies() {
        return wp_mou_woocommerce_attribute_taxonomies;
    }

    public void setWp_mou_woocommerce_attribute_taxonomies(Wp_mou_woocommerce_attribute_taxonomies wp_mou_woocommerce_attribute_taxonomies) {
        this.wp_mou_woocommerce_attribute_taxonomies = wp_mou_woocommerce_attribute_taxonomies;
    }

    public Woocommerce withWp_mou_woocommerce_attribute_taxonomies(Wp_mou_woocommerce_attribute_taxonomies wp_mou_woocommerce_attribute_taxonomies) {
        this.wp_mou_woocommerce_attribute_taxonomies = wp_mou_woocommerce_attribute_taxonomies;
        return this;
    }

    public Wp_mou_woocommerce_downloadable_product_permissions getWp_mou_woocommerce_downloadable_product_permissions() {
        return wp_mou_woocommerce_downloadable_product_permissions;
    }

    public void setWp_mou_woocommerce_downloadable_product_permissions(Wp_mou_woocommerce_downloadable_product_permissions wp_mou_woocommerce_downloadable_product_permissions) {
        this.wp_mou_woocommerce_downloadable_product_permissions = wp_mou_woocommerce_downloadable_product_permissions;
    }

    public Woocommerce withWp_mou_woocommerce_downloadable_product_permissions(Wp_mou_woocommerce_downloadable_product_permissions wp_mou_woocommerce_downloadable_product_permissions) {
        this.wp_mou_woocommerce_downloadable_product_permissions = wp_mou_woocommerce_downloadable_product_permissions;
        return this;
    }

    public Wp_mou_woocommerce_order_items getWp_mou_woocommerce_order_items() {
        return wp_mou_woocommerce_order_items;
    }

    public void setWp_mou_woocommerce_order_items(Wp_mou_woocommerce_order_items wp_mou_woocommerce_order_items) {
        this.wp_mou_woocommerce_order_items = wp_mou_woocommerce_order_items;
    }

    public Woocommerce withWp_mou_woocommerce_order_items(Wp_mou_woocommerce_order_items wp_mou_woocommerce_order_items) {
        this.wp_mou_woocommerce_order_items = wp_mou_woocommerce_order_items;
        return this;
    }

    public Wp_mou_woocommerce_order_itemmeta getWp_mou_woocommerce_order_itemmeta() {
        return wp_mou_woocommerce_order_itemmeta;
    }

    public void setWp_mou_woocommerce_order_itemmeta(Wp_mou_woocommerce_order_itemmeta wp_mou_woocommerce_order_itemmeta) {
        this.wp_mou_woocommerce_order_itemmeta = wp_mou_woocommerce_order_itemmeta;
    }

    public Woocommerce withWp_mou_woocommerce_order_itemmeta(Wp_mou_woocommerce_order_itemmeta wp_mou_woocommerce_order_itemmeta) {
        this.wp_mou_woocommerce_order_itemmeta = wp_mou_woocommerce_order_itemmeta;
        return this;
    }

    public Wp_mou_woocommerce_tax_rates getWp_mou_woocommerce_tax_rates() {
        return wp_mou_woocommerce_tax_rates;
    }

    public void setWp_mou_woocommerce_tax_rates(Wp_mou_woocommerce_tax_rates wp_mou_woocommerce_tax_rates) {
        this.wp_mou_woocommerce_tax_rates = wp_mou_woocommerce_tax_rates;
    }

    public Woocommerce withWp_mou_woocommerce_tax_rates(Wp_mou_woocommerce_tax_rates wp_mou_woocommerce_tax_rates) {
        this.wp_mou_woocommerce_tax_rates = wp_mou_woocommerce_tax_rates;
        return this;
    }

    public Wp_mou_woocommerce_tax_rate_locations getWp_mou_woocommerce_tax_rate_locations() {
        return wp_mou_woocommerce_tax_rate_locations;
    }

    public void setWp_mou_woocommerce_tax_rate_locations(Wp_mou_woocommerce_tax_rate_locations wp_mou_woocommerce_tax_rate_locations) {
        this.wp_mou_woocommerce_tax_rate_locations = wp_mou_woocommerce_tax_rate_locations;
    }

    public Woocommerce withWp_mou_woocommerce_tax_rate_locations(Wp_mou_woocommerce_tax_rate_locations wp_mou_woocommerce_tax_rate_locations) {
        this.wp_mou_woocommerce_tax_rate_locations = wp_mou_woocommerce_tax_rate_locations;
        return this;
    }

    public Wp_mou_woocommerce_shipping_zones getWp_mou_woocommerce_shipping_zones() {
        return wp_mou_woocommerce_shipping_zones;
    }

    public void setWp_mou_woocommerce_shipping_zones(Wp_mou_woocommerce_shipping_zones wp_mou_woocommerce_shipping_zones) {
        this.wp_mou_woocommerce_shipping_zones = wp_mou_woocommerce_shipping_zones;
    }

    public Woocommerce withWp_mou_woocommerce_shipping_zones(Wp_mou_woocommerce_shipping_zones wp_mou_woocommerce_shipping_zones) {
        this.wp_mou_woocommerce_shipping_zones = wp_mou_woocommerce_shipping_zones;
        return this;
    }

    public Wp_mou_woocommerce_shipping_zone_locations getWp_mou_woocommerce_shipping_zone_locations() {
        return wp_mou_woocommerce_shipping_zone_locations;
    }

    public void setWp_mou_woocommerce_shipping_zone_locations(Wp_mou_woocommerce_shipping_zone_locations wp_mou_woocommerce_shipping_zone_locations) {
        this.wp_mou_woocommerce_shipping_zone_locations = wp_mou_woocommerce_shipping_zone_locations;
    }

    public Woocommerce withWp_mou_woocommerce_shipping_zone_locations(Wp_mou_woocommerce_shipping_zone_locations wp_mou_woocommerce_shipping_zone_locations) {
        this.wp_mou_woocommerce_shipping_zone_locations = wp_mou_woocommerce_shipping_zone_locations;
        return this;
    }

    public Wp_mou_woocommerce_shipping_zone_methods getWp_mou_woocommerce_shipping_zone_methods() {
        return wp_mou_woocommerce_shipping_zone_methods;
    }

    public void setWp_mou_woocommerce_shipping_zone_methods(Wp_mou_woocommerce_shipping_zone_methods wp_mou_woocommerce_shipping_zone_methods) {
        this.wp_mou_woocommerce_shipping_zone_methods = wp_mou_woocommerce_shipping_zone_methods;
    }

    public Woocommerce withWp_mou_woocommerce_shipping_zone_methods(Wp_mou_woocommerce_shipping_zone_methods wp_mou_woocommerce_shipping_zone_methods) {
        this.wp_mou_woocommerce_shipping_zone_methods = wp_mou_woocommerce_shipping_zone_methods;
        return this;
    }

    public Wp_mou_woocommerce_payment_tokens getWp_mou_woocommerce_payment_tokens() {
        return wp_mou_woocommerce_payment_tokens;
    }

    public void setWp_mou_woocommerce_payment_tokens(Wp_mou_woocommerce_payment_tokens wp_mou_woocommerce_payment_tokens) {
        this.wp_mou_woocommerce_payment_tokens = wp_mou_woocommerce_payment_tokens;
    }

    public Woocommerce withWp_mou_woocommerce_payment_tokens(Wp_mou_woocommerce_payment_tokens wp_mou_woocommerce_payment_tokens) {
        this.wp_mou_woocommerce_payment_tokens = wp_mou_woocommerce_payment_tokens;
        return this;
    }

    public Wp_mou_woocommerce_payment_tokenmeta getWp_mou_woocommerce_payment_tokenmeta() {
        return wp_mou_woocommerce_payment_tokenmeta;
    }

    public void setWp_mou_woocommerce_payment_tokenmeta(Wp_mou_woocommerce_payment_tokenmeta wp_mou_woocommerce_payment_tokenmeta) {
        this.wp_mou_woocommerce_payment_tokenmeta = wp_mou_woocommerce_payment_tokenmeta;
    }

    public Woocommerce withWp_mou_woocommerce_payment_tokenmeta(Wp_mou_woocommerce_payment_tokenmeta wp_mou_woocommerce_payment_tokenmeta) {
        this.wp_mou_woocommerce_payment_tokenmeta = wp_mou_woocommerce_payment_tokenmeta;
        return this;
    }

    public Wp_mou_woocommerce_log getWp_mou_woocommerce_log() {
        return wp_mou_woocommerce_log;
    }

    public void setWp_mou_woocommerce_log(Wp_mou_woocommerce_log wp_mou_woocommerce_log) {
        this.wp_mou_woocommerce_log = wp_mou_woocommerce_log;
    }

    public Woocommerce withWp_mou_woocommerce_log(Wp_mou_woocommerce_log wp_mou_woocommerce_log) {
        this.wp_mou_woocommerce_log = wp_mou_woocommerce_log;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("wp_mou_woocommerce_sessions", wp_mou_woocommerce_sessions).append("wp_mou_woocommerce_api_keys", wp_mou_woocommerce_api_keys).append("wp_mou_woocommerce_attribute_taxonomies", wp_mou_woocommerce_attribute_taxonomies).append("wp_mou_woocommerce_downloadable_product_permissions", wp_mou_woocommerce_downloadable_product_permissions).append("wp_mou_woocommerce_order_items", wp_mou_woocommerce_order_items).append("wp_mou_woocommerce_order_itemmeta", wp_mou_woocommerce_order_itemmeta).append("wp_mou_woocommerce_tax_rates", wp_mou_woocommerce_tax_rates).append("wp_mou_woocommerce_tax_rate_locations", wp_mou_woocommerce_tax_rate_locations).append("wp_mou_woocommerce_shipping_zones", wp_mou_woocommerce_shipping_zones).append("wp_mou_woocommerce_shipping_zone_locations", wp_mou_woocommerce_shipping_zone_locations).append("wp_mou_woocommerce_shipping_zone_methods", wp_mou_woocommerce_shipping_zone_methods).append("wp_mou_woocommerce_payment_tokens", wp_mou_woocommerce_payment_tokens).append("wp_mou_woocommerce_payment_tokenmeta", wp_mou_woocommerce_payment_tokenmeta).append("wp_mou_woocommerce_log", wp_mou_woocommerce_log).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(wp_mou_woocommerce_downloadable_product_permissions).append(wp_mou_woocommerce_log).append(wp_mou_woocommerce_tax_rate_locations).append(wp_mou_woocommerce_shipping_zone_methods).append(wp_mou_woocommerce_sessions).append(wp_mou_woocommerce_shipping_zones).append(wp_mou_woocommerce_payment_tokens).append(wp_mou_woocommerce_api_keys).append(wp_mou_woocommerce_order_items).append(wp_mou_woocommerce_tax_rates).append(wp_mou_woocommerce_attribute_taxonomies).append(wp_mou_woocommerce_order_itemmeta).append(wp_mou_woocommerce_shipping_zone_locations).append(wp_mou_woocommerce_payment_tokenmeta).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Woocommerce) == false) {
            return false;
        }
        Woocommerce rhs = ((Woocommerce) other);
        return new EqualsBuilder().append(wp_mou_woocommerce_downloadable_product_permissions, rhs.wp_mou_woocommerce_downloadable_product_permissions).append(wp_mou_woocommerce_log, rhs.wp_mou_woocommerce_log).append(wp_mou_woocommerce_tax_rate_locations, rhs.wp_mou_woocommerce_tax_rate_locations).append(wp_mou_woocommerce_shipping_zone_methods, rhs.wp_mou_woocommerce_shipping_zone_methods).append(wp_mou_woocommerce_sessions, rhs.wp_mou_woocommerce_sessions).append(wp_mou_woocommerce_shipping_zones, rhs.wp_mou_woocommerce_shipping_zones).append(wp_mou_woocommerce_payment_tokens, rhs.wp_mou_woocommerce_payment_tokens).append(wp_mou_woocommerce_api_keys, rhs.wp_mou_woocommerce_api_keys).append(wp_mou_woocommerce_order_items, rhs.wp_mou_woocommerce_order_items).append(wp_mou_woocommerce_tax_rates, rhs.wp_mou_woocommerce_tax_rates).append(wp_mou_woocommerce_attribute_taxonomies, rhs.wp_mou_woocommerce_attribute_taxonomies).append(wp_mou_woocommerce_order_itemmeta, rhs.wp_mou_woocommerce_order_itemmeta).append(wp_mou_woocommerce_shipping_zone_locations, rhs.wp_mou_woocommerce_shipping_zone_locations).append(wp_mou_woocommerce_payment_tokenmeta, rhs.wp_mou_woocommerce_payment_tokenmeta).isEquals();
    }

}
