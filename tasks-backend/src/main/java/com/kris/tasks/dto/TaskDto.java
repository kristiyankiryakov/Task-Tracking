package com.kris.tasks.dto;

import com.kris.tasks.entity.TaskPriority;
import com.kris.tasks.entity.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {

}
