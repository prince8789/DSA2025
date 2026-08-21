# Write your MySQL query statement below
select p.product_id, ifNUll(round(sum(p.price*u.units)/sum(u.units),2) ,0) as average_price
from prices as p  
left join UnitsSold as u 
on p.product_id = u.product_id
and purchase_date >= start_date and purchase_date <= end_date
group by p.product_id;