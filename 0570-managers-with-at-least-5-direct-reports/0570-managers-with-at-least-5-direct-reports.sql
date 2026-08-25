# Write your MySQL query statement below
select e1.name 
from Employee as e1
INNER JOIN Employee as e2
ON e1.id = e2.managerId
GROUP BY e2.managerId
HAVING count(e2.managerId) >=5;
