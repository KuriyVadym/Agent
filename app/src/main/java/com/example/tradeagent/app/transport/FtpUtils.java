package com.example.tradeagent.app.transport;

import android.content.Context;

import com.example.tradeagent.app.data.preferences.TradeAgentPreferences;

import org.apache.commons.net.ftp.FTPClient;

import java.io.IOException;

/**
 * Created by yura on 02.07.2014.
 */
public class FtpUtils {

    private Context mContext;

    private FTPClient mFtpClient;
    private static final int mConnectionTimeout = 10000;

    private String mFtpServer;
    private int mFtpPort;
    private String mFtpLogin;
    private String mFtpPassword;
    private boolean mFtpUsePassiveMode;

    public FtpUtils(Context context) {
        mContext = context;
        initFromPreferences();
    }

    public void initFromPreferences() {
        mFtpClient = new FTPClient();
        mFtpServer = TradeAgentPreferences.getFtpServer();
        mFtpPort = TradeAgentPreferences.getFtpPort();
        mFtpLogin = TradeAgentPreferences.getFtpLogin();
        mFtpPassword = TradeAgentPreferences.getFtpPassword();
        mFtpUsePassiveMode = TradeAgentPreferences.getFtpUsePassiveMode();
        mFtpClient.setConnectTimeout(mConnectionTimeout);
    }


    public boolean connect() {
        try {
            mFtpClient.connect(mFtpServer, mFtpPort);
            if (mFtpUsePassiveMode) mFtpClient.enterLocalPassiveMode();
            return mFtpClient.login(mFtpLogin, mFtpPassword);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


}
