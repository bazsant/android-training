package com.example.resource.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Task> taskList;
    ListView lista;
    TaskAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureUI();
    }

    private void configureUI() {

        lista = (ListView) findViewById(R.id.listView);

        taskList = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            taskList.add(new Task("descrição " + i, 0));
        }

        adapter = new TaskAdapter(this, taskList);

        lista.setAdapter(adapter);


    }

}
