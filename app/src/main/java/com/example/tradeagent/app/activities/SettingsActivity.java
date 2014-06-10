package com.example.tradeagent.app.activities;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.example.tradeagent.app.R;

/**
 * Created by yura on 10.06.2014.
 */
public class SettingsActivity extends ActionBarActivity implements View.OnClickListener {
    @Override
    public void onClick(View v) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
}
