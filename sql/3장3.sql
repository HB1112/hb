drop table if exists hongong1;
drop table if exists hongong2;

create table hongong1(
toy_id int,
toy_name varchar(4),
age int
);
insert into hongong1 values(1,'우디',25);
insert into hongong1(toy_id,toy_name) values(2,'버즈');
insert into hongong1(toy_name, age, toy_id) values('제시',20,3);
select * from hongong1;

create table hongong2(
toy_id int auto_increment primary key,
toy_name varchar(4),
age int
);
insert into hongong2 values(null,'보핍',25);
insert into hongong2 values(null,'슬링키',22);
insert into hongong2 values(null,'렉스',21);
select * from hongong2;

select last_insert_id();
insert into hongong2 values(null, '재남',35);
select * from hongong2;

show global variables;

use world;
select count(*) from city;
create table city_popul (city_name varchar(35), population int);
insert into city_popul
	select Name, Population from city;
select * from city_popul;
update city_popul
	set city_name = '서울'
    where city_name = 'Seoul';
select * from city_popul where city_name='서울';

use market_db;
create table city_popul (city_name varchar(35), population int);
insert into city_popul
	select Name, Population from world.city;
update city_popul
	set city_name = '서울'
    where city_name = 'Seoul';
select * from city_popul where city_name='서울';
update city_popul
	set city_name="뉴욕", population=0
    where city_name = "New York";
select * from city_popul where city_name = '뉴욕';