package com.demo.CRUD.controller;

import com.demo.CRUD.entities.Student;
import com.demo.CRUD.services.Studentservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentDetails")
public class StudentController {
    @Autowired
     private  Studentservices service;

    @PostMapping("/saveStudent")
    public ResponseEntity<String> saveStudent(@RequestBody Student student) {
        int id = service.saveStudent(student);
        return new ResponseEntity<>("Student with'" + id + "'has been saved", HttpStatus.OK);
    }

@GetMapping("/studentList")
    public ResponseEntity<List<Student>> getAllStudentsDetails() {
        List<Student> list = service.getAllStudents();
        return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
    }

    @GetMapping("/getStudentById/{stdId}")
    public ResponseEntity<Student> getStudentById(@PathVariable("stdId") Integer stdId) {
        Student std = service.getStudentsById(stdId);
        return new ResponseEntity<Student>(std, HttpStatus.OK);
    }

    @PutMapping("/updateStudent/{stdId}")
    public Integer updateStudent(@PathVariable("stdId") int stdId, @RequestBody Student student) {
        Student stdFromDb = service.getStudentsById(stdId);
        stdFromDb.setStdName(student.getStdName());
        stdFromDb.setStdclass(student.getStdclass());
        stdFromDb.setSchoolName(student.getSchoolName());
        Integer integer=service.saveStudent(student);
      //  int id = service.getStudentsById(stdId);
        return integer;

    }

    @DeleteMapping("deleteStudent/{stdId}")
    public ResponseEntity<String> deleteStudent(@PathVariable("stdId") Integer stdId) {
        service.deleteStudent(stdId);
        return new ResponseEntity<String>("Student with '" + stdId + "' has been deleted", HttpStatus.OK);
    }

}