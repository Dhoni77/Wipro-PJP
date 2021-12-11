--  Display the last name, job, and salary for all employees whose jobs are either those of a sales representative or 
-- of a stock clerk, and whose salaries are not equal to $2,500, $3,500, or $7,000.

select last_name, job , salary from employees where job in('Sales Representative', 'Sales Clerk') and salary not in(2500,3500,7000);