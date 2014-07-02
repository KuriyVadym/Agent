package com.example.tradeagent.app.data.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

import com.example.tradeagent.app.TradeAgentApplication;
import com.example.tradeagent.app.config.Settings;
import com.example.tradeagent.app.utils.Logger;

/**
 * Created by yura on 10.06.2014.
 */
public class TradeAgentPreferences {

    private static final String SETTINGS = "trade_agent_local_settings";

    private static final String FTP_SERVER = "FTP_SERVER";
    private static final String FTP_PORT = "FTP_PORT";
    private static final String FTP_LOGIN = "FTP_LOGIN";
    private static final String FTP_PASSWORD = "FTP_PASSWORD";
    private static final String FTP_USE_PASSIVE_MODE = "FTP_USE_PASSIVE_MODE";


    private static String LOG_TAG = TradeAgentPreferences.class.getSimpleName();


    protected static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(SETTINGS, Context.MODE_PRIVATE);
    }


    protected static void applyChanges(SharedPreferences.Editor edit) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            edit.apply();
        } else {
            edit.commit();
        }
    }


    private static void saveString(Context context, String key, String value) {
        SharedPreferences.Editor edit = getSharedPreferences(context).edit();
        edit.putString(key, value);
        applyChanges(edit);
        if (Settings.LOG) Logger.d(LOG_TAG, "saveIfNew key=" + key + "  value=" + value);
    }


    private static String getString(Context context, String key) {
        SharedPreferences pref = getSharedPreferences(context);
        return pref.getString(key, "");
    }


    private static void saveInt(Context context, String key, int value) {
        SharedPreferences.Editor edit = getSharedPreferences(context).edit();
        edit.putInt(key, value);
        applyChanges(edit);
        if (Settings.LOG) Logger.d(LOG_TAG, "saveIfNew key=" + key + "  value=" + value);
    }

    private static int getInt(Context context, String key) {
        SharedPreferences pref = getSharedPreferences(context);
        return pref.getInt(key, 0);
    }


    private static void saveBoolean(Context context, String key, boolean value) {
        SharedPreferences.Editor edit = getSharedPreferences(context).edit();
        edit.putBoolean(key, value);
        applyChanges(edit);
        if (Settings.LOG) Logger.d(LOG_TAG, "saveIfNew key=" + key + "  value=" + value);
    }


    private static boolean getBoolean(Context context, String key) {
        return getSharedPreferences(context).getBoolean(key, false);
    }

    private static void saveLong(Context context, String key, long value) {
        applyChanges(getSharedPreferences(context).edit().putLong(key, value));
    }

    public static long getLong(Context context, String key) {
        return getSharedPreferences(context).getLong(key, 0);
    }


    public static void setFtpServer(String value) {
        saveString(TradeAgentApplication.getInstance(), FTP_SERVER, value);
    }

    public static void setFtpLogin(String value) {
        saveString(TradeAgentApplication.getInstance(), FTP_LOGIN, value);
    }

    public static void setFtpPassword(String value) {
        saveString(TradeAgentApplication.getInstance(), FTP_PASSWORD, value);
    }

    public static void setFtpPort(int value) {
        saveInt(TradeAgentApplication.getInstance(), FTP_PORT, value);
    }

    public static void setFtpUsePassiveMode(boolean value) {
        saveBoolean(TradeAgentApplication.getInstance(), FTP_USE_PASSIVE_MODE, value);
    }

    public static String getFtpServer() {
        return getString(TradeAgentApplication.getInstance(), FTP_SERVER);
    }

    public static String getFtpLogin() {
        return getString(TradeAgentApplication.getInstance(), FTP_LOGIN);
    }

    public static String getFtpPassword() {
        return getString(TradeAgentApplication.getInstance(), FTP_PASSWORD);
    }

    public static int getFtpPort() {
        return getInt(TradeAgentApplication.getInstance(), FTP_PORT);
    }

    public static boolean getFtpUsePassiveMode() {
        return getBoolean(TradeAgentApplication.getInstance(), FTP_USE_PASSIVE_MODE);
    }
}
