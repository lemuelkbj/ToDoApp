package com.webmancorp.TodoApp.ToDoServices;

import java.util.List;

import com.webmancorp.TodoApp.Entities.ToDoTask;

public interface Services1 {

	public List<ToDoTask> getTasks();

	public List<ToDoTask> getPriority(String priority);

	public List<ToDoTask> addTasks(ToDoTask task);

}