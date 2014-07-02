package com.example.tradeagent.app.data.database.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by yura on 02.07.2014.
 * заявки. таблица
 */

@DatabaseTable(tableName = "ORDER_TABLE")
public class OrderTable {

    @DatabaseField(id = true, canBeNull = false)
    private long _ID;

    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private OrderTable OrderTable; //шапка документа

    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Product Product;

    @DatabaseField
    private int CategoryPrice; //категория цены

    @DatabaseField
    private float CountBuh; //количество бух

    @DatabaseField
    private float CountUpr; //количество упр

    @DatabaseField
    private float PriceBuh; //цена бух

    @DatabaseField
    private float PriceUpr; //цена упр

    @DatabaseField
    private float SummBuh; //Сумма бух

    @DatabaseField
    private float SummUpr; //Сумма упр


    public OrderTable() {
    }


    public long get_ID() {
        return _ID;
    }

    public void set_ID(long _ID) {
        this._ID = _ID;
    }


    public Product getProduct() {
        return Product;
    }

    public void setProduct(Product product) {
        Product = product;
    }

    public int getCategoryPrice() {
        return CategoryPrice;
    }

    public void setCategoryPrice(int categoryPrice) {
        CategoryPrice = categoryPrice;
    }

    public float getCountBuh() {
        return CountBuh;
    }

    public void setCountBuh(float countBuh) {
        CountBuh = countBuh;
    }

    public float getCountUpr() {
        return CountUpr;
    }

    public void setCountUpr(float countUpr) {
        CountUpr = countUpr;
    }

    public float getPriceBuh() {
        return PriceBuh;
    }

    public void setPriceBuh(float priceBuh) {
        PriceBuh = priceBuh;
    }

    public float getPriceUpr() {
        return PriceUpr;
    }

    public void setPriceUpr(float priceUpr) {
        PriceUpr = priceUpr;
    }

    public float getSummBuh() {
        return SummBuh;
    }

    public void setSummBuh(float summBuh) {
        SummBuh = summBuh;
    }

    public float getSummUpr() {
        return SummUpr;
    }

    public void setSummUpr(float summUpr) {
        SummUpr = summUpr;
    }
}
