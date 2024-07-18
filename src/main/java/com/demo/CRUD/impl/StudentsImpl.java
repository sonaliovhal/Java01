package com.demo.CRUD.impl;

import com.demo.CRUD.entities.Student;
import com.demo.CRUD.repos.StudentsRepository;
import com.demo.CRUD.services.Studentservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentsImpl implements Studentservices {
    @Autowired
    private StudentsRepository studentsRepository;
    @Override
    public Integer saveStudent(Student student) {
        return studentsRepository.save(student).getStdId();
    }

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) studentsRepository.findAll();
    }

    @Override
    public Student getStudentsById(Integer stdId) {
        return studentsRepository.findById(stdId).get();
    }

    @Override
    public void deleteStudent(Integer stdId) {
studentsRepository.deleteById(stdId);
    }
}
