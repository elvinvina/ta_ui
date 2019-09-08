package com.ta.prototype2;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;

public class register_first extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page1);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleMarginTop(Gravity.CENTER);
        toolbar.setTitle("Detail");
        toolbar.getNavigationIcon();

        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_register,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_next) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
