package com.studentmanagement.service;

import com.studentmanagement.dao.StudentDAO;
import com.studentmanagement.dao.StudentDAOImpl;
import com.studentmanagement.model.Student;

import java.util.Comparator;
import java.util.List;

public class StudentService {
    StudentDAO dao = new StudentDAOImpl();
    public void addStudent(Student s){
        if(s.getAge() <= 0 || s.getName().isEmpty()){
            System.out.println("Invalid input");
            return;
        }
        if(dao.getStudentById(s.getId()) != null){
            System.out.println("Id already exists");
            return;
        }
        dao.addStudent(s);
    }

    // viewing all the students

    public void viewAllStudents(){
        List<Student> list = dao.getAllStudent();
        if(list.isEmpty()){
            System.out.println("No data Found");
            return;
        }
        for(Student s : list){
            System.out.println(s);
        }
    }

    // Search by id

    public void searchById(int id){
        Student s = dao.getStudentById(id);
        if(s == null){
            System.out.println("Not Found");
        }else {
            System.out.println("\nID | NAME | AGE | COURSE | MARKS");
            System.out.println(s);
        }
    }

    // search by name
    public void searchByName(String name){
        List<Student> list = dao.searchByName(name);
        if(list.isEmpty()){
            System.out.println("No matching record found");
            return;
        }else {
            System.out.println("\nID | NAME | AGE | COURSE | MARKS");
            list.forEach(System.out::println);
        }
    }

    // update student
    public void updateStudent(Student s){
        if(dao.getStudentById(s.getId()) == null){
            System.out.println("Student not Found!");
            return;
        }
        dao.updateStudent(s);
    }

    // delete student
    public void deleteStudent(int id){
        if(dao.getStudentById(id) == null){
            System.out.println("Student not found!");
        }
        dao.deleteStudent(id);
    }

    // sort by marks
    public void sortByMarks(){
        List<Student> list = dao.getAllStudent();
        if(list.isEmpty()){
            System.out.println("No data Found!");
            return;
        }
        else{
            list.sort(Comparator.comparingDouble(Student::getMarks).reversed());
            list.forEach(s ->{
                System.out.println(s.getName() + " | " + s.getMarks());
            });
        }
    }
}
