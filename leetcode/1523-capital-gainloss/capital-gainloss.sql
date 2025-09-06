# Write your MySQL query statement below
SELECT 
q.stock_name , sum(q.price)-(select sum(p.price) from Stocks p where operation = 'Buy' 
and p.
stock_name = q.stock_name) 
as capital_gain_loss
FROM Stocks q
where operation = 'Sell'
group by q.stock_name;