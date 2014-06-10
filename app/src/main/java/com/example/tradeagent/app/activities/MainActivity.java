package com.example.tradeagent.app.activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.tradeagent.app.R;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private ItemHolder mItemHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mItemHolder = new ItemHolder();
        mItemHolder.mainButtonSettings.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v==mItemHolder.mainButtonSettings){
            Intent i = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(i);
        }
    }

    private class ItemHolder {
        public final Button mainButtonSettings;
        private ItemHolder() {
            mainButtonSettings = (Button) findViewById(R.id.main_button_settings);
        }
    }
}
