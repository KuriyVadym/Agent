package com.example.tradeagent.app;

import android.app.Application;
import android.provider.Settings;

/**
 * Created by yura on 10.06.2014.
 */
public class TradeAgentApplication extends Application {
    private static TradeAgentApplication mInstance;

    public static TradeAgentApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        mInstance = this;
        super.onCreate();
    }


    public String getDeviceId(){
        return Settings.Secure.getString(this.getInstance().getContentResolver(), Settings.Secure.ANDROID_ID);
    }

}
