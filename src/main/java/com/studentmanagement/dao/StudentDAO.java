package com.studentmanagement.dao;

import com.studentmanagement.model.Student;

import java.util.List;

interface StudentDAO {
    void addStudent(Student s);
    List<Student> getAllStudent();
    void updateStudent(Student s);
    void deleteStudent(int id);
}
