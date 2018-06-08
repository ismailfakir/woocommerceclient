
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Page implements Serializable
{

    @SerializedName("page_name")
    @Expose
    private String page_name;
    @SerializedName("page_id")
    @Expose
    private String page_id;
    @SerializedName("page_set")
    @Expose
    private boolean page_set;
    @SerializedName("page_exists")
    @Expose
    private boolean page_exists;
    @SerializedName("page_visible")
    @Expose
    private boolean page_visible;
    @SerializedName("shortcode")
    @Expose
    private String shortcode;
    @SerializedName("shortcode_required")
    @Expose
    private boolean shortcode_required;
    @SerializedName("shortcode_present")
    @Expose
    private boolean shortcode_present;
    private final static long serialVersionUID = 5150103690741397627L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Page() {
    }

    /**
     * 
     * @param shortcode_present
     * @param shortcode_required
     * @param page_exists
     * @param page_id
     * @param shortcode
     * @param page_visible
     * @param page_set
     * @param page_name
     */
    public Page(String page_name, String page_id, boolean page_set, boolean page_exists, boolean page_visible, String shortcode, boolean shortcode_required, boolean shortcode_present) {
        super();
        this.page_name = page_name;
        this.page_id = page_id;
        this.page_set = page_set;
        this.page_exists = page_exists;
        this.page_visible = page_visible;
        this.shortcode = shortcode;
        this.shortcode_required = shortcode_required;
        this.shortcode_present = shortcode_present;
    }

    public String getPage_name() {
        return page_name;
    }

    public void setPage_name(String page_name) {
        this.page_name = page_name;
    }

    public Page withPage_name(String page_name) {
        this.page_name = page_name;
        return this;
    }

    public String getPage_id() {
        return page_id;
    }

    public void setPage_id(String page_id) {
        this.page_id = page_id;
    }

    public Page withPage_id(String page_id) {
        this.page_id = page_id;
        return this;
    }

    public boolean isPage_set() {
        return page_set;
    }

    public void setPage_set(boolean page_set) {
        this.page_set = page_set;
    }

    public Page withPage_set(boolean page_set) {
        this.page_set = page_set;
        return this;
    }

    public boolean isPage_exists() {
        return page_exists;
    }

    public void setPage_exists(boolean page_exists) {
        this.page_exists = page_exists;
    }

    public Page withPage_exists(boolean page_exists) {
        this.page_exists = page_exists;
        return this;
    }

    public boolean isPage_visible() {
        return page_visible;
    }

    public void setPage_visible(boolean page_visible) {
        this.page_visible = page_visible;
    }

    public Page withPage_visible(boolean page_visible) {
        this.page_visible = page_visible;
        return this;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public Page withShortcode(String shortcode) {
        this.shortcode = shortcode;
        return this;
    }

    public boolean isShortcode_required() {
        return shortcode_required;
    }

    public void setShortcode_required(boolean shortcode_required) {
        this.shortcode_required = shortcode_required;
    }

    public Page withShortcode_required(boolean shortcode_required) {
        this.shortcode_required = shortcode_required;
        return this;
    }

    public boolean isShortcode_present() {
        return shortcode_present;
    }

    public void setShortcode_present(boolean shortcode_present) {
        this.shortcode_present = shortcode_present;
    }

    public Page withShortcode_present(boolean shortcode_present) {
        this.shortcode_present = shortcode_present;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("page_name", page_name).append("page_id", page_id).append("page_set", page_set).append("page_exists", page_exists).append("page_visible", page_visible).append("shortcode", shortcode).append("shortcode_required", shortcode_required).append("shortcode_present", shortcode_present).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(shortcode_present).append(shortcode_required).append(page_exists).append(page_id).append(shortcode).append(page_visible).append(page_set).append(page_name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Page) == false) {
            return false;
        }
        Page rhs = ((Page) other);
        return new EqualsBuilder().append(shortcode_present, rhs.shortcode_present).append(shortcode_required, rhs.shortcode_required).append(page_exists, rhs.page_exists).append(page_id, rhs.page_id).append(shortcode, rhs.shortcode).append(page_visible, rhs.page_visible).append(page_set, rhs.page_set).append(page_name, rhs.page_name).isEquals();
    }

}
