# Write your MySQL query statement below
SELECT s.user_id  , IFNULL(Round(sum(c.action = "confirmed")/count(*),2),0.00) as confirmation_rate
FROM Signups as s 
Left join Confirmations as c
ON s.user_id = c.user_id
GROUP by s.user_id 
Order by confirmation_rate;