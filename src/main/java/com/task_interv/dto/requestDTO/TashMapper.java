package com.task_interv.dto.requestDTO;

import com.task_interv.dto.responseDTO.TaskResponse;
import com.task_interv.entity.Task;

public class TashMapper {

    public TaskResponse convertToDto(Task task) {
        return TaskResponse.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .completed(task.isCompleted())
                .build();
    }
}
