package com.webmancorp.TodoApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.webmancorp.TodoApp.Entities.ToDoTask;
import com.webmancorp.TodoApp.ToDoServices.Services1;



@RestController
public class ControllerOne {
	@Autowired
	private Services1 obj;
	@GetMapping("/home")
	public String home() {
		return "To Do Application";
	}
	
	@GetMapping("/getTasks")
	public List<ToDoTask> getTasks(){
		return this.obj.getTasks();
	}
	
	@GetMapping("/getTasks/{priority}")
	public List<ToDoTask> getPriority(@PathVariable String priority) {
		return this.obj.getPriority(priority);
	}
}
