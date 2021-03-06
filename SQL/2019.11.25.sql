-- 2019.11.25


-- CROSS JOIN : 테이블을 단순히 붙여준다.
-- JOIN -> 테이블을 집합으로 보고 집합의 곱 연산의 결과이다 -> N*M ( 결과 행이다 )
select *
from emp, dept
;

-- equi join
select *
from emp, dept
where emp.deptno=dept.deptno
;

-- 이름이 'SCOTT' 인 사원의 소속부서의 이름을 사원이름과 함께 출력하자
select ename, dname, d.deptno
from emp e, dept d
where e.deptno=d.deptno
    and ename='SCOTT'
;


select e.sal, s.losal, s.hisal, e.ename, s.grade
from emp e, salgrade s
where sal BETWEEN s.losal and s.hisal
order by s.grade
;

select mgr
from emp
where ename='SMITH'
;
select ename
from emp
where empno=7902;

select e1.ename, e2.ename, d.dname
from emp e1, emp e2, dept d
where e1.mgr=e2.empno and e1.deptno=d.deptno
order by e2.ename
;

select e.ename, m.ename
from emp e, emp m
where e.mgr=m.empno(+)
;


-- ANSI JOIN
-- CORSS JOIN
select * from emp, dept;
select * from emp cross join dept; -- mysql, ms-sq1, oracle

-- inner join
select * from emp e, dept d where e.deptno=d.deptno;
select * from emp e inner join dept d on e.deptno=d.deptno;
select * from emp inner join dept on emp.deptno=dept.deptno;

-- USING
select * from emp inner join dept using(deptno);
--                                on emp.deptno=dept.deptno

-- natural join
select * from emp NATURAL JOIN dept;

-- left|right|full outer join
select * from emp e, emp m where e.mgr=m.empno(+);
select * from emp e inner join emp m on e.mgr=m.empno;
select * from emp e left outer join emp m on e.mgr=m.empno;

select * from emp m right outer join emp e on e.mgr=m.empno;


select * from dept d, emp e where d.deptno=e.deptno(+);
select distinct(dname) from dept d, emp e where d.deptno=e.deptno(+);
select * from emp e, dept d where d.deptno=e.deptno(+);



-- 부속질의 : 쿼리 안에 쿼리 작성
-- select (부속질의) from (부속질의) where 컬럼 조건식 (부속질의)

-- emp 테이블에서 평균 급여보다 급여를 더 많이 받는 사원의 리스트를 출력
-- sal > 평균급여 <- 부속질의
select avg(sal) from emp ; -- 2074
select ename, sal from emp where sal > 2073.214285714285714285714285714285714286;

select *
from emp
where sal > (
    --select sal from emp where sal > 2000
    select avg(sal) from emp
)
;

-- 다중행 조건
-- 3000 이상 받는 사원이 소속된 부서(10번, 20번)와 동일한 부서에서 근무하는 사원출력
-- 3000 이상 받는 사원이 소속된 부서 : 부속질의
-- 동일한 부서에서 근무하는 사원출력
select distinct deptno from emp where sal>=3000;
select ename, deptno
from emp
where deptno in ( select distinct deptno from emp where sal>=3000 )
;

-- 30번 소속 사원들 중에서 급여를 가장 많이 받는 사원보다 더 많은 급여를 받는 사람의 이름, 급여를 출력하는 쿼리문을 작성해 봅시다.
-- 30번 소속 사원들 중에서 급여를 가장 많이 받는 사원
select ename, sal from emp where deptno=30;
select ename, sal
from emp
where sal > all ( select sal from emp where deptno=30 )
;
select sal from emp where deptno=30;

SELECT ENAME, SAL FROM EMP
WHERE SAL > (SELECT MAX(SAL) FROM EMP WHERE DEPTNO=30)
;

-- 부서번호가 30번인 사원들의 급여 중 가장 작은 값(950)보다 많은 급여를 받는 사원의 이름, 급여를 출력하는 예제를 작성해 봅시다.
-- 부서번호가 30번인 사원들의 급여 중 가장 작은 값(950)보다
SELECT SAL FROM EMP WHERE DEPTNO=30;
SELECT ENAME, SAL FROM EMP
WHERE SAL > ANY (SELECT SAL FROM EMP WHERE DEPTNO=30)
;
SELECT ENAME, SAL FROM EMP
WHERE SAL > ( SELECT MIN(SAL) FROM EMP WHERE DEPTNO=30 )
;

DESC EMP;

-- ROWNUM
SELECT ENAME, ROWNUM FROM EMP;


