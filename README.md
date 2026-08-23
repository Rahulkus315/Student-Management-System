# Student Management System

A Java console application built with JDBC and MySQL.

## Project structure

```text
student-management-system/
├── database/
│   └── schema.sql
├── src/main/java/com/studentmanagement/
│   ├── dao/StudentDao.java
│   ├── model/Student.java
│   ├── service/StudentService.java
│   ├── util/DatabaseConnection.java
│   └── Main.java
├── .gitignore
├── pom.xml
└── README.md
```

## Requirements

- Java 17 or newer
- Maven
- MySQL

## Setup

1. Clone the repository.
2. Run `database/schema.sql` in MySQL.
3. Update the connection values in `DatabaseConnection.java`.
4. Start the application:

```bash
mvn compile exec:java
```

The Maven file downloads the MySQL JDBC driver automatically, so no JAR files need to be copied manually.
