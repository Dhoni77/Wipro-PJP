--  Delete employees whose name either first or last name has char seq of ‘man’


delete FROM employees where first_name like '%man%' or last_name like '%man%';
SELECT * FROM employees;
