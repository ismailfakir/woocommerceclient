
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Product_visibility_terms implements Serializable
{

    @SerializedName("exclude-from-catalog")
    @Expose
    private String exclude_from_catalog;
    @SerializedName("exclude-from-search")
    @Expose
    private String exclude_from_search;
    @SerializedName("featured")
    @Expose
    private String featured;
    @SerializedName("outofstock")
    @Expose
    private String outofstock;
    @SerializedName("rated-1")
    @Expose
    private String rated_1;
    @SerializedName("rated-2")
    @Expose
    private String rated_2;
    @SerializedName("rated-3")
    @Expose
    private String rated_3;
    @SerializedName("rated-4")
    @Expose
    private String rated_4;
    @SerializedName("rated-5")
    @Expose
    private String rated_5;
    private final static long serialVersionUID = -2881256224977800087L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product_visibility_terms() {
    }

    /**
     * 
     * @param rated_1
     * @param rated_2
     * @param exclude_from_catalog
     * @param outofstock
     * @param exclude_from_search
     * @param featured
     * @param rated_5
     * @param rated_3
     * @param rated_4
     */
    public Product_visibility_terms(String exclude_from_catalog, String exclude_from_search, String featured, String outofstock, String rated_1, String rated_2, String rated_3, String rated_4, String rated_5) {
        super();
        this.exclude_from_catalog = exclude_from_catalog;
        this.exclude_from_search = exclude_from_search;
        this.featured = featured;
        this.outofstock = outofstock;
        this.rated_1 = rated_1;
        this.rated_2 = rated_2;
        this.rated_3 = rated_3;
        this.rated_4 = rated_4;
        this.rated_5 = rated_5;
    }

    public String getExclude_from_catalog() {
        return exclude_from_catalog;
    }

    public void setExclude_from_catalog(String exclude_from_catalog) {
        this.exclude_from_catalog = exclude_from_catalog;
    }

    public Product_visibility_terms withExclude_from_catalog(String exclude_from_catalog) {
        this.exclude_from_catalog = exclude_from_catalog;
        return this;
    }

    public String getExclude_from_search() {
        return exclude_from_search;
    }

    public void setExclude_from_search(String exclude_from_search) {
        this.exclude_from_search = exclude_from_search;
    }

    public Product_visibility_terms withExclude_from_search(String exclude_from_search) {
        this.exclude_from_search = exclude_from_search;
        return this;
    }

    public String getFeatured() {
        return featured;
    }

    public void setFeatured(String featured) {
        this.featured = featured;
    }

    public Product_visibility_terms withFeatured(String featured) {
        this.featured = featured;
        return this;
    }

    public String getOutofstock() {
        return outofstock;
    }

    public void setOutofstock(String outofstock) {
        this.outofstock = outofstock;
    }

    public Product_visibility_terms withOutofstock(String outofstock) {
        this.outofstock = outofstock;
        return this;
    }

    public String getRated_1() {
        return rated_1;
    }

    public void setRated_1(String rated_1) {
        this.rated_1 = rated_1;
    }

    public Product_visibility_terms withRated_1(String rated_1) {
        this.rated_1 = rated_1;
        return this;
    }

    public String getRated_2() {
        return rated_2;
    }

    public void setRated_2(String rated_2) {
        this.rated_2 = rated_2;
    }

    public Product_visibility_terms withRated_2(String rated_2) {
        this.rated_2 = rated_2;
        return this;
    }

    public String getRated_3() {
        return rated_3;
    }

    public void setRated_3(String rated_3) {
        this.rated_3 = rated_3;
    }

    public Product_visibility_terms withRated_3(String rated_3) {
        this.rated_3 = rated_3;
        return this;
    }

    public String getRated_4() {
        return rated_4;
    }

    public void setRated_4(String rated_4) {
        this.rated_4 = rated_4;
    }

    public Product_visibility_terms withRated_4(String rated_4) {
        this.rated_4 = rated_4;
        return this;
    }

    public String getRated_5() {
        return rated_5;
    }

    public void setRated_5(String rated_5) {
        this.rated_5 = rated_5;
    }

    public Product_visibility_terms withRated_5(String rated_5) {
        this.rated_5 = rated_5;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("exclude_from_catalog", exclude_from_catalog).append("exclude_from_search", exclude_from_search).append("featured", featured).append("outofstock", outofstock).append("rated_1", rated_1).append("rated_2", rated_2).append("rated_3", rated_3).append("rated_4", rated_4).append("rated_5", rated_5).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rated_1).append(rated_2).append(exclude_from_catalog).append(outofstock).append(exclude_from_search).append(featured).append(rated_5).append(rated_3).append(rated_4).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product_visibility_terms) == false) {
            return false;
        }
        Product_visibility_terms rhs = ((Product_visibility_terms) other);
        return new EqualsBuilder().append(rated_1, rhs.rated_1).append(rated_2, rhs.rated_2).append(exclude_from_catalog, rhs.exclude_from_catalog).append(outofstock, rhs.outofstock).append(exclude_from_search, rhs.exclude_from_search).append(featured, rhs.featured).append(rated_5, rhs.rated_5).append(rated_3, rhs.rated_3).append(rated_4, rhs.rated_4).isEquals();
    }

}
