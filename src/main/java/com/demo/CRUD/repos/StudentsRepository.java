package com.demo.CRUD.repos;

import com.demo.CRUD.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends CrudRepository<Student,Integer> {
}
