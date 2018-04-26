package com.example.resource.todolist;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class TaskAdapter extends BaseAdapter {

    Context context;
    List<Task> taskList;

    public TaskAdapter(Context context, List<Task> taskList) {

        this.context = context;
        this.taskList = taskList;
    }

    @Override
    public int getCount() {
        return taskList.size();
    }

    @Override
    public Object getItem(int i) {
        return taskList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vw;
        TextView descricao;
        TextView status;

        if (view == null) {
            vw = ((Activity) context).getLayoutInflater().inflate(R.layout.item_list,
                    viewGroup, false);
        } else {
            vw = view;
        }

        descricao = vw.findViewById(R.id.description);
        status = vw.findViewById(R.id.status);

        Task task = taskList.get(i);
        descricao.setText(task.getDescription());
        status.setText(String.valueOf(task.getStatus()));

        return vw;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }

}
