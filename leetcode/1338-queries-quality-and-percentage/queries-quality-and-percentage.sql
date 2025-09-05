# Write your MySQL query statement below
SELECT
m.query_name ,
round(sum(m.rating/m.position) / count(*) , 2)
as quality ,
round(sum(m.rating < 3) / count(*) * 100 , 2)
as poor_query_percentage
from Queries m
group by m.query_name;