package com.example.todolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.TasksViewHolder>{
    private ArrayList<Tasks> tasks;

    public TasksAdapter(ArrayList<Tasks> tasks) {
        this.tasks = tasks;
    }

    private Object ViewGroup;

    @NonNull
    @Override
    public TasksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent,false);
        return new TasksViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull TasksViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class TasksViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewTitle;
        private TextView textViewDescription;
        private TextView textViewDayofweek;
        private TextView textViewPriority;

        public TasksViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDayofweek = itemView.findViewById(R.id.textViewDayofWeek);
            textViewDescription = itemView.findViewById(R.id.textViewDescription);
            textViewPriority = itemView.findViewById(R.id.textViewPriority);
        }
    }
}
