drop database if exists naver_db;
create database naver_db;
use naver_db;

create table member(
	mem_id varchar(8) primary key not null,
    mem_name varchar(20) not null,
    mem_number int not null,
    addr varchar(10) not null,
    phone1 varchar(3),
    phone2 varchar(8),
    height int,
    debut_date date
);

create table buy(
	num int primary key not null auto_increment,
    mem_id varchar(8) not null,
    prod_name varchar(6) not null,
    group_name varchar(4),
    price int not null, 
    amount int not null,
    FOREIGN KEY (mem_id) references member(mem_id)
);

INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');

INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);


select * from member;
select * from buy;


drop table  if exists buy, member;
create table member(
	mem_id varchar(8) not null primary key,
    mem_name varchar(10) not null,
    height int unsigned null
);
drop table  if exists buy, member;
create table member(
	mem_id varchar(8) not null ,
    mem_name varchar(10) not null,
    height int unsigned null,
    primary key (mem_id)
);
drop table  if exists buy, member;
create table member(
	mem_id varchar(8) not null ,
    mem_name varchar(10) not null,
    height int unsigned null
);
alter table member
	add constraint
    primary key (mem_id);
drop table  if exists buy, member;
create table member(
	mem_id char(8) not null primary key,
    mem_name varchar(10) not null,
    height tinyint unsigned null
);
create table buy(
	num int auto_increment not null primary key,
    mem_id  char(8) not null,
    prod_name char(6) not null,
    foreign key (mem_id) references member(mem_id)
);

drop table if exists buy;
create table buy(
	num int auto_increment not null primary key,
    mem_id char(8) not null,
    prod_name char(6) not null
);
alter table buy
	add constraint
    foreign key(mem_id)
    references member(mem_id);
    
insert into member values('blk','블랙핑크',163);
insert into buy values(null,'blk','지갑');
insert into buy values(null,'blk','맥북');   
 
select M.mem_id, M.mem_name, B.prod_name
	from buy B
		inner join member M
        on B.mem_id = M.mem_id;
update member set mem_id='pink' where mem_id='blk';        

drop table if exists buy;

create table buy(
	num int auto_increment not null primary key,
    mem_id char(8) not null,
    prod_name char(6) not null
);
alter table buy
	add constraint
    foreign key(mem_id) references member(mem_id)
    on update cascade
    on delete cascade;
insert into buy values(null, 'blk','지갑');
insert into buy values(null, 'blk','맥북'); 

update member set mem_id='pink' where mem_id='blk';
select * from member;
select * from buy;
select M.mem_id, M.mem_name, B.prod_name
	from buy B
		inner join member M
        on B.mem_id = M.mem_id;
delete from member where mem_id='pink';

drop table if exists buy, member;
create table member(
	mem_id char(8) not null primary key,
    mem_name varchar(10) not null,
    height tinyint unsigned null,
    email char(30) null unique
);
insert into member values('blk','블랙핑크', 163, 'pink@gmail.com');
insert into member values('twc','트와이스', 167, null);
insert into member values('apn','에이핑크', 164, 'pink@gmail.com'); unique 키 오류


drop table if exists member;
create table member(
	mem_id char(8) not null primary key,
    mem_name varchar(10) not null,
    height tinyint unsigned null check(height >= 100),
    phone1 char(3) null
);
insert into member values('blk','블랙핑크',163,null);
insert into member values('twc','트와이스',93,null);

alter table member
	add constraint
    check(phone1 in('02','031','032','054','055','061'));
insert into member values('twc','트와이스',167,'02');
insert into member values('omy',' 오마이걸',167,'010'); -- check 오류 발생

drop table if exists member;
create table member(
	mem_id char(8) not null primary key,
    mem_name varchar(10) not null,
    height tinyint unsigned null default 160,
    phone1 char(3) null
);
alter table member
	alter column phone1 set default '02';
insert into member values('red','레드벨벳',161,'054');
insert into member values('spc','우주소녀',default,default);
select * from member;