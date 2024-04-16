package ru.chaban.exercise_4.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@ToString
@Data
public class Logins {
    @Id
    @GeneratedValue
    private UUID id;

    private LocalDate access_date;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private Users userId;

    private String application;
}
