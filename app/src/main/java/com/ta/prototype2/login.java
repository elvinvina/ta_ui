package com.ta.prototype2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        final EditText uname = findViewById(R.id.username);
        uname.getKeyListener();
        final EditText pass = findViewById(R.id.password);
        pass.getKeyListener();
        final Button login = findViewById(R.id.loginbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("cobainmasuk gaaak");
                uname.getKeyListener();
                pass.getKeyListener();
                if (uname.getText().toString().contentEquals("elv") && pass.getText().toString().contentEquals("oass")) {
                    Intent i = new Intent(login.this, artikel.class);
                    startActivity(i);
                    System.out.println("masuk");
                    finish();
                }
                else {
                    Toast.makeText(login.this,"Username dan kata sandi tidak tepat",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public void goRegist(View view) {
        Intent i = new Intent(login.this, register_first.class);
        startActivity(i);
        System.out.println("masuk");
        finish();
    }
}
