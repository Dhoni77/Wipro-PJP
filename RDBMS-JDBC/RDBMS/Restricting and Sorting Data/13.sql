-- Display the last names of all employees who have both an “a” and an “e” in their last name.

select last_name from employees where last_name like '%a%' and last_name like '%e%;