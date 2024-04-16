package ru.chaban.exercise_4.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Entity
@ToString
@Data
public class Users {
    @Id
    @GeneratedValue
    private UUID id;

    private String fio;

    private String username;
}
