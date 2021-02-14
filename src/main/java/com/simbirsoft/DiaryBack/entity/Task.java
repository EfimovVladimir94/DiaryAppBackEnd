package com.simbirsoft.DiaryBack.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
public class Task {

    @Id
    private Long id;

    @Column(name = "date_start", unique = true, nullable = false)
    private Timestamp dateStart;

    @Column(name = "date_finish")
    private Timestamp dateFinish;

    private String name;

    private String description;
}
