package com.example.tradeagent.app.data.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.tradeagent.app.data.database.entity.Client;
import com.example.tradeagent.app.data.database.entity.MoneyHeader;
import com.example.tradeagent.app.data.database.entity.OrderHeader;
import com.example.tradeagent.app.data.database.entity.OrderTable;
import com.example.tradeagent.app.data.database.entity.Outlet;
import com.example.tradeagent.app.data.database.entity.Product;
import com.example.tradeagent.app.data.database.entity.ProductGroup;
import com.example.tradeagent.app.utils.Logger;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.io.File;
import java.io.InputStream;
import java.sql.SQLException;

/**
 * Created by yura on 28.06.2014.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "TRADE_AGENT";
    private static final int VERSION = 1;
    private static final String TAG = DatabaseHelper.class.getSimpleName();

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    public DatabaseHelper(Context context, String databaseName, SQLiteDatabase.CursorFactory factory, int databaseVersion) {
        super(context, DATABASE_NAME, factory, VERSION);
    }

    public DatabaseHelper(Context context, String databaseName, SQLiteDatabase.CursorFactory factory, int databaseVersion, int configFileId) {
        super(context, DATABASE_NAME, factory, VERSION, configFileId);
    }

    public DatabaseHelper(Context context, String databaseName, SQLiteDatabase.CursorFactory factory, int databaseVersion, File configFile) {
        super(context, DATABASE_NAME, factory, VERSION, configFile);
    }

    public DatabaseHelper(Context context, String databaseName, SQLiteDatabase.CursorFactory factory, int databaseVersion, InputStream stream) {
        super(context, DATABASE_NAME, factory, VERSION, stream);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource arg1) {
        try {
            TableUtils.createTable(connectionSource, Client.class);
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.e(TAG, "onCreate table=Client error: " + e.getMessage());
        }

        try {
            TableUtils.createTable(connectionSource, Outlet.class);
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.e(TAG, "onCreate table=Outlet error: " + e.getMessage());
        }

        try {
            TableUtils.createTable(connectionSource, ProductGroup.class);
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.e(TAG, "onCreate table=ProductGroup error: " + e.getMessage());
        }

        try {
            TableUtils.createTable(connectionSource, Product.class);
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.e(TAG, "onCreate table=Product error: " + e.getMessage());
        }

        try {
            TableUtils.createTable(connectionSource, OrderHeader.class);
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.e(TAG, "onCreate table=OrderHeader error: " + e.getMessage());
        }

        try {
            TableUtils.createTable(connectionSource, OrderTable.class);
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.e(TAG, "onCreate table=OrderTable error: " + e.getMessage());
        }

        try {
            TableUtils.createTable(connectionSource, MoneyHeader.class);
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.e(TAG, "onCreate table=MoneyHeader error: " + e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i2) {

    }

    @Override
    public void close() {
        super.close();
    }
}