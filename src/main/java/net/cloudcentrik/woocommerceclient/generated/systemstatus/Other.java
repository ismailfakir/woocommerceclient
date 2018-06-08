
package net.cloudcentrik.woocommerceclient.generated.systemstatus;

import java.io.Serializable;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Other implements Serializable
{

    @SerializedName("wp_mou_commentmeta")
    @Expose
    @Valid
    private Wp_mou_commentmeta wp_mou_commentmeta;
    @SerializedName("wp_mou_comments")
    @Expose
    @Valid
    private Wp_mou_comments wp_mou_comments;
    @SerializedName("wp_mou_links")
    @Expose
    @Valid
    private Wp_mou_links wp_mou_links;
    @SerializedName("wp_mou_options")
    @Expose
    @Valid
    private Wp_mou_options wp_mou_options;
    @SerializedName("wp_mou_postmeta")
    @Expose
    @Valid
    private Wp_mou_postmeta wp_mou_postmeta;
    @SerializedName("wp_mou_posts")
    @Expose
    @Valid
    private Wp_mou_posts wp_mou_posts;
    @SerializedName("wp_mou_responsive_menu")
    @Expose
    @Valid
    private Wp_mou_responsive_menu wp_mou_responsive_menu;
    @SerializedName("wp_mou_termmeta")
    @Expose
    @Valid
    private Wp_mou_termmeta wp_mou_termmeta;
    @SerializedName("wp_mou_terms")
    @Expose
    @Valid
    private Wp_mou_terms wp_mou_terms;
    @SerializedName("wp_mou_term_relationships")
    @Expose
    @Valid
    private Wp_mou_term_relationships wp_mou_term_relationships;
    @SerializedName("wp_mou_term_taxonomy")
    @Expose
    @Valid
    private Wp_mou_term_taxonomy wp_mou_term_taxonomy;
    @SerializedName("wp_mou_usermeta")
    @Expose
    @Valid
    private Wp_mou_usermeta wp_mou_usermeta;
    @SerializedName("wp_mou_users")
    @Expose
    @Valid
    private Wp_mou_users wp_mou_users;
    private final static long serialVersionUID = -7980101226895885224L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Other() {
    }

    /**
     * 
     * @param wp_mou_terms
     * @param wp_mou_commentmeta
     * @param wp_mou_users
     * @param wp_mou_links
     * @param wp_mou_term_relationships
     * @param wp_mou_term_taxonomy
     * @param wp_mou_comments
     * @param wp_mou_options
     * @param wp_mou_usermeta
     * @param wp_mou_termmeta
     * @param wp_mou_responsive_menu
     * @param wp_mou_posts
     * @param wp_mou_postmeta
     */
    public Other(Wp_mou_commentmeta wp_mou_commentmeta, Wp_mou_comments wp_mou_comments, Wp_mou_links wp_mou_links, Wp_mou_options wp_mou_options, Wp_mou_postmeta wp_mou_postmeta, Wp_mou_posts wp_mou_posts, Wp_mou_responsive_menu wp_mou_responsive_menu, Wp_mou_termmeta wp_mou_termmeta, Wp_mou_terms wp_mou_terms, Wp_mou_term_relationships wp_mou_term_relationships, Wp_mou_term_taxonomy wp_mou_term_taxonomy, Wp_mou_usermeta wp_mou_usermeta, Wp_mou_users wp_mou_users) {
        super();
        this.wp_mou_commentmeta = wp_mou_commentmeta;
        this.wp_mou_comments = wp_mou_comments;
        this.wp_mou_links = wp_mou_links;
        this.wp_mou_options = wp_mou_options;
        this.wp_mou_postmeta = wp_mou_postmeta;
        this.wp_mou_posts = wp_mou_posts;
        this.wp_mou_responsive_menu = wp_mou_responsive_menu;
        this.wp_mou_termmeta = wp_mou_termmeta;
        this.wp_mou_terms = wp_mou_terms;
        this.wp_mou_term_relationships = wp_mou_term_relationships;
        this.wp_mou_term_taxonomy = wp_mou_term_taxonomy;
        this.wp_mou_usermeta = wp_mou_usermeta;
        this.wp_mou_users = wp_mou_users;
    }

    public Wp_mou_commentmeta getWp_mou_commentmeta() {
        return wp_mou_commentmeta;
    }

    public void setWp_mou_commentmeta(Wp_mou_commentmeta wp_mou_commentmeta) {
        this.wp_mou_commentmeta = wp_mou_commentmeta;
    }

    public Other withWp_mou_commentmeta(Wp_mou_commentmeta wp_mou_commentmeta) {
        this.wp_mou_commentmeta = wp_mou_commentmeta;
        return this;
    }

    public Wp_mou_comments getWp_mou_comments() {
        return wp_mou_comments;
    }

    public void setWp_mou_comments(Wp_mou_comments wp_mou_comments) {
        this.wp_mou_comments = wp_mou_comments;
    }

    public Other withWp_mou_comments(Wp_mou_comments wp_mou_comments) {
        this.wp_mou_comments = wp_mou_comments;
        return this;
    }

    public Wp_mou_links getWp_mou_links() {
        return wp_mou_links;
    }

    public void setWp_mou_links(Wp_mou_links wp_mou_links) {
        this.wp_mou_links = wp_mou_links;
    }

    public Other withWp_mou_links(Wp_mou_links wp_mou_links) {
        this.wp_mou_links = wp_mou_links;
        return this;
    }

    public Wp_mou_options getWp_mou_options() {
        return wp_mou_options;
    }

    public void setWp_mou_options(Wp_mou_options wp_mou_options) {
        this.wp_mou_options = wp_mou_options;
    }

    public Other withWp_mou_options(Wp_mou_options wp_mou_options) {
        this.wp_mou_options = wp_mou_options;
        return this;
    }

    public Wp_mou_postmeta getWp_mou_postmeta() {
        return wp_mou_postmeta;
    }

    public void setWp_mou_postmeta(Wp_mou_postmeta wp_mou_postmeta) {
        this.wp_mou_postmeta = wp_mou_postmeta;
    }

    public Other withWp_mou_postmeta(Wp_mou_postmeta wp_mou_postmeta) {
        this.wp_mou_postmeta = wp_mou_postmeta;
        return this;
    }

    public Wp_mou_posts getWp_mou_posts() {
        return wp_mou_posts;
    }

    public void setWp_mou_posts(Wp_mou_posts wp_mou_posts) {
        this.wp_mou_posts = wp_mou_posts;
    }

    public Other withWp_mou_posts(Wp_mou_posts wp_mou_posts) {
        this.wp_mou_posts = wp_mou_posts;
        return this;
    }

    public Wp_mou_responsive_menu getWp_mou_responsive_menu() {
        return wp_mou_responsive_menu;
    }

    public void setWp_mou_responsive_menu(Wp_mou_responsive_menu wp_mou_responsive_menu) {
        this.wp_mou_responsive_menu = wp_mou_responsive_menu;
    }

    public Other withWp_mou_responsive_menu(Wp_mou_responsive_menu wp_mou_responsive_menu) {
        this.wp_mou_responsive_menu = wp_mou_responsive_menu;
        return this;
    }

    public Wp_mou_termmeta getWp_mou_termmeta() {
        return wp_mou_termmeta;
    }

    public void setWp_mou_termmeta(Wp_mou_termmeta wp_mou_termmeta) {
        this.wp_mou_termmeta = wp_mou_termmeta;
    }

    public Other withWp_mou_termmeta(Wp_mou_termmeta wp_mou_termmeta) {
        this.wp_mou_termmeta = wp_mou_termmeta;
        return this;
    }

    public Wp_mou_terms getWp_mou_terms() {
        return wp_mou_terms;
    }

    public void setWp_mou_terms(Wp_mou_terms wp_mou_terms) {
        this.wp_mou_terms = wp_mou_terms;
    }

    public Other withWp_mou_terms(Wp_mou_terms wp_mou_terms) {
        this.wp_mou_terms = wp_mou_terms;
        return this;
    }

    public Wp_mou_term_relationships getWp_mou_term_relationships() {
        return wp_mou_term_relationships;
    }

    public void setWp_mou_term_relationships(Wp_mou_term_relationships wp_mou_term_relationships) {
        this.wp_mou_term_relationships = wp_mou_term_relationships;
    }

    public Other withWp_mou_term_relationships(Wp_mou_term_relationships wp_mou_term_relationships) {
        this.wp_mou_term_relationships = wp_mou_term_relationships;
        return this;
    }

    public Wp_mou_term_taxonomy getWp_mou_term_taxonomy() {
        return wp_mou_term_taxonomy;
    }

    public void setWp_mou_term_taxonomy(Wp_mou_term_taxonomy wp_mou_term_taxonomy) {
        this.wp_mou_term_taxonomy = wp_mou_term_taxonomy;
    }

    public Other withWp_mou_term_taxonomy(Wp_mou_term_taxonomy wp_mou_term_taxonomy) {
        this.wp_mou_term_taxonomy = wp_mou_term_taxonomy;
        return this;
    }

    public Wp_mou_usermeta getWp_mou_usermeta() {
        return wp_mou_usermeta;
    }

    public void setWp_mou_usermeta(Wp_mou_usermeta wp_mou_usermeta) {
        this.wp_mou_usermeta = wp_mou_usermeta;
    }

    public Other withWp_mou_usermeta(Wp_mou_usermeta wp_mou_usermeta) {
        this.wp_mou_usermeta = wp_mou_usermeta;
        return this;
    }

    public Wp_mou_users getWp_mou_users() {
        return wp_mou_users;
    }

    public void setWp_mou_users(Wp_mou_users wp_mou_users) {
        this.wp_mou_users = wp_mou_users;
    }

    public Other withWp_mou_users(Wp_mou_users wp_mou_users) {
        this.wp_mou_users = wp_mou_users;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("wp_mou_commentmeta", wp_mou_commentmeta).append("wp_mou_comments", wp_mou_comments).append("wp_mou_links", wp_mou_links).append("wp_mou_options", wp_mou_options).append("wp_mou_postmeta", wp_mou_postmeta).append("wp_mou_posts", wp_mou_posts).append("wp_mou_responsive_menu", wp_mou_responsive_menu).append("wp_mou_termmeta", wp_mou_termmeta).append("wp_mou_terms", wp_mou_terms).append("wp_mou_term_relationships", wp_mou_term_relationships).append("wp_mou_term_taxonomy", wp_mou_term_taxonomy).append("wp_mou_usermeta", wp_mou_usermeta).append("wp_mou_users", wp_mou_users).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(wp_mou_terms).append(wp_mou_commentmeta).append(wp_mou_users).append(wp_mou_comments).append(wp_mou_options).append(wp_mou_usermeta).append(wp_mou_responsive_menu).append(wp_mou_postmeta).append(wp_mou_links).append(wp_mou_term_relationships).append(wp_mou_term_taxonomy).append(wp_mou_termmeta).append(wp_mou_posts).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Other) == false) {
            return false;
        }
        Other rhs = ((Other) other);
        return new EqualsBuilder().append(wp_mou_terms, rhs.wp_mou_terms).append(wp_mou_commentmeta, rhs.wp_mou_commentmeta).append(wp_mou_users, rhs.wp_mou_users).append(wp_mou_comments, rhs.wp_mou_comments).append(wp_mou_options, rhs.wp_mou_options).append(wp_mou_usermeta, rhs.wp_mou_usermeta).append(wp_mou_responsive_menu, rhs.wp_mou_responsive_menu).append(wp_mou_postmeta, rhs.wp_mou_postmeta).append(wp_mou_links, rhs.wp_mou_links).append(wp_mou_term_relationships, rhs.wp_mou_term_relationships).append(wp_mou_term_taxonomy, rhs.wp_mou_term_taxonomy).append(wp_mou_termmeta, rhs.wp_mou_termmeta).append(wp_mou_posts, rhs.wp_mou_posts).isEquals();
    }

}
