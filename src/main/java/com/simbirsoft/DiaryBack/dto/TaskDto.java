package com.simbirsoft.DiaryBack.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TaskDto {

    private Long id;
    private Timestamp dateStart;
    private Timestamp dateFinish;
    private String name;
    private String description;
}
