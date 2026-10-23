# Write your MySQL query statement below
SELECT p.firstName, p.lastName, a.city, a.state
from person as p
Left join address as a
on p.personId = a.personId;