package com.example.tradeagent.app.data.database.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by yura on 28.06.2014.
 * Группы товаров
 */

@DatabaseTable(tableName = "PRODUCT_GROUPS")
public class ProductGroup {

    @DatabaseField(id = true, canBeNull = false)
    private long _ID;

    @DatabaseField
    private String Code;

    @DatabaseField
    private String Name;

    public ProductGroup(){
    }

    public long get_ID() {
        return _ID;
    }

    public void set_ID(long _ID) {
        this._ID = _ID;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
