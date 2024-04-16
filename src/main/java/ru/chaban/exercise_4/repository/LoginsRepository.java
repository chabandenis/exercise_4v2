package ru.chaban.exercise_4.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.chaban.exercise_4.domain.Users;

import java.util.UUID;

public interface LoginsRepository extends JpaRepository<Users, UUID> {

//    List<Users> findByStatus(int status);

}
