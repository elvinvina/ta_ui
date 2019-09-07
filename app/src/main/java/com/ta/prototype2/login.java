package com.ta.prototype2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class login extends AppCompatActivity {
    public static final String PREFS_NAME = "user";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //SharedPreferences user = (SharedPreferences) getPreferences(PREFS_NAME, 0);



    }

    public void goRegist(View view) {
        Intent i = new Intent(login.this, register_first.class);
        startActivity(i);
        finish();
    }

    public void goLogin(View view) {

    }
}
