
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Environment implements Serializable
{

    @SerializedName("home_url")
    @Expose
    private String home_url;
    @SerializedName("site_url")
    @Expose
    private String site_url;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("log_directory")
    @Expose
    private String log_directory;
    @SerializedName("log_directory_writable")
    @Expose
    private boolean log_directory_writable;
    @SerializedName("wp_version")
    @Expose
    private String wp_version;
    @SerializedName("wp_multisite")
    @Expose
    private boolean wp_multisite;
    @SerializedName("wp_memory_limit")
    @Expose
    private long wp_memory_limit;
    @SerializedName("wp_debug_mode")
    @Expose
    private boolean wp_debug_mode;
    @SerializedName("wp_cron")
    @Expose
    private boolean wp_cron;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("server_info")
    @Expose
    private String server_info;
    @SerializedName("php_version")
    @Expose
    private String php_version;
    @SerializedName("php_post_max_size")
    @Expose
    private long php_post_max_size;
    @SerializedName("php_max_execution_time")
    @Expose
    private long php_max_execution_time;
    @SerializedName("php_max_input_vars")
    @Expose
    private long php_max_input_vars;
    @SerializedName("curl_version")
    @Expose
    private String curl_version;
    @SerializedName("suhosin_installed")
    @Expose
    private boolean suhosin_installed;
    @SerializedName("max_upload_size")
    @Expose
    private long max_upload_size;
    @SerializedName("mysql_version")
    @Expose
    private String mysql_version;
    @SerializedName("default_timezone")
    @Expose
    private String default_timezone;
    @SerializedName("fsockopen_or_curl_enabled")
    @Expose
    private boolean fsockopen_or_curl_enabled;
    @SerializedName("soapclient_enabled")
    @Expose
    private boolean soapclient_enabled;
    @SerializedName("domdocument_enabled")
    @Expose
    private boolean domdocument_enabled;
    @SerializedName("gzip_enabled")
    @Expose
    private boolean gzip_enabled;
    @SerializedName("mbstring_enabled")
    @Expose
    private boolean mbstring_enabled;
    @SerializedName("remote_post_successful")
    @Expose
    private boolean remote_post_successful;
    @SerializedName("remote_post_response")
    @Expose
    private String remote_post_response;
    @SerializedName("remote_get_successful")
    @Expose
    private boolean remote_get_successful;
    @SerializedName("remote_get_response")
    @Expose
    private String remote_get_response;
    private final static long serialVersionUID = 8914877387006738676L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Environment() {
    }

    /**
     * 
     * @param fsockopen_or_curl_enabled
     * @param remote_get_response
     * @param wp_multisite
     * @param soapclient_enabled
     * @param remote_get_successful
     * @param wp_version
     * @param php_post_max_size
     * @param default_timezone
     * @param version
     * @param server_info
     * @param mysql_version
     * @param log_directory_writable
     * @param max_upload_size
     * @param gzip_enabled
     * @param suhosin_installed
     * @param site_url
     * @param domdocument_enabled
     * @param wp_memory_limit
     * @param curl_version
     * @param mbstring_enabled
     * @param home_url
     * @param remote_post_successful
     * @param log_directory
     * @param php_max_execution_time
     * @param wp_cron
     * @param php_version
     * @param php_max_input_vars
     * @param language
     * @param wp_debug_mode
     * @param remote_post_response
     */
    public Environment(String home_url, String site_url, String version, String log_directory, boolean log_directory_writable, String wp_version, boolean wp_multisite, long wp_memory_limit, boolean wp_debug_mode, boolean wp_cron, String language, String server_info, String php_version, long php_post_max_size, long php_max_execution_time, long php_max_input_vars, String curl_version, boolean suhosin_installed, long max_upload_size, String mysql_version, String default_timezone, boolean fsockopen_or_curl_enabled, boolean soapclient_enabled, boolean domdocument_enabled, boolean gzip_enabled, boolean mbstring_enabled, boolean remote_post_successful, String remote_post_response, boolean remote_get_successful, String remote_get_response) {
        super();
        this.home_url = home_url;
        this.site_url = site_url;
        this.version = version;
        this.log_directory = log_directory;
        this.log_directory_writable = log_directory_writable;
        this.wp_version = wp_version;
        this.wp_multisite = wp_multisite;
        this.wp_memory_limit = wp_memory_limit;
        this.wp_debug_mode = wp_debug_mode;
        this.wp_cron = wp_cron;
        this.language = language;
        this.server_info = server_info;
        this.php_version = php_version;
        this.php_post_max_size = php_post_max_size;
        this.php_max_execution_time = php_max_execution_time;
        this.php_max_input_vars = php_max_input_vars;
        this.curl_version = curl_version;
        this.suhosin_installed = suhosin_installed;
        this.max_upload_size = max_upload_size;
        this.mysql_version = mysql_version;
        this.default_timezone = default_timezone;
        this.fsockopen_or_curl_enabled = fsockopen_or_curl_enabled;
        this.soapclient_enabled = soapclient_enabled;
        this.domdocument_enabled = domdocument_enabled;
        this.gzip_enabled = gzip_enabled;
        this.mbstring_enabled = mbstring_enabled;
        this.remote_post_successful = remote_post_successful;
        this.remote_post_response = remote_post_response;
        this.remote_get_successful = remote_get_successful;
        this.remote_get_response = remote_get_response;
    }

    public String getHome_url() {
        return home_url;
    }

    public void setHome_url(String home_url) {
        this.home_url = home_url;
    }

    public Environment withHome_url(String home_url) {
        this.home_url = home_url;
        return this;
    }

    public String getSite_url() {
        return site_url;
    }

    public void setSite_url(String site_url) {
        this.site_url = site_url;
    }

    public Environment withSite_url(String site_url) {
        this.site_url = site_url;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Environment withVersion(String version) {
        this.version = version;
        return this;
    }

    public String getLog_directory() {
        return log_directory;
    }

    public void setLog_directory(String log_directory) {
        this.log_directory = log_directory;
    }

    public Environment withLog_directory(String log_directory) {
        this.log_directory = log_directory;
        return this;
    }

    public boolean isLog_directory_writable() {
        return log_directory_writable;
    }

    public void setLog_directory_writable(boolean log_directory_writable) {
        this.log_directory_writable = log_directory_writable;
    }

    public Environment withLog_directory_writable(boolean log_directory_writable) {
        this.log_directory_writable = log_directory_writable;
        return this;
    }

    public String getWp_version() {
        return wp_version;
    }

    public void setWp_version(String wp_version) {
        this.wp_version = wp_version;
    }

    public Environment withWp_version(String wp_version) {
        this.wp_version = wp_version;
        return this;
    }

    public boolean isWp_multisite() {
        return wp_multisite;
    }

    public void setWp_multisite(boolean wp_multisite) {
        this.wp_multisite = wp_multisite;
    }

    public Environment withWp_multisite(boolean wp_multisite) {
        this.wp_multisite = wp_multisite;
        return this;
    }

    public long getWp_memory_limit() {
        return wp_memory_limit;
    }

    public void setWp_memory_limit(long wp_memory_limit) {
        this.wp_memory_limit = wp_memory_limit;
    }

    public Environment withWp_memory_limit(long wp_memory_limit) {
        this.wp_memory_limit = wp_memory_limit;
        return this;
    }

    public boolean isWp_debug_mode() {
        return wp_debug_mode;
    }

    public void setWp_debug_mode(boolean wp_debug_mode) {
        this.wp_debug_mode = wp_debug_mode;
    }

    public Environment withWp_debug_mode(boolean wp_debug_mode) {
        this.wp_debug_mode = wp_debug_mode;
        return this;
    }

    public boolean isWp_cron() {
        return wp_cron;
    }

    public void setWp_cron(boolean wp_cron) {
        this.wp_cron = wp_cron;
    }

    public Environment withWp_cron(boolean wp_cron) {
        this.wp_cron = wp_cron;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Environment withLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getServer_info() {
        return server_info;
    }

    public void setServer_info(String server_info) {
        this.server_info = server_info;
    }

    public Environment withServer_info(String server_info) {
        this.server_info = server_info;
        return this;
    }

    public String getPhp_version() {
        return php_version;
    }

    public void setPhp_version(String php_version) {
        this.php_version = php_version;
    }

    public Environment withPhp_version(String php_version) {
        this.php_version = php_version;
        return this;
    }

    public long getPhp_post_max_size() {
        return php_post_max_size;
    }

    public void setPhp_post_max_size(long php_post_max_size) {
        this.php_post_max_size = php_post_max_size;
    }

    public Environment withPhp_post_max_size(long php_post_max_size) {
        this.php_post_max_size = php_post_max_size;
        return this;
    }

    public long getPhp_max_execution_time() {
        return php_max_execution_time;
    }

    public void setPhp_max_execution_time(long php_max_execution_time) {
        this.php_max_execution_time = php_max_execution_time;
    }

    public Environment withPhp_max_execution_time(long php_max_execution_time) {
        this.php_max_execution_time = php_max_execution_time;
        return this;
    }

    public long getPhp_max_input_vars() {
        return php_max_input_vars;
    }

    public void setPhp_max_input_vars(long php_max_input_vars) {
        this.php_max_input_vars = php_max_input_vars;
    }

    public Environment withPhp_max_input_vars(long php_max_input_vars) {
        this.php_max_input_vars = php_max_input_vars;
        return this;
    }

    public String getCurl_version() {
        return curl_version;
    }

    public void setCurl_version(String curl_version) {
        this.curl_version = curl_version;
    }

    public Environment withCurl_version(String curl_version) {
        this.curl_version = curl_version;
        return this;
    }

    public boolean isSuhosin_installed() {
        return suhosin_installed;
    }

    public void setSuhosin_installed(boolean suhosin_installed) {
        this.suhosin_installed = suhosin_installed;
    }

    public Environment withSuhosin_installed(boolean suhosin_installed) {
        this.suhosin_installed = suhosin_installed;
        return this;
    }

    public long getMax_upload_size() {
        return max_upload_size;
    }

    public void setMax_upload_size(long max_upload_size) {
        this.max_upload_size = max_upload_size;
    }

    public Environment withMax_upload_size(long max_upload_size) {
        this.max_upload_size = max_upload_size;
        return this;
    }

    public String getMysql_version() {
        return mysql_version;
    }

    public void setMysql_version(String mysql_version) {
        this.mysql_version = mysql_version;
    }

    public Environment withMysql_version(String mysql_version) {
        this.mysql_version = mysql_version;
        return this;
    }

    public String getDefault_timezone() {
        return default_timezone;
    }

    public void setDefault_timezone(String default_timezone) {
        this.default_timezone = default_timezone;
    }

    public Environment withDefault_timezone(String default_timezone) {
        this.default_timezone = default_timezone;
        return this;
    }

    public boolean isFsockopen_or_curl_enabled() {
        return fsockopen_or_curl_enabled;
    }

    public void setFsockopen_or_curl_enabled(boolean fsockopen_or_curl_enabled) {
        this.fsockopen_or_curl_enabled = fsockopen_or_curl_enabled;
    }

    public Environment withFsockopen_or_curl_enabled(boolean fsockopen_or_curl_enabled) {
        this.fsockopen_or_curl_enabled = fsockopen_or_curl_enabled;
        return this;
    }

    public boolean isSoapclient_enabled() {
        return soapclient_enabled;
    }

    public void setSoapclient_enabled(boolean soapclient_enabled) {
        this.soapclient_enabled = soapclient_enabled;
    }

    public Environment withSoapclient_enabled(boolean soapclient_enabled) {
        this.soapclient_enabled = soapclient_enabled;
        return this;
    }

    public boolean isDomdocument_enabled() {
        return domdocument_enabled;
    }

    public void setDomdocument_enabled(boolean domdocument_enabled) {
        this.domdocument_enabled = domdocument_enabled;
    }

    public Environment withDomdocument_enabled(boolean domdocument_enabled) {
        this.domdocument_enabled = domdocument_enabled;
        return this;
    }

    public boolean isGzip_enabled() {
        return gzip_enabled;
    }

    public void setGzip_enabled(boolean gzip_enabled) {
        this.gzip_enabled = gzip_enabled;
    }

    public Environment withGzip_enabled(boolean gzip_enabled) {
        this.gzip_enabled = gzip_enabled;
        return this;
    }

    public boolean isMbstring_enabled() {
        return mbstring_enabled;
    }

    public void setMbstring_enabled(boolean mbstring_enabled) {
        this.mbstring_enabled = mbstring_enabled;
    }

    public Environment withMbstring_enabled(boolean mbstring_enabled) {
        this.mbstring_enabled = mbstring_enabled;
        return this;
    }

    public boolean isRemote_post_successful() {
        return remote_post_successful;
    }

    public void setRemote_post_successful(boolean remote_post_successful) {
        this.remote_post_successful = remote_post_successful;
    }

    public Environment withRemote_post_successful(boolean remote_post_successful) {
        this.remote_post_successful = remote_post_successful;
        return this;
    }

    public String getRemote_post_response() {
        return remote_post_response;
    }

    public void setRemote_post_response(String remote_post_response) {
        this.remote_post_response = remote_post_response;
    }

    public Environment withRemote_post_response(String remote_post_response) {
        this.remote_post_response = remote_post_response;
        return this;
    }

    public boolean isRemote_get_successful() {
        return remote_get_successful;
    }

    public void setRemote_get_successful(boolean remote_get_successful) {
        this.remote_get_successful = remote_get_successful;
    }

    public Environment withRemote_get_successful(boolean remote_get_successful) {
        this.remote_get_successful = remote_get_successful;
        return this;
    }

    public String getRemote_get_response() {
        return remote_get_response;
    }

    public void setRemote_get_response(String remote_get_response) {
        this.remote_get_response = remote_get_response;
    }

    public Environment withRemote_get_response(String remote_get_response) {
        this.remote_get_response = remote_get_response;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("home_url", home_url).append("site_url", site_url).append("version", version).append("log_directory", log_directory).append("log_directory_writable", log_directory_writable).append("wp_version", wp_version).append("wp_multisite", wp_multisite).append("wp_memory_limit", wp_memory_limit).append("wp_debug_mode", wp_debug_mode).append("wp_cron", wp_cron).append("language", language).append("server_info", server_info).append("php_version", php_version).append("php_post_max_size", php_post_max_size).append("php_max_execution_time", php_max_execution_time).append("php_max_input_vars", php_max_input_vars).append("curl_version", curl_version).append("suhosin_installed", suhosin_installed).append("max_upload_size", max_upload_size).append("mysql_version", mysql_version).append("default_timezone", default_timezone).append("fsockopen_or_curl_enabled", fsockopen_or_curl_enabled).append("soapclient_enabled", soapclient_enabled).append("domdocument_enabled", domdocument_enabled).append("gzip_enabled", gzip_enabled).append("mbstring_enabled", mbstring_enabled).append("remote_post_successful", remote_post_successful).append("remote_post_response", remote_post_response).append("remote_get_successful", remote_get_successful).append("remote_get_response", remote_get_response).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fsockopen_or_curl_enabled).append(remote_get_response).append(soapclient_enabled).append(wp_multisite).append(remote_get_successful).append(wp_version).append(php_post_max_size).append(default_timezone).append(version).append(server_info).append(mysql_version).append(log_directory_writable).append(max_upload_size).append(gzip_enabled).append(suhosin_installed).append(site_url).append(domdocument_enabled).append(wp_memory_limit).append(curl_version).append(mbstring_enabled).append(home_url).append(remote_post_successful).append(log_directory).append(php_max_execution_time).append(php_version).append(wp_cron).append(php_max_input_vars).append(language).append(wp_debug_mode).append(remote_post_response).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Environment) == false) {
            return false;
        }
        Environment rhs = ((Environment) other);
        return new EqualsBuilder().append(fsockopen_or_curl_enabled, rhs.fsockopen_or_curl_enabled).append(remote_get_response, rhs.remote_get_response).append(soapclient_enabled, rhs.soapclient_enabled).append(wp_multisite, rhs.wp_multisite).append(remote_get_successful, rhs.remote_get_successful).append(wp_version, rhs.wp_version).append(php_post_max_size, rhs.php_post_max_size).append(default_timezone, rhs.default_timezone).append(version, rhs.version).append(server_info, rhs.server_info).append(mysql_version, rhs.mysql_version).append(log_directory_writable, rhs.log_directory_writable).append(max_upload_size, rhs.max_upload_size).append(gzip_enabled, rhs.gzip_enabled).append(suhosin_installed, rhs.suhosin_installed).append(site_url, rhs.site_url).append(domdocument_enabled, rhs.domdocument_enabled).append(wp_memory_limit, rhs.wp_memory_limit).append(curl_version, rhs.curl_version).append(mbstring_enabled, rhs.mbstring_enabled).append(home_url, rhs.home_url).append(remote_post_successful, rhs.remote_post_successful).append(log_directory, rhs.log_directory).append(php_max_execution_time, rhs.php_max_execution_time).append(php_version, rhs.php_version).append(wp_cron, rhs.wp_cron).append(php_max_input_vars, rhs.php_max_input_vars).append(language, rhs.language).append(wp_debug_mode, rhs.wp_debug_mode).append(remote_post_response, rhs.remote_post_response).isEquals();
    }

}
