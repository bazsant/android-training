package com.example.resource.sharedprefs;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String CHAVE = "NUMERO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Integer valor = SharedPreferencesHelper.getSharedPrefs(this, CHAVE);
        valor = valor + 1;
        SharedPreferencesHelper.setSharedPrefs(this, CHAVE, valor );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Integer valor = SharedPreferencesHelper.getSharedPrefs(this, CHAVE);
        Toast.makeText(this, valor.toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {


        super.onPause();
    }
}
