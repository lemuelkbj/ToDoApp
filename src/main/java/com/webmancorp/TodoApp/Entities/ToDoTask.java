package com.webmancorp.TodoApp.Entities;

public class ToDoTask {

	private String taskName;
	private String taskPriority;
	private String startTime;
	private String toBeDoneBefore;

	public ToDoTask() {
		super();
	}

	public ToDoTask(String taskName, String taskPriority, String startTime, String toBeDoneBefore) {
		super();
		this.taskName = taskName;
		this.taskPriority = taskPriority;
		this.startTime = startTime;
		this.toBeDoneBefore = toBeDoneBefore;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getToBeDoneBefore() {
		return toBeDoneBefore;
	}

	public void setToBeDoneBefore(String toBeDoneBefore) {
		this.toBeDoneBefore = toBeDoneBefore;
	}

	@Override
	public String toString() {
		return "ToDoTask [taskName=" + taskName + ", taskPriority=" + taskPriority + ", startTime=" + startTime
				+ ", toBeDoneBefore=" + toBeDoneBefore + "]";
	}

}
