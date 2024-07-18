package com.demo.CRUD.services;

import com.demo.CRUD.entities.Student;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/*@Service
@Transactional*/
public interface Studentservices {

    public Integer saveStudent(Student student);

    public List<Student> getAllStudents();
    public Student getStudentsById(Integer stdId);
    public void deleteStudent(Integer stdId);


}