-- 스칼라 부속질의 : select 뒤에 위치하는 부속질의
-- 마당서점의 고객별 판매액을 보이시오(결과는 고객이름과 고객별 판매액을 출력).
select o.custid, (select name from customer c where c.custid=o.custid ) name
        , sum(o.saleprice), trunc(avg(o.saleprice)), count(*)
from orders o
group by o.custid
;
select custid from orders order by custid;

-- 주문 정보를 출력 해보자 ( 주문번호, 고객 이름, 주문 금액 )
select orderid, (
    select name from customer where orders.custid=customer.custid 
    ) , saleprice  
from orders ;
-- join
select o.orderid, c.name, o.saleprice
from orders o, customer c
where o.custid=c.custid
;

-- 인라이 뷰 : from 절 뒤에 오는 부속질의 가상의 테이블로 사용
-- 고객 이름별 구매 금액의 합
select c.name, sum(o.saleprice)
from customer c, orders o
where c.custid=o.custid
group by c.name
;

select * from (select custid, name from customer where custid<=2)
order by name;

select c.name, sum(o.saleprice)
from (
    select custid, name from customer where custid<=2
) c, orders o
where c.custid=o.custid
group by c.name
;

-- rownum
select ename, rownum from emp;
select ename, rownum from emp order by ename;

select ename, rownum from ( select * from emp order by ename );



-- DDL

-- CREATE TABLE : 테이블 생성

--사원번호, 사원이름, 급여 3개의 칼럼으로 구성된 EMP01 테이블을 생성해 봅시다.
create table emp02 (
    empno number(4), -- 사원 번호
    ename varchar2(20), -- 사원 이름
    sal number(7,2) -- 급여
);

drop table emp02;

desc emp01;

-- 기존 테이블의 스키마 복사(제약조건 제외)해서 테이블 생성
create table emp02
as
select * from emp
;
desc emp;
desc emp02;

create table emp03
as
select empno, ename from emp;

desc emp03;
select * from emp03;

create table emp04
as 
select * from emp where deptno=10;
select * from emp04;

create table emp06
as
select * from emp where 1=0;
select * from emp06;

-- 테이블의 수정 : 컬럼의 추가, 컬럼의 수정, 컬럼의 삭제

desc emp01;

-- 컬럼의 추가
alter table emp01
add (job varchar2(9));

-- 컬럼의 수정
alter table emp01
MODIFY (job varchar2(30));

-- 컬럼의 삭제
alter table emp01
drop column job;

create table emp07
as
select * from emp;
select * from emp07;

-- 테이블 삭제
drop table emp07;

select * from emp02;

TRUNCATE table emp02;

-- 테이블 이름 변경
rename emp02 to test;

desc test;

-- 제약조건 
insert into dept  values (10, 'test', 'seoul');

desc dept;

-- not null 제약조건
drop table emp01;
create table emp01(
    empno number(4) not null,
    ename varchar2(20) not null,
    job varchar2(10),
    deptno number(2)
);

insert into emp01 values (1001, 'son', 'manager', 10);
insert into emp01 values (1001, 'lee', 'manager', 20);
select * from emp01;

drop table emp03;
create table emp03 (
    empno number(4) unique,
    ename varchar2(20) not null,
    job varchar2(10),
    deptno number(2)
);
insert into emp03 values (1001, 'son', 'manager', 10);
insert into emp03 values (1002, 'king', 'manager', 30);


drop table emp04;
create table emp04 (
    empno number(4) constraint emp04_empno_uk  unique,
    ename varchar2(20) constraint emp04_ename_nn  not null,
    job varchar2(10),
    deptno number(2)
);

insert into emp04 values (1001, 'son', 'manager', 10);
insert into emp04 values (1001, 'lee', 'manager', 30);



drop table emp05;
create table emp05 (
    empno number(4) constraint emp05_empno_pk primary key,
    ename varchar2(20) constraint emp05_ename_nn  not null ,
    job varchar2(10),
    deptno number(2)
);

insert into emp05 values (1001, 'son', 'manager', 10);
insert into emp05 values (1001, 'lee', 'manager', 30);

drop table emp06;
create table emp06 (
    empno number(4) constraint emp06_empno_pk primary key,
    ename varchar2(20) constraint emp06_ename_nn  not null ,
    job varchar2(10),
    deptno number(2) CONSTRAINT emp06_deptno_fk REFERENCES dept(deptno)
);

insert into emp06 values (1001, 'son', 'manager', null);
insert into emp06 values (1002, 'lee', 'manager', 40);
select * from emp06;
