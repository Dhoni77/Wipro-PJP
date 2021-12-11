--  Create the EMP table based on the following table instance chart. Save the statement in a script called lab_10_03.sql , and then execute the statement in the script to create the table. Confirm that the table is created.
-- Specification-  Values
-- Column Name: ID, LAST_NAME, FIRST_NAME, DEPT_ID
-- Key Type: PK,  -,  -, FK
-- Nulls /Unique:  -,  Not null,  -,  -,
-- FK Table:   -,  -,    -, Dept
-- FK Column:   -,   -,  -,  ID
-- Data type: NUMBER, VARCHAR2, VARCHAR2, NUMBER
-- Length: 7, 25, 25, 7



CREATE TABLE DEPT(
        dept_id integer(7) PRIMARY KEY,
        dept_name varchar(20)
);

INSERT INTO DEPT values(10, 'Accounts');


CREATE TABLE emp (
    id   integer(7),
    last_name VARCHAR(25) NOT NULL,
    first_name VARCHAR(25),
    dept_id  integer(7),
     PRIMARY KEY ( id ),
     FOREIGN KEY ( dept_id ) REFERENCES dept ( dept_id )
);

INSERT INTO emp VALUES (
    101,
    'SAM',
    'SUNDAR',
    10
),
(103,'Ram','Krishna',20),
(102,'Gopi',NULL,40);


select * from emp;
