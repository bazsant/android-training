package com.example.resource.xabiron;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean variavel;
    static String S_BLA ="bla";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureUI();
    }

    private void configureUI() {
        variavel = true;

        final TextView tvSomeText = (TextView) findViewById(R.id.tv_text1);
        final TextView tvSomeText2 = (TextView) findViewById(R.id.tv_text2);
        Button btn = (Button) findViewById(R.id.bt_butao);
        Button btn2 = (Button) findViewById(R.id.bt_butao2);
        ImageView imagem = (ImageView) findViewById(R.id.img01);

        tvSomeText.setText("alterado");
        tvSomeText2.setText("alterado tambem");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(variavel)
                    tvSomeText.setText("esse");
                else
                    tvSomeText.setText("ou esse");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(MainActivity.S_BLA,"valor mmms" );
                startActivity(intent);
            }
        });




    }




}
