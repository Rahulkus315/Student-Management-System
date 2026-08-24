package main;

import com.studentmanagement.controller.StudentController;

public class MainApp {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.start();
    }
}
