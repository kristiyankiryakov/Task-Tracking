package com.kris.tasks.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "task_lists")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TaskList {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Column(nullable = false)
    private String title;

    private String description;

    @Column(nullable = false)
    private LocalDate created;

    @Column(nullable = false)
    private Local updated;

    @OneToMany(mappedBy = "taskList", cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private List<Task> tasks;
}
