package com.demo.CRUD.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Student")
public class Student {

    public Student() {
    }

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    private int stdId;
    private String stdName;
    private String stdclass;
    private String SchoolName;

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdclass() {
        return stdclass;
    }

    public void setStdclass(String stdclass) {
        this.stdclass = stdclass;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public Student(int stdId, String stdName, String stdclass, String schoolName) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdclass = stdclass;
        this.SchoolName = schoolName;
    }
}
