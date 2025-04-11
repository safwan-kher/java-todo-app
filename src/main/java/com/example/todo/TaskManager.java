package com.example.todo;

import java.util.*;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String title, String priority) {
        Task task = new Task(title, priority);
        tasks.add(task);
        System.out.println("Added: " + title + " [" + priority + "]");
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Your Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.printf("%d. %s (Priority: %s)%n", i + 1, task, task.getPriority());
            /*
             * System.out.printf("%d. %s%n", i + 1, tasks.get(i));
             * printf: print format
             * %d : read the first argument a digit : i + 1
             * '. ': print dot then space
             * %s : read the second argument as a string: task
             * (Priority: %s): prints Priority: then %s reads the last argument  ask.getPriority() as a string
             * %n: go to new line after
             * */
        }
    }

    public void completeTask(int index) {
        if (index < 1 || index > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        tasks.get(index - 1).markDone();
        System.out.println("Task marked as complete.");
    }
}
