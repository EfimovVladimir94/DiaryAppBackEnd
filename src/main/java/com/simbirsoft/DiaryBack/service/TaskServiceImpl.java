package com.simbirsoft.DiaryBack.service;

import com.simbirsoft.DiaryBack.dto.TaskDto;
import com.simbirsoft.DiaryBack.entity.Task;
import com.simbirsoft.DiaryBack.repository.TasksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.simbirsoft.DiaryBack.Mapping.TaskMapper.taskDtoToTask;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl {

    private final TasksRepository tasksRepository;

    public void saveTask(TaskDto dto) {
        Task task = taskDtoToTask(dto);
        tasksRepository.save(task);
    }

    public List<Task> getAllTasks(String date) {
        List<Task> allTasksByDate = tasksRepository.findAll();
        long dateStart = Long.parseLong(date);
        List<Task> collect = allTasksByDate.stream().filter(x -> x.getDateStart().getTime() >= dateStart)
                .collect(Collectors.toList());
        return collect;
    }
}
