package ru.chaban.exercise_4.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.chaban.exercise_4.domain.GroupStart;

import java.util.List;
import java.util.UUID;

public interface GroupStartRepository extends JpaRepository<GroupStart, UUID> {

    List<GroupStart> findByStatus(int status);

}
