# Write your MySQL query statement below

#SELECT DISTINCT P.email FROM Person P JOIN Person d
#ON P.email = d.email AND P.id != d.id;
SELECT email FROM Person
GROUP BY email
HAVING COUNT(*) > 1;