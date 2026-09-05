# Student Management System (JDBC)

A console-based, menu-driven **Student Management System** built using **Java**, **JDBC**, and **MySQL**.  

This project was created to practice JDBC concepts and follows the **DAO (Data Access Object)** design pattern with a layered architecture for clean code and separation of concerns.

## Features

- Add new student records
- View all student records
- Update existing student details
- Delete student records
- Search students by ID
- Search students by name using pattern matching
- Sort students by marks in descending order
- Interactive menu-driven console interface
- Input validation through the service layer

## Tech Stack

| Technology | Purpose |
|---|---|
| Java | Core programming language |
| JDBC | Connects Java application with MySQL |
| MySQL | Stores student data |
| DAO Pattern | Handles database operations |
| Layered Architecture | Separates model, DAO, service, controller, and utility layers |

## Project Architecture

```text
Student-Management-System/
│
├── model/
│   └── Student.java
│
├── dao/
│   ├── StudentDAO.java
│   └── StudentDAOImpl.java
│
├── service/
│   └── StudentService.java
│
├── controller/
│   └── StudentController.java
│
├── util/
│   └── DBConnection.java
│
└── Main.java
```

## Layer Responsibilities

- **Model:** Contains the `Student` POJO class with fields such as ID, name, age, course, and marks.
- **DAO:** Defines and implements database-related CRUD operations.
- **Service:** Contains business logic and validates user input.
- **Controller:** Handles user interaction through the console menu.
- **Util:** Creates and manages the MySQL database connection.

## Database Setup

1. Install and start MySQL Server.
2. Create a database named `JDBC_demo`.

```sql
CREATE DATABASE JDBC_demo;

USE JDBC_demo;
```

3. Create the `students` table.

```sql
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100) NOT NULL,
    marks DOUBLE NOT NULL
);
'full code'..
'CREATE DATABASE IF NOT EXISTS JDBC_demo;
USE JDBC_demo;
CREATE TABLE IF NOT EXISTS students(
id INT PRIMARY KEY ,
name VARCHAR(100) NOT NULL,
age INT NOT NULL,
course VARCHAR(100),
marks DOUBLE NOT NULL
);
INSERT INTO students(id, name, age, course, marks) VALUES
(1, "Rahul", 21, "CSE", 89.9),
(2, "Krishan Raj Singh", 21, "CSE", 69.0);

select * from students;

'
```

## Configure Database Connection

Open the `DBConnection.java` file and update the database URL, username, and password according to your local MySQL setup.

```java
String url = "jdbc:mysql://localhost:3306/jdbc_project";
String username = "root";
String password = "your_mysql_password";
```

> Make sure the MySQL JDBC Driver dependency/JAR is added to your project before running the application.

## How to Run

1. Clone this repository:

```bash
git clone https://github.com/Rahulkus315/Student-Management-System.git
```

2. Open the project in your preferred Java IDE, such as IntelliJ IDEA, Eclipse, or VS Code.

3. Add the MySQL JDBC driver to the project dependencies.

4. Configure your MySQL credentials in `DBConnection.java`.

5. Run the `Main.java` file.

## Example Menu

```text
===== Student Management System =====

1. Add Student
2. View All Students
3. Search Student by ID
4. Search Student by Name
5. Update Student
6. Delete Student
7. Sort Students by Marks
8. Exit

Enter your choice:
```

## Learning Outcomes

Through this project, I practiced:

- JDBC connectivity with MySQL
- CRUD operations in Java
- SQL queries and prepared statements
- DAO design pattern
- Layered application architecture
- Exception handling
- Input validation
- Console-based application development

## Author

**Rahul Kushwaha**

Feel free to fork this repository, suggest improvements, or use it for learning purposes.
