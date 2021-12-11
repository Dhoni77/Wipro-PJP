--  Create a query to increase salary by 10% for all employees in dept 90.

update employees  set salary=salary+ salary*.10 where department_id=90;
SELECT * FROM employees;