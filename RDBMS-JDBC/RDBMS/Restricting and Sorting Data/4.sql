-- Create a report to display the last name, job ID, and hire date for employees with the last names of Matos and Taylor. 
--Order the query in ascending order by the hire date.

select last_name, job_id, hire_date from employees where last_name in('Matos','Taylor') order by hire_date asc;
