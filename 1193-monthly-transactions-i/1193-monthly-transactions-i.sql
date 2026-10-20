# Write your MySQL query statement below
SELECT LEFT(trans_date, 7) as month,
    country,
    count(*) AS trans_count , 
    sum(state ="approved") AS approved_count,
    sum(amount) AS trans_total_amount,
    SUM(CASE WHEN state = 'approved' THEN amount ELSE 0 END) AS approved_total_amount
    from Transactions 
    GROUP BY LEFT(trans_date, 7), country;