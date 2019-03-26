use abc;
drop table student; 
/* DDL (Data Defnition Language): create/drop table */
create table student (stud_id int, stud_name varchar(20), marks int, age int, primary key (stud_id));

desc student;
/*
select * from student;
insert into student values (101, 'Peter', 100, 62); 
insert into student values (102, 'Irene', 80, 58); 
insert into student values (103, 'Jessica', 70, 31); 
insert into student values (104, 'Jason', 70, 29);
insert into student values (105, 'Jasmine', 70, 26); 
insert into student values (106, 'Janathan', 90, 19);  
*/
select * from student;
select * from student order by marks;
select * from student order by age;
select * from student order by marks desc;