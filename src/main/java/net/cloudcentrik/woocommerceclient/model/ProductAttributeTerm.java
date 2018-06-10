package net.cloudcentrik.woocommerceclient.model;

import com.google.gson.annotations.SerializedName;

public class ProductAttributeTerm {
    private int id;
    private String name;
    private String slug;
    private String description;
    @SerializedName("menu_order")
    private String menuOrder;
    private int count;

}
