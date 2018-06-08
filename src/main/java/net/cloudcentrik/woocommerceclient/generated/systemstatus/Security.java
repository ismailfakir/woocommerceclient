
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Security implements Serializable
{

    @SerializedName("secure_connection")
    @Expose
    private boolean secure_connection;
    @SerializedName("hide_errors")
    @Expose
    private boolean hide_errors;
    private final static long serialVersionUID = -5860896774791935365L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Security() {
    }

    /**
     * 
     * @param hide_errors
     * @param secure_connection
     */
    public Security(boolean secure_connection, boolean hide_errors) {
        super();
        this.secure_connection = secure_connection;
        this.hide_errors = hide_errors;
    }

    public boolean isSecure_connection() {
        return secure_connection;
    }

    public void setSecure_connection(boolean secure_connection) {
        this.secure_connection = secure_connection;
    }

    public Security withSecure_connection(boolean secure_connection) {
        this.secure_connection = secure_connection;
        return this;
    }

    public boolean isHide_errors() {
        return hide_errors;
    }

    public void setHide_errors(boolean hide_errors) {
        this.hide_errors = hide_errors;
    }

    public Security withHide_errors(boolean hide_errors) {
        this.hide_errors = hide_errors;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("secure_connection", secure_connection).append("hide_errors", hide_errors).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hide_errors).append(secure_connection).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Security) == false) {
            return false;
        }
        Security rhs = ((Security) other);
        return new EqualsBuilder().append(hide_errors, rhs.hide_errors).append(secure_connection, rhs.secure_connection).isEquals();
    }

}
