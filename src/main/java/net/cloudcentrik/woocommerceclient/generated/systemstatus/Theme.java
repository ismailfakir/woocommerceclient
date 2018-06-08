
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Theme implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("version_latest")
    @Expose
    private String version_latest;
    @SerializedName("author_url")
    @Expose
    private String author_url;
    @SerializedName("is_child_theme")
    @Expose
    private boolean is_child_theme;
    @SerializedName("has_woocommerce_support")
    @Expose
    private boolean has_woocommerce_support;
    @SerializedName("has_woocommerce_file")
    @Expose
    private boolean has_woocommerce_file;
    @SerializedName("has_outdated_templates")
    @Expose
    private boolean has_outdated_templates;
    @SerializedName("overrides")
    @Expose
    @Valid
    private List<Object> overrides = new ArrayList<Object>();
    @SerializedName("parent_name")
    @Expose
    private String parent_name;
    @SerializedName("parent_version")
    @Expose
    private String parent_version;
    @SerializedName("parent_version_latest")
    @Expose
    private String parent_version_latest;
    @SerializedName("parent_author_url")
    @Expose
    private String parent_author_url;
    private final static long serialVersionUID = -8311288781136530005L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Theme() {
    }

    /**
     * 
     * @param parent_version
     * @param overrides
     * @param author_url
     * @param parent_version_latest
     * @param has_outdated_templates
     * @param version
     * @param has_woocommerce_file
     * @param name
     * @param version_latest
     * @param parent_name
     * @param parent_author_url
     * @param has_woocommerce_support
     * @param is_child_theme
     */
    public Theme(String name, String version, String version_latest, String author_url, boolean is_child_theme, boolean has_woocommerce_support, boolean has_woocommerce_file, boolean has_outdated_templates, List<Object> overrides, String parent_name, String parent_version, String parent_version_latest, String parent_author_url) {
        super();
        this.name = name;
        this.version = version;
        this.version_latest = version_latest;
        this.author_url = author_url;
        this.is_child_theme = is_child_theme;
        this.has_woocommerce_support = has_woocommerce_support;
        this.has_woocommerce_file = has_woocommerce_file;
        this.has_outdated_templates = has_outdated_templates;
        this.overrides = overrides;
        this.parent_name = parent_name;
        this.parent_version = parent_version;
        this.parent_version_latest = parent_version_latest;
        this.parent_author_url = parent_author_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Theme withName(String name) {
        this.name = name;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Theme withVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion_latest() {
        return version_latest;
    }

    public void setVersion_latest(String version_latest) {
        this.version_latest = version_latest;
    }

    public Theme withVersion_latest(String version_latest) {
        this.version_latest = version_latest;
        return this;
    }

    public String getAuthor_url() {
        return author_url;
    }

    public void setAuthor_url(String author_url) {
        this.author_url = author_url;
    }

    public Theme withAuthor_url(String author_url) {
        this.author_url = author_url;
        return this;
    }

    public boolean isIs_child_theme() {
        return is_child_theme;
    }

    public void setIs_child_theme(boolean is_child_theme) {
        this.is_child_theme = is_child_theme;
    }

    public Theme withIs_child_theme(boolean is_child_theme) {
        this.is_child_theme = is_child_theme;
        return this;
    }

    public boolean isHas_woocommerce_support() {
        return has_woocommerce_support;
    }

    public void setHas_woocommerce_support(boolean has_woocommerce_support) {
        this.has_woocommerce_support = has_woocommerce_support;
    }

    public Theme withHas_woocommerce_support(boolean has_woocommerce_support) {
        this.has_woocommerce_support = has_woocommerce_support;
        return this;
    }

    public boolean isHas_woocommerce_file() {
        return has_woocommerce_file;
    }

    public void setHas_woocommerce_file(boolean has_woocommerce_file) {
        this.has_woocommerce_file = has_woocommerce_file;
    }

    public Theme withHas_woocommerce_file(boolean has_woocommerce_file) {
        this.has_woocommerce_file = has_woocommerce_file;
        return this;
    }

    public boolean isHas_outdated_templates() {
        return has_outdated_templates;
    }

    public void setHas_outdated_templates(boolean has_outdated_templates) {
        this.has_outdated_templates = has_outdated_templates;
    }

    public Theme withHas_outdated_templates(boolean has_outdated_templates) {
        this.has_outdated_templates = has_outdated_templates;
        return this;
    }

    public List<Object> getOverrides() {
        return overrides;
    }

    public void setOverrides(List<Object> overrides) {
        this.overrides = overrides;
    }

    public Theme withOverrides(List<Object> overrides) {
        this.overrides = overrides;
        return this;
    }

    public String getParent_name() {
        return parent_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public Theme withParent_name(String parent_name) {
        this.parent_name = parent_name;
        return this;
    }

    public String getParent_version() {
        return parent_version;
    }

    public void setParent_version(String parent_version) {
        this.parent_version = parent_version;
    }

    public Theme withParent_version(String parent_version) {
        this.parent_version = parent_version;
        return this;
    }

    public String getParent_version_latest() {
        return parent_version_latest;
    }

    public void setParent_version_latest(String parent_version_latest) {
        this.parent_version_latest = parent_version_latest;
    }

    public Theme withParent_version_latest(String parent_version_latest) {
        this.parent_version_latest = parent_version_latest;
        return this;
    }

    public String getParent_author_url() {
        return parent_author_url;
    }

    public void setParent_author_url(String parent_author_url) {
        this.parent_author_url = parent_author_url;
    }

    public Theme withParent_author_url(String parent_author_url) {
        this.parent_author_url = parent_author_url;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("version", version).append("version_latest", version_latest).append("author_url", author_url).append("is_child_theme", is_child_theme).append("has_woocommerce_support", has_woocommerce_support).append("has_woocommerce_file", has_woocommerce_file).append("has_outdated_templates", has_outdated_templates).append("overrides", overrides).append("parent_name", parent_name).append("parent_version", parent_version).append("parent_version_latest", parent_version_latest).append("parent_author_url", parent_author_url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(parent_version).append(overrides).append(author_url).append(parent_version_latest).append(has_outdated_templates).append(version).append(has_woocommerce_file).append(version_latest).append(name).append(parent_name).append(parent_author_url).append(has_woocommerce_support).append(is_child_theme).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Theme) == false) {
            return false;
        }
        Theme rhs = ((Theme) other);
        return new EqualsBuilder().append(parent_version, rhs.parent_version).append(overrides, rhs.overrides).append(author_url, rhs.author_url).append(parent_version_latest, rhs.parent_version_latest).append(has_outdated_templates, rhs.has_outdated_templates).append(version, rhs.version).append(has_woocommerce_file, rhs.has_woocommerce_file).append(version_latest, rhs.version_latest).append(name, rhs.name).append(parent_name, rhs.parent_name).append(parent_author_url, rhs.parent_author_url).append(has_woocommerce_support, rhs.has_woocommerce_support).append(is_child_theme, rhs.is_child_theme).isEquals();
    }

}
