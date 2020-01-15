create table project.OPMEMBER (
	IDX int auto_increment primary key,
    uemail VARCHAR(100) unique not null,
    uname VARCHAR(100) unique not null,
    upw varchar(20) not null,
    gender char(1) check ( gender='m' or gender='w' ) not null,
    byear int,
    uphoto varchar(200)
);
-- sysdate
INSERT INTO `project`.`member` (`EMAIL`,`PASSWORD`,`NAME`,`REGDATE`) VALUES ('test1@test1', '2222', 'tester1', now());
