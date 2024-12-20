package com.kris.tasks.mapper;

import com.kris.tasks.dto.TaskListDto;
import com.kris.tasks.entity.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
