package com.studentmanagement.dao;

import com.studentmanagement.model.Student;

import java.util.List;

public interface StudentDao {
    void add(Student student);

    List<Student> findAll();
}
