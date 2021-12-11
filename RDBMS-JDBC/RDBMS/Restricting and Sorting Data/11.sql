-- Create a query that prompts the user for a manager ID and generates the employee ID, last name, salary and department
-- for that manager’s employees and prompts a column name by which result should be sorted.
-- Eg:manager_id :103
-- sorted_by : last_name

select * from employees where manager_id=&manager_id order by '&col_name';
