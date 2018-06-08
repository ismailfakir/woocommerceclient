
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Database implements Serializable
{

    @SerializedName("wc_database_version")
    @Expose
    private String wc_database_version;
    @SerializedName("database_prefix")
    @Expose
    private String database_prefix;
    @SerializedName("maxmind_geoip_database")
    @Expose
    private String maxmind_geoip_database;
    @SerializedName("database_tables")
    @Expose
    @Valid
    private Database_tables database_tables;
    @SerializedName("database_size")
    @Expose
    @Valid
    private Database_size database_size;
    private final static long serialVersionUID = 3515826255878532464L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Database() {
    }

    /**
     * 
     * @param database_prefix
     * @param database_tables
     * @param wc_database_version
     * @param database_size
     * @param maxmind_geoip_database
     */
    public Database(String wc_database_version, String database_prefix, String maxmind_geoip_database, Database_tables database_tables, Database_size database_size) {
        super();
        this.wc_database_version = wc_database_version;
        this.database_prefix = database_prefix;
        this.maxmind_geoip_database = maxmind_geoip_database;
        this.database_tables = database_tables;
        this.database_size = database_size;
    }

    public String getWc_database_version() {
        return wc_database_version;
    }

    public void setWc_database_version(String wc_database_version) {
        this.wc_database_version = wc_database_version;
    }

    public Database withWc_database_version(String wc_database_version) {
        this.wc_database_version = wc_database_version;
        return this;
    }

    public String getDatabase_prefix() {
        return database_prefix;
    }

    public void setDatabase_prefix(String database_prefix) {
        this.database_prefix = database_prefix;
    }

    public Database withDatabase_prefix(String database_prefix) {
        this.database_prefix = database_prefix;
        return this;
    }

    public String getMaxmind_geoip_database() {
        return maxmind_geoip_database;
    }

    public void setMaxmind_geoip_database(String maxmind_geoip_database) {
        this.maxmind_geoip_database = maxmind_geoip_database;
    }

    public Database withMaxmind_geoip_database(String maxmind_geoip_database) {
        this.maxmind_geoip_database = maxmind_geoip_database;
        return this;
    }

    public Database_tables getDatabase_tables() {
        return database_tables;
    }

    public void setDatabase_tables(Database_tables database_tables) {
        this.database_tables = database_tables;
    }

    public Database withDatabase_tables(Database_tables database_tables) {
        this.database_tables = database_tables;
        return this;
    }

    public Database_size getDatabase_size() {
        return database_size;
    }

    public void setDatabase_size(Database_size database_size) {
        this.database_size = database_size;
    }

    public Database withDatabase_size(Database_size database_size) {
        this.database_size = database_size;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("wc_database_version", wc_database_version).append("database_prefix", database_prefix).append("maxmind_geoip_database", maxmind_geoip_database).append("database_tables", database_tables).append("database_size", database_size).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(database_prefix).append(database_tables).append(wc_database_version).append(database_size).append(maxmind_geoip_database).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Database) == false) {
            return false;
        }
        Database rhs = ((Database) other);
        return new EqualsBuilder().append(database_prefix, rhs.database_prefix).append(database_tables, rhs.database_tables).append(wc_database_version, rhs.wc_database_version).append(database_size, rhs.database_size).append(maxmind_geoip_database, rhs.maxmind_geoip_database).isEquals();
    }

}
