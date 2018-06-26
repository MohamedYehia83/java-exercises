/*
Drop table project;
Drop table employee;
Drop table department;



CREATE TABLE employee (
    employee_id serial NOT NULL,        
    employee_num integer NOT NULL,          
    first_name varchar(45) NOT NULL,
    last_name varchar(45) NOT NULL,
    job_title varchar (45) not null,
    gender character(1),                  
    birthday date NOT NULL,
    hire_date date NOT NULL,   
    department_id serial not null,
    CONSTRAINT pk_employee_employee_id PRIMARY KEY (employee_id)       
);                             

CREATE TABLE department (
    department_id serial NOT NULL,        
    department_num integer NOT NULL,          
    name varchar (45) not null,
    employee_id serial NOT NULL,  
    CONSTRAINT pk_department_department_id PRIMARY KEY (department_id,  employee_id)       
);                             

CREATE TABLE project (
    project_id serial NOT NULL,        
    project_num integer NOT NULL,          
    name varchar(45) NOT NULL,                  
    start_date date NOT NULL,   
    employee_id serial NOT NULL,        
    department_id serial NOT NULL,        
    CONSTRAINT pk_project_project_id PRIMARY KEY (project_id, employee_id, department_id)       
);                            

*/

INSERT INTO employee (employee_id, employee_num, first_name, last_name, job_title, gender, birthday, hire_date, department_id) 
VALUES               (1,            100,           'JESSE',   'SCHILLING', 'Programer', 'f', '01,01,1983', '01,01,2015', 1);
INSERT INTO employee (employee_id, employee_num, first_name, last_name, job_title, gender, birthday, hire_date, department_id) 
VALUES               (2,            101,         'CRAIG',   'MORRELL', 'Programer', 'm', '05,05,1985', '11,09,2016', 1);
INSERT INTO employee (employee_id, employee_num, first_name, last_name, job_title, gender, birthday, hire_date, department_id) 
VALUES               (3,            102,         'ALAN',   'KAHN', 'Programer', 'f', '03,10,1986', '12,02,2017', 1);
INSERT INTO employee (employee_id, employee_num, first_name, last_name, job_title, gender, birthday, hire_date, department_id) 
VALUES               (4,            103,         'SHAWN',   'HEATON', 'data analysis', 'f', '11,08,1987', '10,07,2017', 2);
INSERT INTO employee (employee_id, employee_num, first_name, last_name, job_title, gender, birthday, hire_date, department_id) 
VALUES               (5,            104,         'PHILIP',   'CAUSEY', 'the leader', 'm', '11,02,1977', '12,03,2008', 2);
INSERT INTO employee (employee_id, employee_num, first_name, last_name, job_title, gender, birthday, hire_date, department_id) 
VALUES               (6,            105,         'CHRIS',   'BROTHERS', 'the boss', 'm', '07,12,1979', '04,11,2010', 2);
INSERT INTO employee (employee_id, employee_num, first_name, last_name, job_title, gender, birthday, hire_date, department_id) 
VALUES               (7,            106,         'EARL',   'SHANKS', 'the lady', 'f', '10,10,1988', '09,11,2018', 3);
INSERT INTO employee (employee_id, employee_num, first_name, last_name, job_title, gender, birthday, hire_date, department_id) 
VALUES               (8,            107,         'DANNY',   'ISOM', 'the winner', 'm', '11,10,1985', '12,15,2017', 3);


INSERT INTO department (department_id, department_num, name, employee_id) 
VALUES                 (1,             1,           'programing',   1);
INSERT INTO department (department_id, department_num, name, employee_id) 
VALUES                 (1,             1,           'programing',   2);
INSERT INTO department (department_id, department_num, name, employee_id) 
VALUES                 (1,             1,           'programing',   3);
INSERT INTO department (department_id, department_num, name, employee_id) 
VALUES                 (2,             2,           'data analysis',   4);
INSERT INTO department (department_id, department_num, name, employee_id) 
VALUES                 (2,             2,           'data analysis',   5);
INSERT INTO department (department_id, department_num, name, employee_id) 
VALUES                 (2,             2,           'data analysis',   6);
INSERT INTO department (department_id, department_num, name, employee_id) 
VALUES                 (3,             3,             'hr',   7);
INSERT INTO department (department_id, department_num, name, employee_id) 
VALUES                 (3,             3,             'hr',   8);

INSERT INTO project (project_id, project_num, name, start_date, employee_id, department_id) 
VALUES                 (1,       1000,       'aplication', '01,07,2015', 1,   1);
INSERT INTO project (project_id, project_num, name, start_date, employee_id, department_id) 
VALUES                 (1,       1000,       'aplication', '01,07,2015', 2,   1);
INSERT INTO project (project_id, project_num, name, start_date, employee_id, department_id) 
VALUES                 (1,       1000,       'aplication', '01,07,2015', 3,   1);
INSERT INTO project (project_id, project_num, name, start_date, employee_id, department_id) 
VALUES                 (2,       1001,       'database', '09,22,2016', 4,   2);
INSERT INTO project (project_id, project_num, name, start_date, employee_id, department_id) 
VALUES                 (2,       1001,       'database', '09,22,2015', 5,   2);
INSERT INTO project (project_id, project_num, name, start_date, employee_id, department_id) 
VALUES                 (2,       1001,       'database', '09,22,2015', 6,   2);
INSERT INTO project (project_id, project_num, name, start_date, employee_id, department_id) 
VALUES                 (3,       1002,       'project', '03,025,2017', 7,   3);
INSERT INTO project (project_id, project_num, name, start_date, employee_id, department_id) 
VALUES                 (4,       1003,       'fun project', '06,29,2018', 2,   1);
INSERT INTO project (project_id, project_num, name, start_date, employee_id, department_id) 
VALUES                 (4,       1003,       'fun project', '06,29,2018', 5,   2);


ALTER TABLE employee
ADD FOREIGN KEY(department_id,  employee_id)
REFERENCES department(department_id,  employee_id); 

ALTER TABLE department
ADD FOREIGN KEY(employee_id)
REFERENCES employee(employee_id);

ALTER TABLE project
ADD FOREIGN KEY(employee_id)
REFERENCES employee(employee_id); 

ALTER TABLE project
ADD FOREIGN KEY(department_id, employee_id)
REFERENCES department(department_id,  employee_id); 

