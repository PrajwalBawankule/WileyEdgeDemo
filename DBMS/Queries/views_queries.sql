-- customer and payments

--create view and return data from both the tables using inner join

CREATE VIEW CustomerPayments AS
    SELECT 
        customerName, 
        phone, 
        paymentDate, 
        amount
    FROM customers c 
    INNER JOIN payments p 
    ON c.customerNumber=p.customerNumber;