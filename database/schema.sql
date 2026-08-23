CREATE DATABASE IF NOT EXISTS jdbc_project;

USE jdbc_project;

CREATE TABLE IF NOT EXISTS student (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100) NOT NULL,
    marks DOUBLE NOT NULL
);
