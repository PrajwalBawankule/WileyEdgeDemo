-- show databases
show databases;


-- create database
CREATE database WileyEdge;


-- select database
USE WileyEdge;
SHOW TABLES;


-- create a table
CREATE TABLE students(
	id INTEGER, 
    Name VARCHAR(20),
    Contact VARCHAR(10), 
	Grade DOUBLE,
	UNIQUE(id)
);


-- inserting values into the table
INSERT INTO students value(1,
	"Prajwal",
	"9307647168",
	90.6);

-- show content of the tables
SELECT * FROM students;


-- drop table
DROP TABLE students;
Show TABLES;


-- drop the database
DROP DATABASE WileyEdge;

SHOW DATABASES;