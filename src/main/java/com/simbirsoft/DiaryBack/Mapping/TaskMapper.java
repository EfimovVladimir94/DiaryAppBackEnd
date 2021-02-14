package com.simbirsoft.DiaryBack.Mapping;

import com.simbirsoft.DiaryBack.dto.TaskDto;
import com.simbirsoft.DiaryBack.entity.Task;

public class TaskMapper {
    public static Task taskDtoToTask(TaskDto taskDto) {
        Task task = new Task();
        task.setId(taskDto.getId());
        task.setDateStart(taskDto.getDateStart());
        task.setDateFinish(taskDto.getDateFinish());
        task.setName(taskDto.getName());
        task.setDescription(taskDto.getDescription());
        return task;
    }
}
