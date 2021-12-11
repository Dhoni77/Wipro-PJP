-- Insert one record without listing the column names in the insert statement where salary value remain undetermined. Check whether data is inserted
-- Eg: 
-- employee_id first_name last_name  department_id salary
-- 201         Michael     Hartstein   20         13000
-- 202         Pat            Fay       20         (null)


INSERT INTO employees values(202, 'Pat', 'Fay', 20, null);

select * from employees;