package com.example.jhone.capitulo1_helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureUI();
    }

    private void configureUI() {
        final EditText nome = (EditText)findViewById(R.id.et_nome);
        final TextView resultado = (TextView)findViewById(R.id.tv_resultado);
        Button bt = (Button)findViewById(R.id.bt_mostrar);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("Bem vindo " + nome.getText());
            }
        });

    }
}
