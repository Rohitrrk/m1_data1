CREATE TABLE department(deptno NUMBER(4) PRIMARY KEY, dname VARCHAR2(14),loc VARCHAR2(13));
INSERT INTO department VALUES(10,'ACCOUNTING','NEWYORK');
INSERT INTO department VALUES(20,'RESEARCH','DALLAS');
INSERT INTO department VALUES(30,'SALES','CHICAGO');
INSERT INTO department VALUES(40,'OPERATIONS','BOSTON');
	


CREATE TABLE Student(StudNo number CONSTRAINT pk_Sno PRIMARY KEY, StudName varchar(20),Phone number, Address varchar(20), Deptno number, CONSTRAINT fk_Dno FOREIGN KEY(Deptno) REFERENCES Department(Deptno) );


INSERT INTO Student VALUES(1001,'Rahul',2456789,'Mumbai',10);
INSERT INTO Student VALUES(1002,'Sanjay',2678923,'Pune',20);
INSERT INTO Student VALUES(1003,'Ritish',2676763,'Mumbai',30);
INSERT INTO Student VALUES(1004,'Sai',2565758,'Bangalore',10);
INSERT INTO Student VALUES(1005,'Ravi',2787975,'Chennai',20);
INSERT INTO Student VALUES(1006,'Kalai',2345678,'Chennai',30);
INSERT INTO Student VALUES(1007,'Sonal',2987654,'Mumbai',20);


CREATE TABLE Marks (Studno number PRIMARY KEY,Module1 number,Module2 number, Module3 number,Module4 number,CONSTRAINT fk_Sno FOREIGN KEY(Studno) REFERENCES Student(Studno));

INSERT INTO Marks VALUES(1001,75,60,90,85);
INSERT INTO Marks VALUES(1002,65,86,79,92);
INSERT INTO Marks VALUES(1003,54,46,72,67);
INSERT INTO Marks(studno,module1,module2,module4) VALUES(1004,72,66,89);
INSERT INTO Marks VALUES(1005,62,56,72,86);
INSERT INTO Marks VALUES(1006,80,50,70,30);

