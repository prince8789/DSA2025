# Write your MySQL query statement below
select query_name,ROUND(AVG(rating/position),2) as quality,
round(SUM(rating < 3)/count(*)*100.00,2) as poor_query_percentage 
from Queries group by Query_name;