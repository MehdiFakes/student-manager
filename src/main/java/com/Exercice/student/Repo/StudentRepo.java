package com.Exercice.student.Repo;

import com.Exercice.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {
    Optional<Object> findStudentById(Long id);

    void deleteStudentById(Long id);
}
