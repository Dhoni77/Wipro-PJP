-- Create a report to display the last name and job title of all employees who do not have a manager.

select last_name, job_title from employees where manager is null;