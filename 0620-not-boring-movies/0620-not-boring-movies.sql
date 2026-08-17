# Write your MySQL query statement below
SELECT C.id, C.movie, C.description, c.rating
FROM Cinema AS C
WHERE id % 2 != 0 AND description != 'boring'
ORDER BY rating DESC ;