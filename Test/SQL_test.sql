1. CREATE DATABASE Xworkz;

CREATE TABLE bank_info (
    bank_id INT,
    bank_name VARCHAR(50),
    branch_name VARCHAR(50),
    location VARCHAR(50),
    manager_name VARCHAR(50),
);

2. INSERT INTO bank_info VALUES
(1, 'State Bank of India', 'Main', 'Mumbai', 'Rajesh Sharma'),
(2, 'ICICI Bank', 'Andheri', 'Mumbai', 'Anil Kumar'),
(3, 'HDFC Bank', 'MG Road', 'Bengaluru', 'Preeti Singh'),
(4, 'Axis Bank', 'Nehru Place', 'Delhi', 'Vikram Sethi'),
(5, 'Urban', 'KRPURAM', 'Delhi', 'Manish Gupta');

4. SELECT bank_name, COUNT(manager_name) AS Total_Manager
FROM bank_info
GROUP BY bank_name
HAVING location = 'delhi';





5. ALTER TABLE bank_info ADD COLUMN Establish_year DATE;

6. ALTER TABLE bank_info DROP COLUMN Establish_year;

7. ALTER TABLE bank_info MODIFY COLUMN branch_name to Head_Branch;

8. ALTER TABLE bank_info CHANGE COLUMN manager_name manager_name INT;




3. NOT NULL: This constraints not except null values in column
   UNIQUIE: Only unique value
   PRIMARY KEY: This Constraint Not Except any null values and it should be uniquely identified. 
   FORIEGN KEY: This Constraint helps to establish link between the two tables. One table foreign key is primary key for another table.
   CHECK: Give condition


CREATE TABLE ProjectDetails (
    ProjectID INT PRIMARY KEY,
    ProjectName VARCHAR(100),
    Budget DECIMAL(15, 2),
    ProjectManager VARCHAR(100),
    CONSTRAINT Budget_chk CHECK(Budget > 10000)
);


CREATE TABLE EmployeeInfo (
    EmployeeID int PRIMARY KEY,
    ProjectID int
    FirstName VARCHAR(50),
    Age int not UNIQUE,
    Salary int,
    CONSTRAINT ProjectID_fk FORIEGN KEY ProjectID references(ProjectID);
    
);



 

   





































