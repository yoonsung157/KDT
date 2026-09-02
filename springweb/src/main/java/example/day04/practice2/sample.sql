drop DATABASE if EXISTS my0902;
create database my0902;
use my0902;

create table exam (
    eno int AUTO_INCREMENT PRIMARY KEY ,
    econtent VARCHAR(255),
    ewriter VARCHAR(255)
);

insert into exam( econtent, ewriter ) values('내용1', '작성자1');
insert into exam( econtent, ewriter ) values('내용2', '작성자2');
insert into exam( econtent, ewriter ) values('내용3', '작성자3');

select * from exam;