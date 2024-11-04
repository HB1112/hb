-- DDL :  데이터베이스 생성하기 (Create)
create database shop_db;
use shop_db;
-- DDL : 데이터베이스 조회하기(Read)
show databases;
--  DDL : 데이터베이스 수정하기(Update)
--  alter ~~
-- DDL : 데이터베이스 삭제하기(Delete)
drop database shop_db;

--  DDL : 테이블 생성(Create)
create table member(
	member_id varchar(8) not null primary key,
    member_name varchar(5) not null,
    member_addr varchar(20)
)default charset=utf8;
create table product(
	product_name varchar(4) not null primary key,
    cost int,
    make_date date,
    company varchar(5),
    amount int
)default charset=utf8;

--  DDL : 테이블  삭제(Delete)
drop table member;
drop table product;
-- 테이블 읽어오기
desc member;
desc product;

-- 테이블 수정하기alter


-- -------------------------------------------
-- DML
insert into member values("tess","나훈아","경기 부천시 중동");
insert into member values("hero","임영웅","서울 은평구 증산동");
insert into member values("iyou","아이유","인천 남구 주안동");
insert into member values("jyp","박진영","경기 고양시 장항동");
