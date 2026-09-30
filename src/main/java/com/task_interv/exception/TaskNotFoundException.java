package com.task_interv.exception;

public class TaskNotFoundException extends RuntimeException{

    String message;

    public TaskNotFoundException(){}

    public TaskNotFoundException(String message){
        super(message);
        this.message=message;
    }
}
