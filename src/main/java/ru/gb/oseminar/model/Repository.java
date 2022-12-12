package ru.gb.oseminar.model;

import java.util.List;

public interface Repository {
    List<Task> getAllTasks();
    String CreateTask(Task task);
    void deleteTask(String taskID);
//    void updateTask(Task task);
}
