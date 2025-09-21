-- # Write your MySQL query statement below
select name 
from Salesperson s
where s.sales_id not in
(select o.sales_id 
from Orders o , Company c
where c.com_id = o.com_id and
c.name = 'RED' 
);

-- SELECT s.name
-- FROM SalesPerson s
-- LEFT JOIN Orders o ON s.sales_id = o.sales_id
-- LEFT JOIN Company c ON o.com_id = c.com_id AND c.name = 'RED'
-- WHERE c.com_id IS NULL;
