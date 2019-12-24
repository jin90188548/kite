-- Open Project
-- 회원 테이블  : MEMBER
drop table opmember;
create table opmember (
    idx number(4) constraint member_idx_pk primary key,
    uemail VARCHAR2(100) unique not null,
    uname VARCHAR2(100) unique not null,
    upw varchar2(20) not null,
    gender char(1) check ( gender='m' or gender='w' ) not null,
    byear number(4),
    uphoto varchar2(200)
);
create SEQUENCE member_idx_seq;
insert into opmember values (MEMBER_IDX_SEQ.nextval, 'test@test', 'teseter', '1111', 'm', 2000, null);
insert into opmember values (MEMBER_IDX_SEQ.nextval, ?, ?, ?, ?, ?, ?);

select * from opmember;

