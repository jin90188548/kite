create table project.MEMBER (
	ID int auto_increment primary key,
	EMAIL varchar(255),
	PASSWORD varchar(100),
	NAME varchar(100),
	REGDATE datetime,
	unique key (EMAIL)
);
-- sysdate
INSERT INTO `project`.`member`
(`EMAIL`,`PASSWORD`,`NAME`,`REGDATE`) 
VALUES ('test@test', '1111', 'tester', now());
