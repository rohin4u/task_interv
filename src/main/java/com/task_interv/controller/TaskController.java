package com.task_interv.controller;


import com.task_interv.dto.requestDTO.TaskRequest;
import com.task_interv.dto.responseDTO.GlobalResponse;
import com.task_interv.serviceImpl.TaskServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
@RequestMapping("/task_executor")
@Slf4j
public class TaskController {



    public TaskServiceImpl taskService;

    @Autowired
    TaskController(TaskServiceImpl taskService){
        this.taskService=taskService;
    }


    @PostMapping("/save_task")
    public ResponseEntity<GlobalResponse<Object>> saveTask(@RequestBody TaskRequest taskRequest){

        String corralationId = String.valueOf(new Random().nextInt(6));

       log.info("in postmapping method : "+corralationId);

        GlobalResponse<Object> objectGlobalResponse = taskService.postTask(taskRequest, corralationId);

        return ResponseEntity.ok(objectGlobalResponse);

    }




}
