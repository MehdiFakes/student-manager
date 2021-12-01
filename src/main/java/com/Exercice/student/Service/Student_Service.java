package com.Exercice.student.Service;

import com.Exercice.student.Exception.usernotfound;
import com.Exercice.student.Repo.StudentRepo;
import com.Exercice.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class Student_Service {
    private final StudentRepo studentRepo;

    @Autowired
    public Student_Service(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student) {
        student.setStudentCode(UUID.randomUUID().toString());
        return studentRepo.save(student);
    }

    public List<Student> findAllStudents() {
        return studentRepo.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student findStudentById(Long id) {
        return (Student) studentRepo.findStudentById(id)
                .orElseThrow(() -> new usernotfound("User by id " + id + " was not found"));
    }

    public void deleteStudent(Long id){
        studentRepo.deleteStudentById(id);
    }
}
