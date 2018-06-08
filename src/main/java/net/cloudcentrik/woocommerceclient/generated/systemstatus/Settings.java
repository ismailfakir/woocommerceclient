
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Settings implements Serializable
{

    @SerializedName("api_enabled")
    @Expose
    private boolean api_enabled;
    @SerializedName("force_ssl")
    @Expose
    private boolean force_ssl;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("currency_symbol")
    @Expose
    private String currency_symbol;
    @SerializedName("currency_position")
    @Expose
    private String currency_position;
    @SerializedName("thousand_separator")
    @Expose
    private String thousand_separator;
    @SerializedName("decimal_separator")
    @Expose
    private String decimal_separator;
    @SerializedName("number_of_decimals")
    @Expose
    private long number_of_decimals;
    @SerializedName("geolocation_enabled")
    @Expose
    private boolean geolocation_enabled;
    @SerializedName("taxonomies")
    @Expose
    @Valid
    private Taxonomies taxonomies;
    @SerializedName("product_visibility_terms")
    @Expose
    @Valid
    private Product_visibility_terms product_visibility_terms;
    private final static long serialVersionUID = -8776285091261613545L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Settings() {
    }

    /**
     * 
     * @param number_of_decimals
     * @param thousand_separator
     * @param product_visibility_terms
     * @param api_enabled
     * @param decimal_separator
     * @param currency_symbol
     * @param geolocation_enabled
     * @param currency_position
     * @param force_ssl
     * @param taxonomies
     * @param currency
     */
    public Settings(boolean api_enabled, boolean force_ssl, String currency, String currency_symbol, String currency_position, String thousand_separator, String decimal_separator, long number_of_decimals, boolean geolocation_enabled, Taxonomies taxonomies, Product_visibility_terms product_visibility_terms) {
        super();
        this.api_enabled = api_enabled;
        this.force_ssl = force_ssl;
        this.currency = currency;
        this.currency_symbol = currency_symbol;
        this.currency_position = currency_position;
        this.thousand_separator = thousand_separator;
        this.decimal_separator = decimal_separator;
        this.number_of_decimals = number_of_decimals;
        this.geolocation_enabled = geolocation_enabled;
        this.taxonomies = taxonomies;
        this.product_visibility_terms = product_visibility_terms;
    }

    public boolean isApi_enabled() {
        return api_enabled;
    }

    public void setApi_enabled(boolean api_enabled) {
        this.api_enabled = api_enabled;
    }

    public Settings withApi_enabled(boolean api_enabled) {
        this.api_enabled = api_enabled;
        return this;
    }

    public boolean isForce_ssl() {
        return force_ssl;
    }

    public void setForce_ssl(boolean force_ssl) {
        this.force_ssl = force_ssl;
    }

    public Settings withForce_ssl(boolean force_ssl) {
        this.force_ssl = force_ssl;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Settings withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getCurrency_symbol() {
        return currency_symbol;
    }

    public void setCurrency_symbol(String currency_symbol) {
        this.currency_symbol = currency_symbol;
    }

    public Settings withCurrency_symbol(String currency_symbol) {
        this.currency_symbol = currency_symbol;
        return this;
    }

    public String getCurrency_position() {
        return currency_position;
    }

    public void setCurrency_position(String currency_position) {
        this.currency_position = currency_position;
    }

    public Settings withCurrency_position(String currency_position) {
        this.currency_position = currency_position;
        return this;
    }

    public String getThousand_separator() {
        return thousand_separator;
    }

    public void setThousand_separator(String thousand_separator) {
        this.thousand_separator = thousand_separator;
    }

    public Settings withThousand_separator(String thousand_separator) {
        this.thousand_separator = thousand_separator;
        return this;
    }

    public String getDecimal_separator() {
        return decimal_separator;
    }

    public void setDecimal_separator(String decimal_separator) {
        this.decimal_separator = decimal_separator;
    }

    public Settings withDecimal_separator(String decimal_separator) {
        this.decimal_separator = decimal_separator;
        return this;
    }

    public long getNumber_of_decimals() {
        return number_of_decimals;
    }

    public void setNumber_of_decimals(long number_of_decimals) {
        this.number_of_decimals = number_of_decimals;
    }

    public Settings withNumber_of_decimals(long number_of_decimals) {
        this.number_of_decimals = number_of_decimals;
        return this;
    }

    public boolean isGeolocation_enabled() {
        return geolocation_enabled;
    }

    public void setGeolocation_enabled(boolean geolocation_enabled) {
        this.geolocation_enabled = geolocation_enabled;
    }

    public Settings withGeolocation_enabled(boolean geolocation_enabled) {
        this.geolocation_enabled = geolocation_enabled;
        return this;
    }

    public Taxonomies getTaxonomies() {
        return taxonomies;
    }

    public void setTaxonomies(Taxonomies taxonomies) {
        this.taxonomies = taxonomies;
    }

    public Settings withTaxonomies(Taxonomies taxonomies) {
        this.taxonomies = taxonomies;
        return this;
    }

    public Product_visibility_terms getProduct_visibility_terms() {
        return product_visibility_terms;
    }

    public void setProduct_visibility_terms(Product_visibility_terms product_visibility_terms) {
        this.product_visibility_terms = product_visibility_terms;
    }

    public Settings withProduct_visibility_terms(Product_visibility_terms product_visibility_terms) {
        this.product_visibility_terms = product_visibility_terms;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("api_enabled", api_enabled).append("force_ssl", force_ssl).append("currency", currency).append("currency_symbol", currency_symbol).append("currency_position", currency_position).append("thousand_separator", thousand_separator).append("decimal_separator", decimal_separator).append("number_of_decimals", number_of_decimals).append("geolocation_enabled", geolocation_enabled).append("taxonomies", taxonomies).append("product_visibility_terms", product_visibility_terms).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(number_of_decimals).append(thousand_separator).append(product_visibility_terms).append(api_enabled).append(decimal_separator).append(currency_symbol).append(geolocation_enabled).append(currency_position).append(force_ssl).append(taxonomies).append(currency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Settings) == false) {
            return false;
        }
        Settings rhs = ((Settings) other);
        return new EqualsBuilder().append(number_of_decimals, rhs.number_of_decimals).append(thousand_separator, rhs.thousand_separator).append(product_visibility_terms, rhs.product_visibility_terms).append(api_enabled, rhs.api_enabled).append(decimal_separator, rhs.decimal_separator).append(currency_symbol, rhs.currency_symbol).append(geolocation_enabled, rhs.geolocation_enabled).append(currency_position, rhs.currency_position).append(force_ssl, rhs.force_ssl).append(taxonomies, rhs.taxonomies).append(currency, rhs.currency).isEquals();
    }

}
