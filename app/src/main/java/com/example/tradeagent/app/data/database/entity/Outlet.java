package com.example.tradeagent.app.data.database.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by yura on 28.06.2014.
 * Торговые точки
 */

@DatabaseTable(tableName = "OUTLETS")
public class Outlet {

    @DatabaseField(id = true, canBeNull = false)
    private long _ID;

    @DatabaseField(foreign = true, foreignAutoRefresh= true)
    private Client Client; //клиент

    @DatabaseField
    private String Code; //код в 1с

    @DatabaseField
    private String Name; //наименование в 1с

    @DatabaseField
    private String Adress;

    @DatabaseField
    private Date EndLicenceDate;

    @DatabaseField
    private String Licence;


    public Outlet(){
    }

    public long get_ID() {
        return _ID;
    }

    public void set_ID(long _ID) {
        this._ID = _ID;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client client) {
        Client = client;
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

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public Date getEndLicenceDate() {
        return EndLicenceDate;
    }

    public void setEndLicenceDate(Date endLicenceDate) {
        EndLicenceDate = endLicenceDate;
    }
}
