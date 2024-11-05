select mem_name from member;
select mem_name as 멤버이름 from member;
select mem_name "멤버이름" from member;  -- 별칭 
select addr "주소", debut_date "데뷔일자", mem_name "멤버이름" from member;

select * from member where mem_name = '블랙핑크'; 

select mem_id, mem_name, height from member where height <= 162;

select mem_name, height, mem_number from member where height >=165 and mem_number > 6;
select mem_name, height, mem_number from member where height >=165 or mem_number > 6;

select mem_name, height from member where height between 163 and 165; 

select mem_name, addr 
	from member 
	where addr in('경기','전남','경남');
    
select *
	from member
	where mem_name like '우%';
select *
	from member
	where mem_name like '__핑크';
    
select mem_name, height from member
	where height > (select height from member where mem_name = '에이핑크');
    
    
select mem_id, mem_name, debut_Date 
	from member
	order by debut_date;
select mem_id, mem_name, debut_Date 
	from member
	order by debut_date desc;

	select mem_id, mem_name, debut_date, height
		from member
		where height >= 164
		order by height desc;
select mem_id, mem_name, debut_date, height
	from member
    where height >= 164
    order by height desc, debut_date asc;
    
select *
	from member
	limit 3;
select mem_name, debut_date
	from member
	order by debut_date
    limit 3,2;
    
select mem_name, height
	from member
	order by height desc
    limit 3, 2;
    
select distinct addr from member;

select mem_id, amount from buy order by mem_id;
select mem_id, sum(amount) from buy group by mem_id;

select mem_id '회원아이디', sum(amount) '총 구매 개수' from buy group by mem_id;
select mem_id '회원아이디', sum(amount*price) '총 구매 금액' 
	from buy 
	group by mem_id;
    
select avg(amount) "평균 구매 개수" from buy;
select mem_id, avg(amount) "평균 구매 개수"
	from buy
    group by mem_id;
    
select count(*) from member;
select count(phone1) "연락처가 있는 회원" 
	from member;
    
select mem_id '회원아이디', sum(amount*price) '총 구매 금액' 
	from buy 
	group by mem_id
    having sum(price*amount) > 1000;
    
    