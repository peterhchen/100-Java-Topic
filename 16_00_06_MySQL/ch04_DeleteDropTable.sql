use abc;
select * from student;
/*
delete from student where rollno=2;
select * from student;
*/
delete from student where rollno > 0;
select * from student;
rollback;