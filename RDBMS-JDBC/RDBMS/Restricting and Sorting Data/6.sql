-- List employees who earn between $5,000 and $12,000, and are in department 20 or 50. Label the columns as
--Employee and Monthly Salary, respectively.

select last_name as Employee, salary as Monthly Salary from employees where salary between 5000 and 12000 and department_id in (20,50); 