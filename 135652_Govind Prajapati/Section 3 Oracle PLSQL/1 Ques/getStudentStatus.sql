CREATE OR REPLACE PROCEDURE getStatus IS

Studno marks.StudNo%Type;
M1 marks.Module1%TYPE;
M2 marks.Module2%TYPE;
M3 marks.Module3%TYPE;
M4 marks.Module2%TYPE;
student_name student.studName%TYPE;

	CURSOR stud_cur is
		SELECT m.studNo,s.studName,m.module1,m.module2,m.module3,m.module4 FROM Marks m, Student s WHERE s.studno = m.studno;

STATUS VARCHAR2(10);	

BEGIN

OPEN stud_cur;
	LOOP
		FETCH stud_cur INTO Studno,M1,M2,M3,M4,student_name;
			STATUS := 'PASS';

			IF(M1 < 50 OR M2 < 50 OR M3 < 50 OR M4 < 50) THEN
				STATUS := 'FAIL';
			ELSE	
				STATUS := 'PASS';			
			END IF;	
	
		DBMS_OUTPUT.PUT_LINE('StudNo : '||Studno||'Student Name:  '||student_name||' Status : '||STATUS);
		

		EXIT WHEN stud_cur%NOTFOUND;

	END LOOP;


END getStatus;
/