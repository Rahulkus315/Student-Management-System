package com.studentmanagement.dao;

import com.studentmanagement.model.Student;
import com.studentmanagement.util.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{
    Connection con = null;
    // insert
    public void addStudent(Student s){
        try {
            con = DBconnection.getConnection();
            String Query = "INSERT INTO students VALUES(?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setInt(1,s.getId());
            ps.setString(2,s.getName());
            ps.setInt(3,s.getAge());
            ps.setString(4,s.getCourse());
            ps.setDouble(5,s.getMarks());
            ps.executeUpdate();
            System.out.println("Student added Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // SELECT
    @Override
    public List<Student> getAllStudent(){
        List<Student> list = new ArrayList<>();
        try {
            con = DBconnection.getConnection();
            String query = "SELECT * FROM student";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("course"),
                        rs.getDouble("marks")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // get Student by id
    public Student getStudentById(int id){
        try {
            String query = "SELECT * FROM students WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("course"),
                        rs.getDouble("marks")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Search by name


    @Override
    public List<Student> searchByName(String name) {
        List<Student> list = new ArrayList<>();
        try{
            String query = "SELECT * RROM students WHERE name LIKE ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,"%" +  name + "%");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                list.add(new Student(
                   rs.getInt("id"),
                   rs.getString("name"),
                   rs.getInt("age"),
                   rs.getString("course"),
                   rs.getDouble("marks")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    // update
    @Override
    public void updateStudent(Student s) {
        try {
            con = DBconnection.getConnection();
            String query = "UPDATE students SET name = ?, age = ?, course = ?, marks = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setString(4, s.getCourse());
            ps.setDouble(5, s.getMarks());
            ps.executeUpdate();
            System.out.println("Student Updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE student

    @Override
    public void deleteStudent(int id) {
        try {
            con = DBconnection.getConnection();
            String query = "DELETE FROM student WHERE ID = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student Deleted!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
