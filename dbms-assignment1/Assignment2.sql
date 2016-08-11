/* Assignment2 */
/* Create a database */
CREATE DATABASE lis;

USE lis;

CREATE TABLE members(
    member_id VARCHAR(20) PRIMARY KEY,
    member_name VARCHAR(40) NOT NULL,
    addressline1 VARCHAR(100) NOT NULL,
    addressline2 VARCHAR(100),
    category ENUM('Xx','Yy','Zz')
);

CREATE TABLE books(
	accession_number INT(5) PRIMARY KEY,
    title_id VARCHAR(20) NOT NULL,
    purchase_date DATE,
    price INT(4) NOT NULL,
    book_status ENUM('AVAILABLE', 'RENTED', 'SOLD'),
    CONSTRAINT fk_title_id_books FOREIGN KEY (title_id)
       REFERENCES titles (title_id)
);
  
CREATE TABLE book_issue(
	issue_date DATE,
    accession_number INT(5),
    member_id VARCHAR(20),
    due_date DATE NOT NULL,
    PRIMARY KEY(issue_date, accession_number, member_id),
	CONSTRAINT fk_accession_number_book_issue FOREIGN KEY (accession_number)
       REFERENCES books (accession_number),
    CONSTRAINT fk_member_id_book_issue FOREIGN KEY (member_id)
    
       REFERENCES members (member_id)
);

CREATE TABLE book_return(
	return_date DATE,
    accession_number INT(5),
    member_id VARCHAR(20),
    issue_date DATE NOT NULL,
    PRIMARY KEY(return_date, accession_number, member_id),
    CONSTRAINT fk_accession_number_book_return FOREIGN KEY (accession_number)
       REFERENCES books (accession_number),
    CONSTRAINT fk_member_id_book_return FOREIGN KEY (member_id)
       REFERENCES members (member_id)
);

CREATE TABLE subjects(
	subject_id VARCHAR(20) PRIMARY KEY,
    subject_name VARCHAR(20) NOT NULL
);

CREATE TABLE titles(
	title_id VARCHAR(20) PRIMARY KEY, 
    title_name VARCHAR(50) NOT NULL,
    subject_id VARCHAR(20) NOT NULL,
    publisher_id VARCHAR(20) NOT NULL,
	CONSTRAINT fk_subject_id_titles FOREIGN KEY (subject_id)
       REFERENCES subjects (subject_id)
);

CREATE TABLE publishers(
	publisher_id VARCHAR(20) PRIMARY KEY,
    publisher_name VARCHAR(50) NOT NULL
);

CREATE TABLE author(
	author_id VARCHAR(20) PRIMARY KEY,
    author_name VARCHAR(50) NOT NULL
);

CREATE TABLE title_author(
	title_id VARCHAR(20),
    author_id VARCHAR(20),
    PRIMARY KEY(title_id, author_id),
    CONSTRAINT fk_title_id_title_author FOREIGN KEY (title_id)
		REFERENCES titles (title_id),
	CONSTRAINT fk_author_id_author FOREIGN KEY (author_id)
		REFERENCES author (author_id)
);

SHOW TABLES;

select CURRENT_TIMESTAMP+INTERVAL 15  DAY;

ALTER TABLE book_issue MODIFY 
	COLUMN issue_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP;
  
/*ALTER TABLE book_issue MODIFY COLUMN due_date TIMESTAMP DEFAULT DATE_ADD(CURRENT_TIMESTAMP,INTERVAL 15 DAY);*/

SET FOREIGN_KEY_CHECKS=0;

DROP TABLE members;

SET FOREIGN_KEY_CHECKS=1;

CREATE TABLE members(
    member_id VARCHAR(20) PRIMARY KEY,
    member_name VARCHAR(40) NOT NULL,
    addressline1 VARCHAR(100) NOT NULL,
    addressline2 VARCHAR(100),
    category ENUM('M','F')
);

desc book_return;

ALTER TABLE book_return ADD CONSTRAINT FOREIGN KEY (member_id)
		REFERENCES members (member_id);
       
ALTER TABLE book_return ADD CONSTRAINT FOREIGN KEY (member_id) 
		REFERENCES members (member_id);