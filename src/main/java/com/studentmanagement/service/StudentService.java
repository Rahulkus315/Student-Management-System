package com.studentmanagement.service;

import com.studentmanagement.model.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);

    List<Student> getAllStudents();
}
