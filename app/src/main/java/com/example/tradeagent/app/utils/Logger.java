package com.example.tradeagent.app.utils;

import android.util.Log;

/**
 * Created by yura on 10.06.2014.
 */
public class Logger {

    public static void d(String tag, String message){
        Log.d(tag, message);
    }

    public static void e(String tag, String message){
        Log.e(tag, message);
    }
}
