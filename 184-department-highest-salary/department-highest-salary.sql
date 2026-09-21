# Write your MySQL query statement below
SELECT d.name as Department, e.name as Employee, e.salary as Salary
FROM Employee e JOIN Department d ON d.id=e.departmentId
LEFT JOIN Employee e2 
ON e2.departmentId=e.departmentId
AND e2.salary>e.salary
WHERE e2.id IS NULL;
