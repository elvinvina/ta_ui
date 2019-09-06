package com.ta.prototype2;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.text.*;
import android.text.style.TextAppearanceSpan;
import android.widget.Button;


public class register_third extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page3);
        Button butNope = (Button) findViewById(R.id.nope);
        String butNopeText = getResources().getString(R.string.prompt_nope);
        butNope.setText(formatString(butNopeText));
        Button butCukup = (Button) findViewById(R.id.cukup);
        String butCukupText = getResources().getString(R.string.prompt_cukup);
        butCukup.setText(formatString(butCukupText));
        Button butAktif = (Button) findViewById(R.id.aktif);
        String butAktifText = getResources().getString(R.string.prompt_aktif);
        butAktif.setText(formatString(butAktifText));
        Button butSangatAktif = (Button) findViewById(R.id.very);
        String butSangatAktifText = getResources().getString(R.string.prompt_sangatAktif);
        butSangatAktif.setText(formatString(butSangatAktifText));
    }

    private Spannable formatString(String str) {
        int startSpan = str.indexOf("\n");
        int endSpan   = str.length();
        Spannable spanString = null;
        spanString = new SpannableString(str);
        spanString.setSpan(new TextAppearanceSpan(this,
                        R.style.custom), startSpan, endSpan,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spanString;

    }
}
