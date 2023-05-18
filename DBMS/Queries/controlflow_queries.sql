--CASE
    CASE value 
        when value1 THEN result1
        when value2 THEN results
        ....
        [ELSE else_result]
    END


--return the customers and their orders(order count) 
select 
    customerName, 
    count(orderNumber)
from 
    customers 
inner join orders
where customers.customerNumber = orders.customerNumber
group by customerName;

WITH cte AS(
    SELECT
    C.customerName, 
    count(O.customerNumber) AS order_count
FROM 
    customers C 
    LEFT JOIN orders o ON c.customerNumber = o.customerNumber
group by 
    c.customerName,
    c.customerNumber
)
SELECT 
    customerName,
    order_count,
    CASE order_count
        WHEN 1 THEN 'One-time customer'
        WHEN 2 THEN 'Repeated Customer'
        ELSE 'Loyal Customer'
    END customerType
FROM cte
ORDER BY customerName;


-----------------------
--CASE and ORDER BY
--Sort customers by state if the state is not null or sort the country in case state is null
SELECT 
    customerName,
    state,
    country
FROM
    customers
ORDER BY (
        CASE 
            WHEN state IS NOT NULL THEN state 
            ELSE country 
        END);

---------------------------------
SUM to calculate total sales order by order status
SELECT 
    SUM(
        CASE
            WHEN status = 'Shipped' THEN 1
            ELSE 0
        END
    ) AS 'Shipped',
    SUM(
        CASE
            WHEN status = 'On Hold' THEN 1 
            ELSE 0
        END
    ) AS 'On Hold',
    COUNT(*) AS Total
FROM 
    orders;


--IF
SELECT IF(1 = 2,'TRUE','FALSE');

SELECT
    customerName,
    customerNumber,
    IF(state IS NULL,'NA',state) state,
    country
FROM 
    customers;

--IFNULL
IFNULL(exp1,exp2); if exp1 is null then return exp2


--NULLIF

NULLIF(exp1,exp2); if exp1=exp2 then return null else exp1
