package com.kris.tasks.mapper;

import com.kris.tasks.dto.TaskDto;
import com.kris.tasks.entity.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
