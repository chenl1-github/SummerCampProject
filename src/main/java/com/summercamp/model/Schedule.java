package com.summercamp.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schedule_id;
    private String subject;
    private LocalDateTime start_time;
    private LocalDateTime end_time;
    private String description;
    private Long teacher_id;

    // Getters and setters
    // ...
}