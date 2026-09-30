package com.task_interv.exception;


import com.task_interv.dto.responseDTO.GlobalResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = TaskNotFoundException.class)
    public GlobalResponse<Object> fetchTaskException(TaskNotFoundException ex){
        GlobalResponse<Object> response = GlobalResponse.builder()
                .data(new ArrayList<>())
                .message(ex.message)
                .build();
        return response;
    }
}
