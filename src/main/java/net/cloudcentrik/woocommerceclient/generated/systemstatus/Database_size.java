
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Database_size implements Serializable
{

    @SerializedName("data")
    @Expose
    private double data;
    @SerializedName("index")
    @Expose
    private double index;
    private final static long serialVersionUID = -15454513718642886L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Database_size() {
    }

    /**
     * 
     * @param index
     * @param data
     */
    public Database_size(double data, double index) {
        super();
        this.data = data;
        this.index = index;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public Database_size withData(double data) {
        this.data = data;
        return this;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    public Database_size withIndex(double index) {
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
        if ((other instanceof Database_size) == false) {
            return false;
        }
        Database_size rhs = ((Database_size) other);
        return new EqualsBuilder().append(index, rhs.index).append(data, rhs.data).isEquals();
    }

}
