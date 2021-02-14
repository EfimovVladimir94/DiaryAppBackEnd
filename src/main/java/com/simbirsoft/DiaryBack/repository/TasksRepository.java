package com.simbirsoft.DiaryBack.repository;

import com.simbirsoft.DiaryBack.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends JpaRepository<Task, Long> {

}
