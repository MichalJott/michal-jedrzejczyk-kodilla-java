package com.kodilla.patterns.prototype.library;


import java.util.ArrayList;
import java.util.List;

final class TasksList {
    final String name;
    final List<Task> tasks = new ArrayList<>();

    public TasksList(final String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for(Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }
}
