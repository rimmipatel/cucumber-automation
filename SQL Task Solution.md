# SQL Task Solution

### 1. Return Employee record with highest salary

```sql
SELECT *
FROM employee
ORDER BY salary DESC
LIMIT 1
```

### 2. Return the highest salary in employee table

```sql
SELECT MAX(salary)
FROM employee
```

### 3. Return 2nd highest salary from employee table

```sql
SELECT salary
FROM employee
ORDER BY salary DESC
LIMIT 2, 1
```

### 4. Select range of employees based on id

```sql
SELECT *
FROM employee
WHERE emp_id BETWEEN 10003 AND 10006
```

### 5. Return an employee with highest salary and the employee’s department name

```sql
SELECT e.*, d.department_name
FROM employee e
JOIN department d ON e.department_id = d.department_id
ORDER BY salary DESC
LIMIT 1
```

### 6. Return highest salary, employee_name, department_name for EACH department

```sql
SELECT ANY_VALUE(e.first_name), ANY_VALUE(e.last_name), MAX(e.salary), d.department_name
FROM employee e
JOIN department d ON e.department_id = d.department_id
GROUP BY e.department_id
```


# Queries for creating tables and inserting vales

```sql
CREATE TABLE department (
	department_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
   	department_name varchar(30)
);
```

```sql
CREATE TABLE employee (
	emp_id int NOT NULL AUTO_INCREMENT,
   	first_name varchar(50),
   	last_name varchar(50),
   	gender char(1),
   	position varchar(50),
   	department_id int NOT NULL,
   	salary int,
   	PRIMARY KEY (emp_id),
   	FOREIGN KEY (department_id) REFERENCES department(department_id)
);
```

```sql
INSERT INTO department VALUES (1, 'IT');
INSERT INTO department VALUES (2, 'Sales');
```

```sql
INSERT INTO employee VALUES (10001, 'Super', 'Man', 'M', 'QA',1, 45000);
INSERT INTO employee VALUES (10002, 'Jessica', 'Liyers', 'F', 'Architect',1, 60000);
INSERT INTO employee VALUES (10003, 'Bonnie', 'Adams', 'F', 'Product Manager', 1, 80000);
INSERT INTO employee VALUES (10004, 'James', 'Madison', 'M', 'Software developer', 1, 75000);
INSERT INTO employee VALUES (10005, 'Michael', 'Greenback', 'M', 'Sales Assistant', 2, 85000);
INSERT INTO employee VALUES (10006, 'Leslie', 'Peters', 'F', 'Sales engineer', 2, 76000);
INSERT INTO employee VALUES (10007, 'Max', 'Powel', 'M', 'Sales Representative', 2, 59000);
INSERT INTO employee VALUES (10008, 'Stacy', 'Jacobs', 'F', 'Sales Manager', 2, 73000);
```