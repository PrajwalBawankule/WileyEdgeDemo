--where 
SELECT firstName, 
    lastName,
    jobTitle 
from employees
WHERE 
    jobTitle="Sales Rep" AND `officeCode`=1;

+-----------+----------+-----------+
| firstName | lastName | jobTitle  |
+-----------+----------+-----------+
| Leslie    | Jennings | Sales Rep |
| Leslie    | Thompson | Sales Rep |
+-----------+----------+-----------+
2 rows in set (0.01 sec)


-- between
SELECT firstName, 
    lastName,
    jobTitle, 
    officeCode 
FROM employees
WHERE 
    `officeCode` BETWEEN 1 AND 3;

+-----------+-----------+--------------------+------------+
| firstName | lastName  | jobTitle           | officeCode |
+-----------+-----------+--------------------+------------+
| Diane     | Murphy    | President          | 1          |
| Mary      | Patterson | VP Sales           | 1          |
| Jeff      | Firrelli  | VP Marketing       | 1          |
| Anthony   | Bow       | Sales Manager (NA) | 1          |
| Leslie    | Jennings  | Sales Rep          | 1          |
| Leslie    | Thompson  | Sales Rep          | 1          |
| Julie     | Firrelli  | Sales Rep          | 2          |
| Steve     | Patterson | Sales Rep          | 2          |
| Foon Yue  | Tseng     | Sales Rep          | 3          |
| George    | Vanauf    | Sales Rep          | 3          |
+-----------+-----------+--------------------+------------+
10 rows in set (0.00 sec)



--LIKE wildcard operator
SELECT 
    lastName, 
    firstName 
FROM employees 
WHERE 
    `lastName` LIKE "%son" 
ORDER BY `firstName`;

+-----------+-----------+
| lastName  | firstName |
+-----------+-----------+
| Thompson  | Leslie    |
| Patterson | Mary      |
| Patterson | Steve     |
| Patterson | William   |
+-----------+-----------+
4 rows in set (0.00 sec)


-- IN OPERATOR
SELECT 
    firstName, 
    lastName,
    jobTitle, 
    officeCode
FROM employees
WHERE `officeCode` IN (1,2,3);

+-----------+-----------+--------------------+------------+
| firstName | lastName  | jobTitle           | officeCode |
+-----------+-----------+--------------------+------------+
| Diane     | Murphy    | President          | 1          |
| Mary      | Patterson | VP Sales           | 1          |
| Jeff      | Firrelli  | VP Marketing       | 1          |
| Anthony   | Bow       | Sales Manager (NA) | 1          |
| Leslie    | Jennings  | Sales Rep          | 1          |
| Leslie    | Thompson  | Sales Rep          | 1          |
| Julie     | Firrelli  | Sales Rep          | 2          |
| Steve     | Patterson | Sales Rep          | 2          |
| Foon Yue  | Tseng     | Sales Rep          | 3          |
| George    | Vanauf    | Sales Rep          | 3          |
+-----------+-----------+--------------------+------------+
10 rows in set (0.00 sec)


--IS NULL
SELECT 
    firstName, 
    lastName, 
    reportsTo 
FROM employees
WHERE `reportsTo` IS NULL;

+-----------+----------+-----------+
| firstName | lastName | reportsTo |
+-----------+----------+-----------+
| Diane     | Murphy   |      NULL |
+-----------+----------+-----------+
1 row in set (0.00 sec)



-- <> operator    NOt equal
SELECT 
    firstName, 
    lastName, 
    `jobTitle` 
FROM 
    employees
WHERE `jobTitle` <> "Sales Rep";

+-----------+-----------+----------------------+
| firstName | lastName  | jobTitle             |
+-----------+-----------+----------------------+
| Diane     | Murphy    | President            |
| Gerard    | Bondur    | Sale Manager (EMEA)  |
| William   | Patterson | Sales Manager (APAC) |
| Anthony   | Bow       | Sales Manager (NA)   |
| Jeff      | Firrelli  | VP Marketing         |
| Mary      | Patterson | VP Sales             |
+-----------+-----------+----------------------+
6 rows in set (0.00 sec)


--DISTINCT operator
SELECT 
    DISTINCT lastName 
FROM employees 
    ORDER BY `lastName`;

+-----------+
| lastName  |
+-----------+
| Bondur    |
| Bott      |
| Bow       |
| Castillo  |
| Firrelli  |
| Fixter    |
| Gerard    |
| Hernandez |
| Jennings  |
| Jones     |
| Kato      |
| King      |
| Marsh     |
| Murphy    |
| Nishi     |
| Patterson |
| Thompson  |
| Tseng     |
| Vanauf    |
+-----------+
19 rows in set (0.00 sec)


SELECT 
    DISTINCT state,city 
FROM customers 
    WHERE state IS NOT NULL 
    ORDER BY state,city;  

+---------------+----------------+
| state         | city           |
+---------------+----------------+
| BC            | Tsawassen      |
| BC            | Vancouver      |
| CA            | Brisbane       |
| CA            | Burbank        |
| CA            | Burlingame     |
| CA            | Glendale       |
| CA            | Los Angeles    |
| CA            | Pasadena       |
| CA            | San Diego      |
| CA            | San Francisco  |
| CA            | San Jose       |
| CA            | San Rafael     |
| Co. Cork      | Cork           |
| CT            | Bridgewater    |
| CT            | Glendale       |
| CT            | New Haven      |
| Isle of Wight | Cowes          |
| MA            | Boston         |
| MA            | Brickhaven     |
| MA            | Cambridge      |
| MA            | New Bedford    |
| NH            | Nashua         |
| NJ            | Newark         |
| NSW           | Chatswood      |
| NSW           | North Sydney   |
| NV            | Las Vegas      |
| NY            | NYC            |
| NY            | White Plains   |
| Osaka         | Kita-ku        |
| PA            | Allentown      |
| PA            | Philadelphia   |
| Pretoria      | Hatfield       |
| Québec        | Montréal       |
| Queensland    | South Brisbane |
| Tokyo         | Minato-ku      |
| Victoria      | Glen Waverly   |
| Victoria      | Melbourne      |
+---------------+----------------+
37 rows in set (0.00 sec)



SELECT 
    customerName, 
    country 
FROM customers 
    WHERE country="USA" 
    AND state="CA" 
    AND creditLimit>100000;

+------------------------------+---------+
| customerName                 | country |
+------------------------------+---------+
| Mini Gifts Distributors Ltd. | USA     |
| Collectable Mini Designs Co. | USA     |
| Corporate Gift Ideas Co.     | USA     |
+------------------------------+---------+
3 rows in set (0.00 sec)