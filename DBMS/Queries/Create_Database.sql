CREATE DATABASE IF NOT EXISTS employeedb;

USE employeedb;

-- create tables
CREATE TABLE merits (
    performance INT(11) NOT NULL,
    percentage FLOAT NOT NULL,
    PRIMARY KEY (performance)
);


CREATE TABLE employees (
    emp_id INT(11) NOT NULL AUTO_INCREMENT,
    emp_name VARCHAR(255) NOT NULL,
    performance INT(11) DEFAULT NULL,
    salary FLOAT DEFAULT NULL,
    PRIMARY KEY (emp_id),
    CONSTRAINT fk_performance FOREIGN KEY (performance) REFERENCES merits (performance)
);


-- insert data for merits table
INSERT INTO merits(performance,percentage)
VALUES(1,0),
      (2,0.01),
      (3,0.03),
      (4,0.05),
      (5,0.08);


-- insert data for employees table
INSERT INTO employees(emp_name,performance,salary)      
VALUES('Venkat', 1, 50000),
      ('Prajwal', 3, 65000),
      ('Steve Fernandes', 4, 75000),
      ('Swati Jha', 5, 125000),
      ('Jahnavi T', 3, 85000),
      ('Riti Rathore', 2, 45000),
      ('Sachin Kumar', 3, 55000);

UPDATE employees INNER JOIN merits ON employees.performance=merits.performance
SET salary = salary+salary*percentage;

SELEcT * from employees;

+--------+-----------------+-------------+--------+
| emp_id | emp_name        | performance | salary |
+--------+-----------------+-------------+--------+
|      1 | Venkat          |           1 |  50000 |
|      2 | Prajwal         |           3 |  66950 |
|      3 | Steve Fernandes |           4 |  78750 |
|      4 | Swati Jha       |           5 | 135000 |
|      5 | Jahnavi T       |           3 |  87550 |
|      6 | Riti Rathore    |           2 |  45450 |
|      7 | Sachin Kumar    |           3 |  56650 |
+--------+-----------------+-------------+--------+
7 rows in set (0.00 sec)


--DELETE CASCADE

CREATE TABLE buildings (
    building_no INT PRIMARY KEY AUTO_INCREMENT,
    building_name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
);

CREATE TABLE rooms (
    room_no INT PRIMARY KEY AUTO_INCREMENT,
    room_name VARCHAR(255) NOT NULL,
    building_no INT NOT NULL,
    FOREIGN KEY (building_no)
        REFERENCES buildings (building_no)
        ON DELETE CASCADE
);

INSERT INTO buildings(building_name,address)
VALUES('ACME Headquaters','3950 North 1st Street CA 95134'),
      ('ACME Sales','5000 North 1st Street CA 95134');

INSERT INTO rooms(room_name,building_no)
VALUES('Amazon',1),
      ('War Room',1),
      ('Office of CEO',1),
      ('Marketing',2),
      ('Showroom',2);

show databases;

SELECT table_name FROM REFERENTIAL_CONSTRAINTS WHERE
    CONSTRAINT_SCHEMA="employeedb" 