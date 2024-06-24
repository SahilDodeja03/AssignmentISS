CREATE TABLE department(
	department_id INT PRIMARY KEY IDENTITY(1,1),
	department_name VARCHAR(MAX)
)

CREATE TABLE manager(
	manager_id INT PRIMARY KEY IDENTITY(1,1),
	first_name VARCHAR(MAX),
	last_name VARCHAR(MAX),
	department_id INT,
	salary INT,
	FOREIGN KEY(department_id) REFERENCES department(department_id)
)

CREATE TABLE employee(
	employee_id INT PRIMARY KEY IDENTITY(1,1),
	first_name VARCHAR(MAX),
	last_name VARCHAR(MAX),
	salary INT, 
	department_id INT, 
	manager_id INT,
	FOREIGN KEY(department_id) REFERENCES department(department_id),
	FOREIGN KEY(manager_id) REFERENCES manager(manager_id)
)

INSERT INTO department VALUES('Sales')
INSERT INTO department VALUES('HR')
INSERT INTO department VALUES('Technical')
INSERT INTO department VALUES('Finance')

SELECT * FROM department

INSERT INTO manager VALUES('Naksh', 'Dodeja', 1, 71000)
INSERT INTO manager VALUES('Nikhil', 'khatwani', 2, 76000)
INSERT INTO manager VALUES('muskan', 'Mulchandani', 3, 66000)
INSERT INTO manager VALUES('varsha', 'chandwani', 4, 85000)
INSERT INTO manager VALUES('Kashish', 'Bajaj', 3, 90000)

SELECT * FROM manager

INSERT INTO employee VALUES('Vridhi', 'Chugh', 78000, 1, 1)
INSERT INTO employee VALUES('Sahil', 'Kishnani', 52000, 4,  4)
INSERT INTO employee VALUES('James', 'Bond', 98000, 2, 2)
INSERT INTO employee VALUES('Rahul', 'Bhagtani', 65000, 3,  5)
INSERT INTO employee VALUES('John', 'King', 22000, 3,  3)
INSERT INTO employee VALUES('Riya', 'Bajaj', 43000, 4,  4)
INSERT INTO employee VALUES('Siya', 'Kishnani', 80000, 3,  5)
INSERT INTO employee VALUES('Jyoti', 'Narang', 52000, 3,  3)

SELECT * FROM employee


SELECT first_name, salary 
FROM employee
WHERE salary>70000


SELECT first_name, last_name, salary
FROM employee
WHERE salary>60000 OR manager_id=5



SELECT COUNT(DISTINCT(salary)) AS salary 
FROM employee


SELECT *
FROM employee
ORDER BY salary DESC


SELECT first_name, last_name, salary
FROM employee
WHERE salary>60000 AND manager_id=5



UPDATE manager
SET salary=10000
WHERE manager_id=1


SELECT * FROM manager


DELETE FROM employee 
WHERE salary<30000


SELECT * FROM employee



SELECT * 
FROM employee
WHERE first_name LIKE 's%'


SELECT *
FROM employee
WHERE last_name IN ('Kishnani', 'Narang')


SELECT first_name, last_name, salary
FROM employee
WHERE salary BETWEEN 45000 AND 55000


SELECT SUM(salary) AS sum_of_salary
FROM employee
WHERE manager_id=5


SELECT department_id, SUM(salary) AS sum_of_salary
FROM manager
GROUP BY department_id
ORDER BY sum_of_salary DESC


SELECT TOP 2 first_name, salary
FROM employee
ORDER BY salary DESC


DELETE FROM employee
WHERE manager_id=3


SELECT employee_id, first_name, last_name, salary
INTO high_salary
FROM employee
WHERE salary>70000


SELECT * FROM high_salary



SELECT employee.first_name, employee.last_name, employee.salary, department.department_name
FROM employee 
INNER JOIN department ON employee.department_id=department.department_id


SELECT * 
FROM manager
LEFT JOIN employee ON employee.manager_id=manager.manager_id


SELECT * 
FROM manager
FULL JOIN employee ON employee.manager_id=manager.manager_id




CREATE TABLE employee_2015(
	employee_id INT PRIMARY KEY IDENTITY(1,1),
	first_name VARCHAR(MAX) NOT NULL,
	last_name VARCHAR(MAX) NOT NULL, 
	manager_id INT,
	department_id INT, 
	salary INT CHECK (salary>5000),
	FOREIGN KEY (manager_id) REFERENCES manager(manager_id),
	FOREIGN KEY (department_id) REFERENCES department(department_id)
)


CREATE TABLE employee_2017(
	employee_id INT PRIMARY KEY IDENTITY(1,1),
	first_name VARCHAR(MAX) NOT NULL,
	last_name VARCHAR(MAX) NOT NULL, 
	manager_id INT,
	department_id INT, 
	salary INT DEFAULT 5000,
	FOREIGN KEY (manager_id) REFERENCES manager(manager_id),
	FOREIGN KEY (department_id) REFERENCES department(department_id)
)


ALTER TABLE employee_2015
ADD email VARCHAR(MAX)


ALTER TABLE employee_2015
ADD DateOfBirth date


SELECT * FROM employee_2015


ALTER TABLE employee_2015
DROP COLUMN DateOfBirth


CREATE VIEW high_salary_managers AS
SELECT * 
FROM manager
WHERE salary>40000



CREATE PROCEDURE sp_getDetailsOfManager
	@manager_id INT
AS
BEGIN
	SELECT * FROM Manager
	WHERE manager_id=@manager_id
END


sp_getDetailsOfManager 5

