
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Taxonomies implements Serializable
{

    @SerializedName("external")
    @Expose
    private String external;
    @SerializedName("grouped")
    @Expose
    private String grouped;
    @SerializedName("simple")
    @Expose
    private String simple;
    @SerializedName("variable")
    @Expose
    private String variable;
    private final static long serialVersionUID = 5790446524540659620L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Taxonomies() {
    }

    /**
     * 
     * @param simple
     * @param grouped
     * @param external
     * @param variable
     */
    public Taxonomies(String external, String grouped, String simple, String variable) {
        super();
        this.external = external;
        this.grouped = grouped;
        this.simple = simple;
        this.variable = variable;
    }

    public String getExternal() {
        return external;
    }

    public void setExternal(String external) {
        this.external = external;
    }

    public Taxonomies withExternal(String external) {
        this.external = external;
        return this;
    }

    public String getGrouped() {
        return grouped;
    }

    public void setGrouped(String grouped) {
        this.grouped = grouped;
    }

    public Taxonomies withGrouped(String grouped) {
        this.grouped = grouped;
        return this;
    }

    public String getSimple() {
        return simple;
    }

    public void setSimple(String simple) {
        this.simple = simple;
    }

    public Taxonomies withSimple(String simple) {
        this.simple = simple;
        return this;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public Taxonomies withVariable(String variable) {
        this.variable = variable;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("external", external).append("grouped", grouped).append("simple", simple).append("variable", variable).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(simple).append(grouped).append(external).append(variable).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Taxonomies) == false) {
            return false;
        }
        Taxonomies rhs = ((Taxonomies) other);
        return new EqualsBuilder().append(simple, rhs.simple).append(grouped, rhs.grouped).append(external, rhs.external).append(variable, rhs.variable).isEquals();
    }

}
