package com.example.resource.xabiron;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        configureUI();
    }

    private void configureUI(){
        Button bt = (Button) findViewById(R.id.bt_butao);
        TextView tv = (TextView) findViewById(R.id.tv_texto);

        String mString = getIntent().getStringExtra(MainActivity.S_BLA);
        tv.setText(mString);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
