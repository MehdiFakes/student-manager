package com.Exercice.student.Resources;

import com.Exercice.student.Service.Student_Service;
import com.Exercice.student.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentResources{
    private final Student_Service student_service;
    public StudentResources(Student_Service student_service){
        this.student_service = student_service;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Student>>  getAllStudents (){
        List<Student> students= student_service.findAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Student>  getStudentId (@PathVariable("id") Long id){
        Student student = student_service.findStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @PostMapping("/add")
    public  ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student newStudent = student_service.addStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }
    @PutMapping("/Update")
    public  ResponseEntity<Student> UpdateStudent(@RequestBody Student student){
        Student UpdateStudent = student_service.updateStudent(student);
        return new ResponseEntity<>(UpdateStudent, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteStudent(@PathVariable("id") Long id){
        student_service.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
