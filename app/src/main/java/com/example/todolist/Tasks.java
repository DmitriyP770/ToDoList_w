package com.example.todolist;

public class Tasks {
    private String title;
    private String description;
    private String dayofweek;
    private int priority;

    public Tasks(String title, String description, String dayofweek, int priority) {
        this.title = title;
        this.description = description;
        this.dayofweek = dayofweek;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDayofweek() {
        return dayofweek;
    }

    public int getPriority() {
        return priority;
    }
}
