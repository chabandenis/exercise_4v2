package ru.chaban.exercise_4.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@ToString
@Data
public class GroupStart {
    @Id
    @GeneratedValue
    private UUID id;

    private LocalDate onTime;

    private int status;
}
