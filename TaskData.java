package model;

import java.util.ArrayList;
import java.util.List;

public class TaskData {
    private static final List<Task> tasks = new ArrayList<>();

    public static void addTask(Task task) {
        tasks.add(task);
    }

    public static List<Task> getTasks() {
        return tasks;
    }
}
