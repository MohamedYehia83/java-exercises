drop table department;
drop table project;
drop table project_employee;
drop table employee;



CREATE TABLE employee (
    employee_id serial NOT NULL,        
    department_id serial not null,         
    first_name varchar(45) NOT NULL,
    last_name varchar(45) NOT NULL,
    job_title varchar (45) not null,
    birth_date date NOT NULL,
    gender char(1),                  
    hire_date date NOT NULL,   
    CONSTRAINT pk_employee_employee_id PRIMARY KEY (employee_id),
    CONSTRAINT ck_gender CHECK (gender IN ('m', 'f'))     
);                             

CREATE TABLE department (
    department_id serial NOT NULL,        
    name varchar (45) UNIQUE not null,
    CONSTRAINT pk_department_department_id PRIMARY KEY (department_id)       
);                             

CREATE TABLE project (
    project_id serial NOT NULL,        
    name varchar(45) UNIQUE NOT NULL,                  
    start_date date NOT NULL,   
    end_date date NOT NULL,
    CONSTRAINT pk_project_project_id PRIMARY KEY (project_id)       
);                            

CREATE TABLE project_employee (
    project_id serial NOT NULL,        
    employee_id serial NOT NULL,        
    CONSTRAINT pk_project_employee PRIMARY KEY (project_id, employee_id)       
);                            


INSERT INTO employee (employee_id, department_id, first_name, last_name, job_title, birth_date, gender, hire_date) 
VALUES               (1,            1 ,            'JESSE',   'SCHILLING', 'Programer', '01,01,1983', 'f', '01,01,2015');
INSERT INTO employee (employee_id, department_id, first_name, last_name, job_title, birth_date, gender, hire_date) 
VALUES               (2,            1,           'CRAIG',     'MORRELL',   'Programer','05,05,1985','m', '11,09,2016');
INSERT INTO employee (employee_id, department_id, first_name, last_name, job_title, birth_date, gender, hire_date) 
VALUES               (3,            1,           'ALAN',     'KAHN',         'Programer', '03,10,1986','f', '12,02,2017');
INSERT INTO employee (employee_id, department_id, first_name, last_name, job_title, birth_date, gender, hire_date) 
VALUES               (4,            2,           'SHAWN',    'HEATON',   'data analysis','11,08,1987','f', '10,07,2017');
INSERT INTO employee (employee_id, department_id, first_name, last_name, job_title, birth_date, gender, hire_date) 
VALUES               (5,            2,         'PHILIP',     'CAUSEY', 'the leader',  '11,02,1977','m', '12,03,2008');
INSERT INTO employee (employee_id, department_id, first_name, last_name, job_title, birth_date, gender, hire_date) 
VALUES               (6,            2,         'CHRIS',      'BROTHERS', 'the boss',  '07,12,1979','m', '04,11,2010');
INSERT INTO employee (employee_id, department_id, first_name, last_name, job_title, birth_date, gender, hire_date) 
VALUES               (7,            3,         'EARL',       'SHANKS', 'the lady',  '10,10,1988','f', '09,11,2018');
INSERT INTO employee (employee_id, department_id, first_name, last_name, job_title, birth_date, gender, hire_date) 
VALUES               (8,            3,         'DANNY',      'ISOM', 'the winner',  '11,10,1985', 'm','12,15,2017');


INSERT INTO department (department_id, name) 
VALUES                 (1,           'programing');
INSERT INTO department (department_id, name) 
VALUES                 (2,           'data analysis');
INSERT INTO department (department_id, name) 
VALUES                 (3,           'hr');


INSERT INTO project (project_id, name, start_date, end_date) 
VALUES                 (1,     'aplication', '01,07,2015','09,02,2015');
INSERT INTO project (project_id, name, start_date, end_date) 
VALUES                 (2,     'database', '09,22,2016', '12,06,2017');
INSERT INTO project (project_id, name, start_date, end_date) 
VALUES                 (3,     'project', '03,25,2017','11,24,2017');
INSERT INTO project (project_id, name, start_date, end_date) 
VALUES                 (4,     'fun project', '06,29,2018','07,08,2018');


INSERT INTO project_employee (project_id, employee_id) 
VALUES                       (1,         1);
INSERT INTO project_employee (project_id, employee_id) 
VALUES                       (1,         2);
INSERT INTO project_employee (project_id, employee_id) 
VALUES                       (1,         3);
INSERT INTO project_employee (project_id, employee_id) 
VALUES                       (2,         4);
INSERT INTO project_employee (project_id, employee_id) 
VALUES                       (2,         5);
INSERT INTO project_employee (project_id, employee_id) 
VALUES                       (3,         6);
INSERT INTO project_employee (project_id, employee_id) 
VALUES                       (3,         7);
INSERT INTO project_employee (project_id, employee_id) 
VALUES                       (3,         8);
INSERT INTO project_employee (project_id, employee_id) 
VALUES                       (4,         5);
INSERT INTO project_employee (project_id, employee_id) 
VALUES                       (4,         2);




ALTER TABLE employee
ADD CONSTRAINT fk_employee_department FOREIGN KEY(department_id)
REFERENCES department(department_id); 

ALTER TABLE project_employee 
ADD FOREIGN KEY(project_id)
REFERENCES project(project_id); 

ALTER TABLE project_employee
ADD FOREIGN KEY(employee_id)
REFERENCES employee(employee_id); 
