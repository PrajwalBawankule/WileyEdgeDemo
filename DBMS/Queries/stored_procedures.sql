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

SHOW procedure status WHERE db='WIleyEdge';

SHOW procedure status LIKE= '%order%';

---List Procedure using data dictionary

SELECT 
    routine name FROM information_schema.routines
    WHERE routine_type = 'PROCEDURE'
    AND 
    routine_schema = 'WileyEdge';
    
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



-----------------------------
--Stored procedure with Error handling

DECLARE action HANDLER FOR condition_value statement;

CONTINUE OR EXIT?

-------

CREATE TABLE supplierProducts(
    supplierId INT,
    productId INT,
    PRIMARY KEY (supplierId,productId)
);

DELIMITER $$
CREATE PROCEDURE InsertSupplierProduct(
    IN inSupplierId INT,
    IN inProductId INT
)
BEGIN
    --exit if the duplicate key occurs
    DECLARE EXIT HANDLER FOR 1062
    BEGIN
        SELECT CONCAT('Duplicate key (', inSupplierId, ',', inProductId,') occured') AS message;
    END;

    --insert new row into the supplierProducts

    INSERT INTO supplierProducts(supplierId, productId)
    VALUES(inSupplierId,inProductId);

    --return the products supplier by the supplier id

    SELECT count(*)
    FROM supplierProducts
    WHERE supplierId = inSupplierId
END $$
DELIMITER ;


----------------
--working with function

DELIMITER $$
CREATE FUNCTIOn function_name(
    parameter 1,
    parameter 2,
    ......
)
RETURN data_type
BEGIN 
    --statements
END $$
DELIMITER ;

--create a function tthat returns the customer level based on credit
DELIMITER $$
CREATE FUNCTION CustomerLevel(
    credit DECIMAL(10,2)
)
RETURNS varchar(20)
DETERMINISTIC
BEGIN 
    DECLARE CustomerLevel VARCHAR(20);

    IF credit > 5000 THEN 
        SET CustomerLevel = 'PLATINUM';
    ELSEIF (credit >= 5000 AND credit<=10000) THEN 
        SET CustomerLevel = 'GOLD';
    ELSEIF credit < 10000 THEN 
        SET CustomerLevel = 'SILVER';
    END IF;

    RETURN (CustomerLevel);
END $$
DELIMITER ;

--listing funcions
SHOW FUNCTION STATUS WHERE db = 'WileyEdge';

--calling function
SELECT 
    customerName,
    CustomerLevel(creditLimit)
FROM 
    customers 
ORDER BY 
    customerName;