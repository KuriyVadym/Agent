package com.example.tradeagent.app.data.database.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by yura on 28.06.2014.
 * Клиенты
 */
@DatabaseTable(tableName = "CLIENTS")
public class Client {

    @DatabaseField(id = true, canBeNull = false)
    private long _ID;

    @DatabaseField
    private String Code; //код в 1с

    @DatabaseField
    private String Name; //наименование

    @DatabaseField
    private String Contract; //договр

    @DatabaseField
    private Float SummDebetBuh; //сумма дебеторской задолженности бух

    @DatabaseField
    private Float SummDebetUpr; //сумма дебеторской задолженности упр

    public Client() {
    }

    public long getID() {
        return _ID;
    }

    public void setID(long id) {
        this._ID = _ID;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getContract() {
        return Contract;
    }

    public void setContract(String contract) {
        Contract = contract;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Float getSummDebetBuh() {
        return SummDebetBuh;
    }

    public void setSummDebetBuh(Float summDebetBuh) {
        SummDebetBuh = summDebetBuh;
    }

    public Float getSummDebetUpr() {
        return SummDebetUpr;
    }

    public void setSummDebetUpr(Float summDebetUpr) {
        SummDebetUpr = summDebetUpr;
    }
}
