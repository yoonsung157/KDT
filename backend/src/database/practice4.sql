DROP DATABASE IF EXISTS practice4;

CREATE DATABASE practice4;

USE practice4;

-- 1. 도서 테이블

CREATE TABLE books (

    book_id      INT NOT NULL,                   -- 도서번호

    title        VARCHAR(50) NOT NULL,           -- 제목

    author       VARCHAR(20) NOT NULL,           -- 저자

    genre        VARCHAR(10) NOT NULL,           -- 장르

    price        INT NOT NULL,                   -- 가격

    stock        INT,                            -- 재고

    pub_date     DATE,                           -- 출판일

    CONSTRAINT PRIMARY KEY (book_id)           -- 기본키 제약조건

);

-- 2. 주문 테이블

CREATE TABLE orders (

    order_id     INT AUTO_INCREMENT,             -- 주문번호

    book_id      INT NOT NULL,                   -- 도서번호 (FK)

    customer     VARCHAR(20) NOT NULL,           -- 고객명

    order_qty    INT NOT NULL,                   -- 주문수량

    order_date   DATE,                           -- 주문일

    CONSTRAINT PRIMARY KEY (order_id),         -- 기본키 제약조건

    CONSTRAINT FOREIGN KEY (book_id) REFERENCES books(book_id) -- 외래키 제약조건

);

-- 샘플 데이터 삽입

INSERT INTO books VALUES(1001, '혼공 SQL', '우재남', '컴퓨터', 22000, 15, '2020-01-01');

INSERT INTO books VALUES(1002, '이것이 자바다', '신용권', '컴퓨터', 30000, 30, '2018-05-20');

INSERT INTO books VALUES(1003, '불편한 편의점', '김호연', '소설', 14000, 5, '2021-04-20');

INSERT INTO books VALUES(1004, '달러구트 꿈 백화점', '이미예', '소설', 13800, 25, '2020-07-08');

INSERT INTO books VALUES(1005, '트렌드 코리아 2023', '김난도', '경제', 19000, 50, '2022-10-05');

INSERT INTO books VALUES(1006, '원씽(The One Thing)', '게리 켈러', '자기계발', 14000, 12, '2013-08-20');

INSERT INTO books VALUES(1007, '역사의 쓸모', '최태성', '역사', 16000, 0, '2018-11-26');

INSERT INTO books VALUES(1008, '파친코', '이민진', '소설', 15800, 3, '2022-07-14');

INSERT INTO books VALUES(1009, 'Do it! 점프 투 파이썬', '박응용', '컴퓨터', 18800, NULL, '2019-06-20');

INSERT INTO books VALUES(1010, '코스모스', '칼 세이건', '과학', 19500, 8, '2006-12-20');

INSERT INTO books VALUES(1011, '혼공 JAVA', '우재남', '컴퓨터', 24000, 17, '2019-01-01');


INSERT INTO orders VALUES(NULL, 1001, '김민준', 2, '2023-01-15');

INSERT INTO orders VALUES(NULL, 1002, '이서연', 1, '2023-01-18');

INSERT INTO orders VALUES(NULL, 1003, '박지훈', 1, '2023-02-01');

INSERT INTO orders VALUES(NULL, 1004, '김민준', 3, '2023-02-05');

INSERT INTO orders VALUES(NULL, 1005, '최수아', 1, '2023-02-11');

INSERT INTO orders VALUES(NULL, 1001, '박지훈', 1, '2023-02-12');

INSERT INTO orders VALUES(NULL, 1008, '이서연', 2, '2023-03-02');

INSERT INTO orders VALUES(NULL, 1009, '정현우', 5, '2023-03-05');

INSERT INTO orders VALUES(NULL, 1002, '김민준', 2, '2023-03-10');

INSERT INTO orders VALUES(NULL, 1006, '최수아', 1, '2023-04-01');

INSERT INTO orders VALUES(NULL, 1003, '박지훈', 3, '2023-04-02');

INSERT INTO orders VALUES(NULL, 1001, '이서연', 1, '2023-04-08');

INSERT INTO orders VALUES(NULL, 1005, '김민준', 2, '2023-04-15');

INSERT INTO orders VALUES(NULL, 1004, '정현우', 1, '2023-04-20');

INSERT INTO orders VALUES(NULL, 1008, '최수아', 1, '2023-05-01');

INSERT INTO orders VALUES(NULL, 1010, '박지훈', 2, '2023-05-05');

INSERT INTO orders VALUES(NULL, 1002, '최수아', 1, '2023-05-12');

INSERT INTO orders VALUES(NULL, 1006, '이서연', 2, '2023-05-20');

INSERT INTO orders VALUES(NULL, 1009, '김민준', 1, '2023-06-01');

INSERT INTO orders VALUES(NULL, 1001, '정현우', 3, '2023-06-07');

INSERT INTO orders VALUES(NULL, 1003, '이서연', 2, '2023-06-15');

INSERT INTO orders VALUES(NULL, 1005, '박지훈', 1, '2023-07-01');

INSERT INTO orders VALUES(NULL, 1010, '김민준', 1, '2023-07-03');

INSERT INTO orders VALUES(NULL, 1004, '최수아', 2, '2023-07-10');

select * from orders;
-- [문제 1]
select customer from orders group by customer; 
-- [문제 2]
select genre from books group by genre;
-- [문제 3]
select book_id from orders group by book_id;
-- [문제 4]
select author from books group by author;
-- [문제 5]
select count(*) from orders;
-- [문제 6]
select sum(order_qty) from orders;
-- [문제 7]
select avg(price) from books;
-- [문제 8]
select max(price) from books;
select min(price) from books;
--[문제 9]
select count(stock) from books where stock is not null;
--[문제 10]
select customer, count(customer) from orders group by customer;
--[문제 11]
select book_id, sum(order_qty) from orders group by book_id;
--[문제 12]
select customer, sum(order_qty) from orders group by customer having sum(order_qty) >= 5;
--[문제 13]
select book_id, count(order_qty) from orders group by book_id having count(order_qty) >= 3;
--[문제 14]
select price from books order by price desc;
--[문제 15]
select price from books order by price Limit 3;