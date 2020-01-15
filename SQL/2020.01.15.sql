create table project.OPMEMBER (
	IDX int auto_increment primary key,
    uemail VARCHAR(100) unique not null,
    uname VARCHAR(100) unique not null,
    upw varchar(20) not null,
    gender char(1) check ( gender='m' or gender='w' ) not null,
    byear int,
    uphoto varchar(200),
    regdate datetime
);
-- sysdate

