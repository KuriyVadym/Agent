package com.example.tradeagent.app.activities;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tradeagent.app.R;
import com.example.tradeagent.app.data.database.DatabaseHelper;
import com.example.tradeagent.app.data.preferences.TradeAgentPreferences;

/**
 * Created by yura on 10.06.2014.
 */
public class SettingsActivity extends ActionBarActivity implements View.OnClickListener, TextWatcher {
    @Override
    public void onClick(View v) {
        if (v == mItemHolder.saveFtp) {
            askAboutSaving();
        }
        if (v == mItemHolder.checkUsePassiveMode) {
            mSettingsChanged = true;
        }
    }

    private void askAboutSaving() {
        new AlertDialog.Builder(SettingsActivity.this)
                .setMessage(SettingsActivity.this.getResources().getString(R.string.question_save_settings))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        TradeAgentPreferences.setFtpServer(mItemHolder.getServer());
                        TradeAgentPreferences.setFtpPort(Integer.valueOf(mItemHolder.getPort()));
                        TradeAgentPreferences.setFtpLogin(mItemHolder.getLogin());
                        TradeAgentPreferences.setFtpPassword(mItemHolder.getPassword());
                        TradeAgentPreferences.setFtpUsePassiveMode(mItemHolder.getUsePassiveMode());
                        SettingsActivity.this.finish();
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    private ItemHolder mItemHolder;
    private boolean mSettingsChanged = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        mItemHolder = new ItemHolder();
        mItemHolder.saveFtp.setOnClickListener(this);
        mItemHolder.editFtpServer.addTextChangedListener(this);
        mItemHolder.editFtpPort.addTextChangedListener(this);
        mItemHolder.editFtpLogin.addTextChangedListener(this);
        mItemHolder.editFtpPassword.addTextChangedListener(this);
        mItemHolder.checkUsePassiveMode.setOnClickListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        mSettingsChanged = true;
    }


    private class ItemHolder {
        public final Button saveFtp;
        public final EditText editFtpServer;
        public final EditText editFtpPort;
        public final EditText editFtpLogin;
        public final EditText editFtpPassword;
        public final CheckBox checkUsePassiveMode;

        public ItemHolder() {
            saveFtp = (Button) findViewById(R.id.settings_save_button);
            editFtpServer = (EditText) findViewById(R.id.settings_edit_text_server);
            editFtpPort = (EditText) findViewById(R.id.settings_edit_text_port);
            editFtpLogin = (EditText) findViewById(R.id.settings_edit_text_login);
            editFtpPassword = (EditText) findViewById(R.id.settings_edit_text_password);
            checkUsePassiveMode = (CheckBox) findViewById(R.id.settings_check_box_use_passive_mode);
            editFtpServer.setText(TradeAgentPreferences.getFtpServer());
            editFtpPort.setText(String.valueOf(TradeAgentPreferences.getFtpPort()));
            editFtpLogin.setText(TradeAgentPreferences.getFtpLogin());
            editFtpPassword.setText(TradeAgentPreferences.getFtpPassword());
            checkUsePassiveMode.setChecked(TradeAgentPreferences.getFtpUsePassiveMode());
        }

        public String getServer() {
            return editFtpServer.getText().toString();
        }

        public String getPort() {
            return editFtpPort.getText().toString();
        }

        public String getLogin() {
            return editFtpLogin.getText().toString();
        }

        public String getPassword() {
            return editFtpPassword.getText().toString();
        }

        public boolean getUsePassiveMode() {
            return checkUsePassiveMode.isChecked();
        }
    }


    public void onBackPressed(){
        if (mSettingsChanged) {
            askAboutSaving();
        } else {
            finish();
        }
    }

}
