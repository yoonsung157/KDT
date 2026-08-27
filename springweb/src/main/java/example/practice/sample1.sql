DROP DATABASE IF EXISTS db0826;
CREATE DATABASE db0826;
USE db0826;
CREATE TABLE list( 
    number VARCHAR(20) ,
    people int,
    constraint PRIMARY KEY( number ) 
);
insert into list( number, people )values( "010-6276-3602", "3" ),( "010-1234-5678", "5"); -- 샘플 데이터 2개
