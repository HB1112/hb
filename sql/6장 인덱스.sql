use market_db;
create table table1(
	col1 int primary key,
    col2 int,
    col3 int
);
show index from table1;

drop table if exists buy, member;
create table member(
	mem_id char(8),
    mem_name varchar(10),
    mem_number int,
    addr char(2)
);
INSERT INTO member VALUES('TWC', '트와이스', 9, '서울');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울');
select * from member;
alter table member
	add constraint
    primary key (mem_id);
alter table member drop primary key;
alter table member
	add constraint
    primary key (mem_name);
    
select * from member;
show index from member;
show table status like 'member';

create index idx_member_addr
	on member (addr);
show table status like 'member';
show index from member;
analyze table member;
create unique index idx_member_mem_number
	on member (mem_number); -- 오류발생
create unique index idx_member_mem_name
	on member (mem_name);
insert into member values('moo','마마무',2,'태국','001','12341234',155,'2020.10.10'); -- 오류발생

analyze table member;
show index from member;

select * from member;
select mem_id, mem_name, addr
	from member
	where mem_name = '에이핑크';

create index idx_member_mem_number
	on member (mem_number);
analyze table member;

select mem_name, mem_number
	from member
	where mem_number >= 7;