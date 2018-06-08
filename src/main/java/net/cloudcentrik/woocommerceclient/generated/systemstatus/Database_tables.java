
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Database_tables implements Serializable
{

    @SerializedName("woocommerce")
    @Expose
    @Valid
    private Woocommerce woocommerce;
    @SerializedName("other")
    @Expose
    @Valid
    private Other other;
    private final static long serialVersionUID = 3670197226230873500L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Database_tables() {
    }

    /**
     * 
     * @param woocommerce
     * @param other
     */
    public Database_tables(Woocommerce woocommerce, Other other) {
        super();
        this.woocommerce = woocommerce;
        this.other = other;
    }

    public Woocommerce getWoocommerce() {
        return woocommerce;
    }

    public void setWoocommerce(Woocommerce woocommerce) {
        this.woocommerce = woocommerce;
    }

    public Database_tables withWoocommerce(Woocommerce woocommerce) {
        this.woocommerce = woocommerce;
        return this;
    }

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public Database_tables withOther(Other other) {
        this.other = other;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("woocommerce", woocommerce).append("other", other).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(woocommerce).append(other).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Database_tables) == false) {
            return false;
        }
        Database_tables rhs = ((Database_tables) other);
        return new EqualsBuilder().append(woocommerce, rhs.woocommerce).append(other, rhs.other).isEquals();
    }

}
