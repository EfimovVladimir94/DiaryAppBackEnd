package com.simbirsoft.DiaryBack.controller;

import com.simbirsoft.DiaryBack.dto.TaskDateFilterDto;
import com.simbirsoft.DiaryBack.dto.TaskDto;
import com.simbirsoft.DiaryBack.entity.Task;
import com.simbirsoft.DiaryBack.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private TaskServiceImpl taskService;

    @PostMapping(path = "v1/task", consumes = "application/json")
    public void saveDiaryTask(@RequestBody TaskDto taskDto) {
        taskService.saveTask(taskDto);
    }

    @GetMapping(path = "v1/listTasks")
    public List<Task> getTasks(@RequestParam String dateStart) {
        return taskService.getAllTasks(dateStart);
    }

}
