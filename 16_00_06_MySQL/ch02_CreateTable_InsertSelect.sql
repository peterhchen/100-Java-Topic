use abc;
/* DDL (Data Defnition Language): create/drop table */
create table student (rollno int, sname varchar(20), primary key (rollno));

desc student;
/* DML (Data Manipulation Language): insert/delte data */
insert into student values (1, 'Peter'); 
insert into student values (2, 'Irene'); 
/* delete from student where rollno = 1; */
insert into student values (3, 'Jonathan'); 
select * from student;
