-- Display the last names of all employees who have both an āaā and an āeā in their last name.

select last_name from employees where last_name like '%a%' and last_name like '%e%;