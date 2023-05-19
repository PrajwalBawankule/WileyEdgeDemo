--Create a stored procedure 
DELIMITER $$
CREATE PROCEDURE GetCustomers()
BEGIN
    SELECT 
        customerName,
        city,
        state,
        postalcode,
        country
    FROM 
        customers 
    ORDER BY customerName;
END $$
DELIMITER;

----------------------------

--Calling Procedure
CALL GeCustomers();

------------------------

--Change the delimiter
DELIMITER delimiter_character;

RESET DELIMITER;


--------------------
Create procedure to get all products

DELIMITER $$
CREATE PROCEDURE GetProducts()
BEGIN
    SELECT 
        *
    FROM 
        products 
    ORDER BY productName;
END $$
DELIMITER;

--------------------------------

CREATE PROCEDURE procedure_name(paraameter_list)
BEGIN
    statements;
END //

CALL procedure_name(argument_list);


-------------

DELIMITER $$
USE 'wileyEdge' $$
CREATE PROCEDURE GetAllCustomers()
BEGIN 
    SELECT * FROM customers;
END $$
DELIMITER;

------------------------
--Drop Procedure
DROP procedure if EXISTS 'getAllCustomers';

------------
--List Procedures
SHOW procedure status;

-----------------

--Create procedures using parameters

[IN | OUT | INOUt procedure_name data_type(length)]


DELIMITER $$
CREATE PROCEDURE GetOfficesByCountry(
    IN countryName VARCHAR(255)
)  
BEGIN
    SELECT * FROM offices WHERE country = countryName;
END $$
DELIMITER ;

CALL GetOfficesByCountry('France');


-----------------------
--create a procedure to return number of orders by order status
--input parameter -- order status varchar(255)
--output -- total INT

DELIMITER $$
CREATE PROCEDURE GetNumberOfOrders(
    IN orderStatus VARCHAR(255),
    OUT total INT
)  
BEGIN
    SELECT count(orderNumber) 
    INTO total 
    FROM orders
    WHERE status = orderStatus ;
END $$
DELIMITER ;

CALL GetNumberOfOrders('Shipped',@total);

SELECT @total as total_orders_shipped;

--------------------------------------

DELIMITER $$
CREATE PROCEDURE SetCounter(
    INOUT counter INT,
    IN inc INT
)  
BEGIN
    SET counter = countr + inc;
END $$
DELIMITER ;

SET @counter = 1;
CALL SetCounter(@counter,1);  --2
CALL SetCounter(@counter,1);  --3
CALL SetCounter(@counter,8);  --11

SELECT @counter;  --11



----------------------

--Declaring variables
DECLARE a,b INT DEFAULT 0;


DECLARE t DEC(10,2) DEFAULT 0.0;


--Assign values to variables
SET variable_name = value;


DELIMITER $$
CREATE PROCEDURE GetTotalOrder()
BEGIN
    DECLARE totalOrder INT DEFAULT 0;

    SELECT count(*)
    INTO totalOrder
    FROM orders;

    SELECT totalOrder;   --return value here only

END $$
DELIMITER ;

CALL GetTotalOrder();




