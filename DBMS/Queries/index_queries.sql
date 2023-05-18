SELECT 
    employeeNumber,
    lastName,
    firstName
FROM 
    employees
WHERE 
    jobTitle = 'Sales Rep';

EXPLAIN FORMAT=JSON SELECT
    employeeNumber,
    lastName,
    firstName
FROM 
    employees
WHERE 
    jobTitle = 'Sales Rep';

CREATE INDEX idx_jobTile on employees(jobTitle);

DROP INDEX idx_email ON leads 

EXPLAIN FORMAT=JSON SELECT
    firstName,
    lastName,
    email
FROM 
    employees
WHERE 
    jobTitle = 'Patterson';

create INDEX name on employees(lastName, firstName);