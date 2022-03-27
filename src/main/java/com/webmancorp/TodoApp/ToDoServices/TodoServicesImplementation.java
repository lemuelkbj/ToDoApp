package com.webmancorp.TodoApp.ToDoServices;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.webmancorp.TodoApp.Entities.ToDoTask;
import java.util.logging.Logger;

@Service
public class TodoServicesImplementation implements Services1 {
	List<ToDoTask> TodoList;
	Logger logger = Logger.getLogger(TodoServicesImplementation.class.getName());

	public TodoServicesImplementation() {
		TodoList = new ArrayList<>();
		TodoList.add(new ToDoTask("App Dev", "High", "2pm", "EOD"));
		TodoList.add(new ToDoTask("DS Learning", "Low", "4pm", "Flexile"));
		TodoList.add(new ToDoTask("Book Reading", "High", "6pm", "EOD"));
		TodoList.add(new ToDoTask("Self-Cleaning", "Low", "6pm", "EOD"));
	}

	@Override
	public List<ToDoTask> getTasks() {
		return TodoList;
	}

	@Override
	public List<ToDoTask> getPriority(String priority) {
		// System.out.println(priority);
		ArrayList<ToDoTask> task = new ArrayList<ToDoTask>();
		for (ToDoTask n : TodoList) {
			if (priority.matches(n.getTaskPriority())) {
				task.add(n); 
			}
		}
		return task;
	}

	@Override
	public List<ToDoTask> addTasks(ToDoTask task) {
		TodoList.add(task);
		return TodoList;
	}

}
