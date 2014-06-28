package com.example.tradeagent.app.data.database.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by yura on 28.06.2014.
 * Товары
 */

@DatabaseTable(tableName = "PRODUCTS")
public class Product {
    @DatabaseField(id = true, canBeNull = false)
    private long _ID;

    @DatabaseField
    private String Code;

    @DatabaseField
    private String Name;

    @DatabaseField
    private String Unit; //единица измерения

    @DatabaseField
    private float Price1;

    @DatabaseField
    private float Price2;

    @DatabaseField
    private float Price3;

    @DatabaseField
    private float Price4;

    @DatabaseField
    private float Price5;

    @DatabaseField
    private float Price6;

    @DatabaseField
    private float Price7;

    @DatabaseField
    private float Price8;

    @DatabaseField
    private float Price9;

    @DatabaseField
    private float Price10;

    @DatabaseField
    private float BalanceBuh; //остаток бух

    @DatabaseField
    private float BalanceUpr; //остаток упр

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

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public float getPrice1() {
        return Price1;
    }

    public void setPrice1(float price1) {
        Price1 = price1;
    }

    public float getPrice2() {
        return Price2;
    }

    public void setPrice2(float price2) {
        Price2 = price2;
    }

    public float getPrice3() {
        return Price3;
    }

    public void setPrice3(float price3) {
        Price3 = price3;
    }

    public float getPrice4() {
        return Price4;
    }

    public void setPrice4(float price4) {
        Price4 = price4;
    }

    public float getPrice5() {
        return Price5;
    }

    public void setPrice5(float price5) {
        Price5 = price5;
    }

    public float getPrice6() {
        return Price6;
    }

    public void setPrice6(float price6) {
        Price6 = price6;
    }

    public float getPrice7() {
        return Price7;
    }

    public void setPrice7(float price7) {
        Price7 = price7;
    }

    public float getPrice8() {
        return Price8;
    }

    public void setPrice8(float price8) {
        Price8 = price8;
    }

    public float getPrice9() {
        return Price9;
    }

    public void setPrice9(float price9) {
        Price9 = price9;
    }

    public float getPrice10() {
        return Price10;
    }

    public void setPrice10(float price10) {
        Price10 = price10;
    }

    public float getBalanceBuh() {
        return BalanceBuh;
    }

    public void setBalanceBuh(float balanceBuh) {
        BalanceBuh = balanceBuh;
    }

    public float getBalanceUpr() {
        return BalanceUpr;
    }

    public void setBalanceUpr(float balanceUpr) {
        BalanceUpr = balanceUpr;
    }
}
