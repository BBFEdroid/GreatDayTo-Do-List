package com.bb.greatdayto_do_list.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "categories")
public class CategoriesEntity implements Serializable {
    @PrimaryKey(autoGenerate = true)
    int categories_id;
    @ColumnInfo(name = "categories_name")
    String categories_name;
    @ColumnInfo(name = "categories_icon")
    String categories_icon;

    public CategoriesEntity(){

    }

    public int getCategories_id() {
        return categories_id;
    }

    public void setCategories_id(int categories_id) {
        this.categories_id = categories_id;
    }

    public String getCategories_name() {
        return categories_name;
    }

    public void setCategories_name(String categories_name) {
        this.categories_name = categories_name;
    }

    public String getCategories_icon() {
        return categories_icon;
    }

    public void setCategories_icon(String categories_icon) {
        this.categories_icon = categories_icon;
    }
}
