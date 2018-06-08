
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Active_plugin implements Serializable
{

    @SerializedName("plugin")
    @Expose
    private String plugin;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("version_latest")
    @Expose
    private String version_latest;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("author_name")
    @Expose
    private String author_name;
    @SerializedName("author_url")
    @Expose
    private String author_url;
    @SerializedName("network_activated")
    @Expose
    private boolean network_activated;
    private final static long serialVersionUID = -2827120428703203298L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Active_plugin() {
    }

    /**
     * 
     * @param network_activated
     * @param author_url
     * @param version_latest
     * @param name
     * @param author_name
     * @param url
     * @param plugin
     * @param version
     */
    public Active_plugin(String plugin, String name, String version, String version_latest, String url, String author_name, String author_url, boolean network_activated) {
        super();
        this.plugin = plugin;
        this.name = name;
        this.version = version;
        this.version_latest = version_latest;
        this.url = url;
        this.author_name = author_name;
        this.author_url = author_url;
        this.network_activated = network_activated;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    public Active_plugin withPlugin(String plugin) {
        this.plugin = plugin;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Active_plugin withName(String name) {
        this.name = name;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Active_plugin withVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion_latest() {
        return version_latest;
    }

    public void setVersion_latest(String version_latest) {
        this.version_latest = version_latest;
    }

    public Active_plugin withVersion_latest(String version_latest) {
        this.version_latest = version_latest;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Active_plugin withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Active_plugin withAuthor_name(String author_name) {
        this.author_name = author_name;
        return this;
    }

    public String getAuthor_url() {
        return author_url;
    }

    public void setAuthor_url(String author_url) {
        this.author_url = author_url;
    }

    public Active_plugin withAuthor_url(String author_url) {
        this.author_url = author_url;
        return this;
    }

    public boolean isNetwork_activated() {
        return network_activated;
    }

    public void setNetwork_activated(boolean network_activated) {
        this.network_activated = network_activated;
    }

    public Active_plugin withNetwork_activated(boolean network_activated) {
        this.network_activated = network_activated;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("plugin", plugin).append("name", name).append("version", version).append("version_latest", version_latest).append("url", url).append("author_name", author_name).append("author_url", author_url).append("network_activated", network_activated).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(network_activated).append(author_url).append(version_latest).append(name).append(author_name).append(url).append(plugin).append(version).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Active_plugin) == false) {
            return false;
        }
        Active_plugin rhs = ((Active_plugin) other);
        return new EqualsBuilder().append(network_activated, rhs.network_activated).append(author_url, rhs.author_url).append(version_latest, rhs.version_latest).append(name, rhs.name).append(author_name, rhs.author_name).append(url, rhs.url).append(plugin, rhs.plugin).append(version, rhs.version).isEquals();
    }

}
