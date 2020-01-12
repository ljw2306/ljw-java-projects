create table member(
id varchar2(6) unique,
name varchar2(12) not null,
age number(3) default 0,
did varchar2(24) primary key
)