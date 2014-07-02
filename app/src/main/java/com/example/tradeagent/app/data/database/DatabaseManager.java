package com.example.tradeagent.app.data.database;

import android.content.Context;

import com.example.tradeagent.app.data.database.entity.Client;
import com.example.tradeagent.app.data.database.entity.MoneyHeader;
import com.example.tradeagent.app.data.database.entity.OrderHeader;
import com.example.tradeagent.app.data.database.entity.Outlet;
import com.example.tradeagent.app.data.database.entity.Product;
import com.example.tradeagent.app.data.database.entity.ProductGroup;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yura on 02.07.2014.
 * Надстройка над датабейс хелпером для получения данных из бд
 */
public class DatabaseManager {

    private DatabaseHelper mDatabaseHelper;

    public DatabaseManager(Context context) {
        mDatabaseHelper = new DatabaseHelper(context);
    }


    public List<Client> getAllClients() {
        try {
            return mDatabaseHelper.getDao(Client.class).queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<Client>();
        }
    }


    public List<OrderHeader> getAllOrders() {
        try {
            return mDatabaseHelper.getDao(OrderHeader.class).queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<OrderHeader>();
        }
    }


    public List<MoneyHeader> getAllMoney() {
        try {
            return mDatabaseHelper.getDao(MoneyHeader.class).queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<MoneyHeader>();
        }
    }


    public List<Outlet> getAllOutlets() {
        try {
            return mDatabaseHelper.getDao(Outlet.class).queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<Outlet>();
        }
    }


    public List<Product> getAllProducts() {
        try {
            return mDatabaseHelper.getDao(Product.class).queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<Product>();
        }
    }

    public List<ProductGroup> getAllProductGroups() {
        try {
            return mDatabaseHelper.getDao(ProductGroup.class).queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<ProductGroup>();
        }
    }


    public List<Outlet> getOutletsForClient(Client client) {
        try {
            List<Outlet> all = mDatabaseHelper.getDao(Outlet.class).queryForAll();
            List<Outlet> result = new ArrayList<Outlet>();
            for (Outlet outlet: all){
                if (outlet.getClient()==client) result.add(outlet);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<Outlet>();
        }
    }



}
