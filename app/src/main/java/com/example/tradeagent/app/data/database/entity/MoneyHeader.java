package com.example.tradeagent.app.data.database.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by yura on 02.07.2014.
 */

@DatabaseTable(tableName = "MONEY_HEADER")
public class MoneyHeader {

    @DatabaseField(id = true, canBeNull = false)
    private long _ID;

    @DatabaseField
    private long DateAndTime;

    @DatabaseField(foreign = true, foreignAutoRefresh= true)
    private Client Client; //клиент

    @DatabaseField(foreign = true, foreignAutoRefresh= true)
    private Outlet Outlet; //торговая точка

    @DatabaseField
    private String Description;

    @DatabaseField
    private boolean Sended; //признак что отправлено

    @DatabaseField
    private float SummBuh; //Сумма бух

    @DatabaseField
    private float SummUpr; //Сумма упр

    public MoneyHeader(){
    }

    public long get_ID() {
        return _ID;
    }

    public void set_ID(long _ID) {
        this._ID = _ID;
    }

    public long getDateAndTime() {
        return DateAndTime;
    }

    public void setDateAndTime(long dateAndTime) {
        DateAndTime = dateAndTime;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client client) {
        Client = client;
    }

    public Outlet getOutlet() {
        return Outlet;
    }

    public void setOutlet(Outlet outlet) {
        Outlet = outlet;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isSended() {
        return Sended;
    }

    public void setSended(boolean sended) {
        Sended = sended;
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
