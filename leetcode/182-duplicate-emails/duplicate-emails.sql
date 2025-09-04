# Write your MySQL query statement below
SELECT email as Email
FROM Person 
Group BY Email 
Having count(*) > 1;