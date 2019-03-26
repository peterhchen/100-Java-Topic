use abc;
/* TCL: Transaction Control Lanagauage */
set autocommit = 0; /* turn off the auto-commit */
select * from student;
insert into student values (3, "Jason");
commit; /* Once you commit, the data wil be there foreever. */
rollback; /* Roll back the previous data */
select * from student;