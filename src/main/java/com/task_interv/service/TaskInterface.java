package com.task_interv.service;

import com.task_interv.dto.requestDTO.PaginationTask;
import com.task_interv.dto.requestDTO.TaskRequest;
import com.task_interv.dto.responseDTO.GlobalResponse;
import com.task_interv.dto.responseDTO.TaskResponse;

public interface TaskInterface {

    public GlobalResponse<Object> getAllTask(PaginationTask request);
    public GlobalResponse<Object> postTask(TaskRequest taskRequest, String corralationId);
    public TaskResponse singleTask();
    public TaskInterface updateTask();
    public TaskInterface deleteTask();

}
