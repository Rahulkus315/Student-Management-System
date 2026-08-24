package com.studentmanagement.dao;

import com.studentmanagement.model.Student;

import java.util.List;

public interface StudentDAO {
    void addStudent(Student s);
    List<Student> getAllStudent();
    Student getStudentById(int id);
    List<Student> searchByName(String name);
    void updateStudent(Student s);
    void deleteStudent(int id);
}
