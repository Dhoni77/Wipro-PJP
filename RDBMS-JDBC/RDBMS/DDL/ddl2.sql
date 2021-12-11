-- Populate the DEPT table with data from the DEPARTMENTS table. Include only columns that you need.
-- Insert dept Id 10 and Name Accounts
-- Insert dept Id as null and Name as TT
-- Correct by giving 20 and TT
-- Insert A1 as Id and Accounts
-- Correct by giving 30 and Accounts


CREATE TABLE DEPT(
        dept_id number(7) PRIMARY KEY,
        dept_name varchar2(20)
);

INSERT INTO DEPT values(10, 'Accounts');
INSERT INTO DEPT values(null, 'TT');

update DEPT set dept_id=20 where dept_name='TT';

-- INSERT INTO DEPT values('A1', 'Accounts');

update DEPT set dept_id=30 where dept_name='Accounts';
select * from DEPT;