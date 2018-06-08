
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

public class SystemStatus implements Serializable
{

    @SerializedName("environment")
    @Expose
    @Valid
    private Environment environment;
    @SerializedName("database")
    @Expose
    @Valid
    private Database database;
    @SerializedName("active_plugins")
    @Expose
    @Valid
    private List<Active_plugin> active_plugins = new ArrayList<Active_plugin>();
    @SerializedName("theme")
    @Expose
    @Valid
    private Theme theme;
    @SerializedName("settings")
    @Expose
    @Valid
    private Settings settings;
    @SerializedName("security")
    @Expose
    @Valid
    private Security security;
    @SerializedName("pages")
    @Expose
    @Valid
    private List<Page> pages = new ArrayList<Page>();
    private final static long serialVersionUID = -3258297568388866986L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SystemStatus() {
    }

    /**
     * 
     * @param environment
     * @param pages
     * @param settings
     * @param theme
     * @param active_plugins
     * @param security
     * @param database
     */
    public SystemStatus(Environment environment, Database database, List<Active_plugin> active_plugins, Theme theme, Settings settings, Security security, List<Page> pages) {
        super();
        this.environment = environment;
        this.database = database;
        this.active_plugins = active_plugins;
        this.theme = theme;
        this.settings = settings;
        this.security = security;
        this.pages = pages;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public SystemStatus withEnvironment(Environment environment) {
        this.environment = environment;
        return this;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public SystemStatus withDatabase(Database database) {
        this.database = database;
        return this;
    }

    public List<Active_plugin> getActive_plugins() {
        return active_plugins;
    }

    public void setActive_plugins(List<Active_plugin> active_plugins) {
        this.active_plugins = active_plugins;
    }

    public SystemStatus withActive_plugins(List<Active_plugin> active_plugins) {
        this.active_plugins = active_plugins;
        return this;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public SystemStatus withTheme(Theme theme) {
        this.theme = theme;
        return this;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public SystemStatus withSettings(Settings settings) {
        this.settings = settings;
        return this;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public SystemStatus withSecurity(Security security) {
        this.security = security;
        return this;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public SystemStatus withPages(List<Page> pages) {
        this.pages = pages;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("environment", environment).append("database", database).append("active_plugins", active_plugins).append("theme", theme).append("settings", settings).append("security", security).append("pages", pages).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(environment).append(pages).append(settings).append(theme).append(active_plugins).append(security).append(database).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemStatus) == false) {
            return false;
        }
        SystemStatus rhs = ((SystemStatus) other);
        return new EqualsBuilder().append(environment, rhs.environment).append(pages, rhs.pages).append(settings, rhs.settings).append(theme, rhs.theme).append(active_plugins, rhs.active_plugins).append(security, rhs.security).append(database, rhs.database).isEquals();
    }

}
