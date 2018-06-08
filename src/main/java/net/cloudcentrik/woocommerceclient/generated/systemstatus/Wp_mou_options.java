
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Wp_mou_options implements Serializable
{

    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("index")
    @Expose
    private String index;
    private final static long serialVersionUID = -2156316160500360L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wp_mou_options() {
    }

    /**
     * 
     * @param index
     * @param data
     */
    public Wp_mou_options(String data, String index) {
        super();
        this.data = data;
        this.index = index;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Wp_mou_options withData(String data) {
        this.data = data;
        return this;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Wp_mou_options withIndex(String index) {
        this.index = index;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("data", data).append("index", index).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(index).append(data).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Wp_mou_options) == false) {
            return false;
        }
        Wp_mou_options rhs = ((Wp_mou_options) other);
        return new EqualsBuilder().append(index, rhs.index).append(data, rhs.data).isEquals();
    }

}
