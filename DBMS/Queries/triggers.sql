CREATE TABLE employees_audit(
    id INT AUTO_INCREMENT PRIMARY KEY,
    employeeNumber INT NOT NULL,
    lastname VARCHAR(50) NOT NULL,
    changedate VARCHAR(50) DEFAULT NULL
);

CREATE TRIGGER before_employee_update
    BEFORE UPDATE ON employees
    FOR EACH ROW 
INSERT INTO employees_audit
SET action = 'update',
    employeeNumber = OLD.employeeNumber,
    lastname = OLD.lastname,
    changedate = NOW();

SELECT employeeNumber, lastname from employees WHERE employeeNumber = 1056;
+----------------+-----------+
| employeeNumber | lastname  |
+----------------+-----------+
|           1056 | Patterson |
+----------------+-----------+
1 row in set (0.01 sec)


UPDATE employees SET lastname="steve" WHERE employeeNumber=1056;


---------------------------
SHOW TRIGGERS;


-----------------------
-- trigger to Add into remainder table if member dob is missing 

Create Table Member( 
    id int,
    name varchar(20), 
    email varchar(20),
    dob datetime null
);

Create Table Reminder( 
        id int,
        name varchar(20),
        message varchar(100)
    );

DELIMITER $$
Create TRIGGER after_members_insert
    After INSERT on member
    for each row 
BEGIN 
    if NEW.dob == null THEN 
        INSERT INTO reminder(id,name,message)
        values(NEW.id,NEW.name,concat('Hi ',New.name,', please update your dob.'))
    END IF;
END $$
DELIMITER ;

Create Table Cust( 
        id int,
        name varchar(20),
        email varchar(50),
        phone varchar(10),
        extra_payment INT,
        emi_amount INT
    );

DELIMITER $$
Create TRIGGER before_extra_payment
    BEFORE INSERT on Cust
    for each row 
BEGIN 
    if (NEW.extra_payment > 2*NEW.emi_amount) null THEN 
        INSERT INTO reminder(id,name,message)
        values(NEW.id,NEW.name,concat('Hi ',New.name,', please update your dob.'))
    END IF;
END $$
DELIMITER ;