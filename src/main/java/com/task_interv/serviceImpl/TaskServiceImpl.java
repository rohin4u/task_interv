package com.task_interv.serviceImpl;

import com.task_interv.dto.requestDTO.PaginationTask;
import com.task_interv.dto.requestDTO.TaskRequest;
import com.task_interv.dto.responseDTO.GlobalResponse;
import com.task_interv.dto.responseDTO.PagingResult;
import com.task_interv.dto.responseDTO.TaskResponse;
import com.task_interv.entity.Task;
import com.task_interv.pagination.TaskPaginator;
import com.task_interv.repository.TaskRepository;
import com.task_interv.service.TaskInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskInterface {

    TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    @Override
    public GlobalResponse<Object> getAllTask(PaginationTask request) {

        Pageable pageableTask = TaskPaginator.getPageableTask(request);
        Page<Task> allTask = taskRepository.findAll(pageableTask);
        final List<Task> entitiesDto = allTask.stream().map(mapper::).toList();




        PagingResult pagingResult = PagingResult.builder()
                .content(allTask)
                .totalPages(pageableTask.getNumberOfPages())
                .totalElements(pageableTask.get)


        return null;
    }

    @Override
    public GlobalResponse<Object> postTask(TaskRequest taskRequest, String corralationId) {

        Task task = Task.builder()
                .title(taskRequest.getTitle())
                .description(taskRequest.getDescription())
                .completed(taskRequest.isCompleted())
                .build();

        Task savedTask = taskRepository.save(task);

        TaskResponse taskResponse = TaskResponse.builder()
                .id(savedTask.getId())
                .title(savedTask.getTitle())
                .description(savedTask.getDescription())
                .build();

        return GlobalResponse.builder()
                .data(taskResponse)
                .message("task has been added")
                .build();
    }

    @Override
    public TaskResponse singleTask() {
        return null;
    }

    @Override
    public TaskInterface updateTask() {
        return null;
    }

    @Override
    public TaskInterface deleteTask() {
        return null;
    }
}
