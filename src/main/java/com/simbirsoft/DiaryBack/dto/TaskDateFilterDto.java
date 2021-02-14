package com.simbirsoft.DiaryBack.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TaskDateFilterDto {

    private Timestamp dateStart;
    private Timestamp dateFinish;

}
