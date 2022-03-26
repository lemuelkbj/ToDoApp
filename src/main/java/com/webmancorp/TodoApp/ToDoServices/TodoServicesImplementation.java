package com.webmancorp.TodoApp.ToDoServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webmancorp.TodoApp.Entities.ToDoTask;

@Service
public class TodoServicesImplementation implements Services1 {
	List<ToDoTask> TodoList;

	public TodoServicesImplementation() {
		TodoList = new ArrayList<>();
		TodoList.add(new ToDoTask("App Dev","High Level", "2pm","EOD"));
		TodoList.add(new ToDoTask("DS Learning","Low Level", "4pm","Flexile"));
		TodoList.add(new ToDoTask("Book Reading","High Level", "6pm","EOD"));
	}

	@Override
	public List<ToDoTask> getTasks() {
		return TodoList;
	}

}
