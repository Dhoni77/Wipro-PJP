-- To find high-salary and low-salary employees. Create a query to display the last name and salary for any employee
-- whose salary is not in the range of $5,000 to $12,000

select last_name, salary from employees where salary not between 5000 and 12000;