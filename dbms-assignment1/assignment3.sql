/*Using the database lis */
USE lis;

/* Inserting values into the tables of lis database*/
INSERT INTO members VALUES ( 'E16/001', 'pulkit', 'E-87', 'Vaishali Nagar', 'M' );
INSERT INTO members VALUES ( 'E16/002', 'rajendra', 'E-187', 'patel Nagar', 'M' );
INSERT INTO members VALUES ( 'E16/003', 'Lucky', 'E-817', 'rajendra Nagar', 'M' );
INSERT INTO members VALUES ( 'E16/004', 'Ahmed', 'E-871', 'Lucky Nagar', 'M' );
INSERT INTO members VALUES ( 'E16/005', 'Noor', 'E-872', 'Noor Nagar', 'M' );
INSERT INTO members VALUES ( 'E16/006', 'sanjana', 'E-870', 'sare Nagar', 'F' );

INSERT INTO subjects VALUES ( 'S-001', 'Fiction' );
INSERT INTO subjects VALUES ( 'S-002', 'Action' );
INSERT INTO subjects VALUES ( 'S-003', 'Romance' );
INSERT INTO subjects VALUES ( 'S-004', 'Fantasy' );
INSERT INTO subjects VALUES ( 'S-005', 'Study' );

INSERT INTO publishers VALUES ( '1', 'TMH' );
INSERT INTO publishers VALUES ( '2', 'Oracle Publications' );
INSERT INTO publishers VALUES ( '3', 'Salesforce' );
INSERT INTO publishers VALUES ( '4', 'Pearson' );
INSERT INTO publishers VALUES ( '5', 'Genius Publications' );

INSERT INTO author VALUES ( 'A13-001', 'R.K.Sharma' );
INSERT INTO author VALUES ( 'A13-002', 'Bipul Jain' );
INSERT INTO author VALUES ( 'A14-001', 'Martin Luthor' );
INSERT INTO author VALUES ( 'A14-002', 'Adam' );
INSERT INTO author VALUES ( 'A14-003', 'Adil Mohammad' );

INSERT INTO titles VALUES ( 90001, 'The book of Life', 'S-001', '4' );
INSERT INTO titles VALUES ( 90002, 'Make It Happen', 'S-003', '4' );
INSERT INTO titles VALUES ( 90003, 'The Case of Missing City', 'S-002', '1' );
INSERT INTO titles VALUES ( 90004, 'All About Cloud', 'S-005', '3' );

INSERT INTO books VALUES ( 30001, 90001, '2015/01/01', 230.15, 'Available' );
INSERT INTO books VALUES ( 30002, 90002, '2015/03/22', 1230.15, 'Sold' );
INSERT INTO books VALUES ( 30003, 90003, '2016/04/15', 49.89, 'Rented' );
INSERT INTO books VALUES ( 30004, 90004, '2016/08/01', 5001.01, 'Rented' );

INSERT INTO title_author VALUES ( 90001, 'A13-002' );
INSERT INTO title_author VALUES ( 90002, 'A13-001' );
INSERT INTO title_author VALUES ( 90003, 'A13-002' );
INSERT INTO title_author VALUES ( 90004, 'A14-003' );

INSERT INTO book_issue VALUES ( '2016/08/10', 30001, 'E16/001', '2016/08/25' );
INSERT INTO book_issue VALUES ( '2016/08/10', 30002, 'E16/003', '2016/08/25' );
INSERT INTO book_issue VALUES ( '2016/08/10', 30003, 'E16/003', '2016/08/25' );

INSERT INTO book_return VALUES ( '2016/08/20', 30003, 'E16/003', '2016/08/10' );
INSERT INTO book_return VALUES ( '2016/08/25', 30001, 'E16/001', '2016/08/10' );

SET SQL_SAFE_UPDATES = 0;

/* Change value of addressLine2 column of Members table with “Jaipur”. */
UPDATE members SET addressline2 = 'Jaipur';


/* Change value of addressLine1 column of Members table with value “EPIP, Sitapura” for the members belonging to category “F”. */
UPDATE members SET addressline1 = 'EPIP, Sitapura'
	WHERE category = 'F';

SET SQL_SAFE_UPDATES = 1;

/* Delete all the rows from Publishers table. */
DELETE FROM publishers;

/* Insert the sample data back in Publishers table using substitution variables. */
SET @id = '1';
SET @name = 'TMH';
INSERT INTO publishers VALUES ( @id, @name );

SET @id = '2';
SET @name = 'Oracle Publications';
INSERT INTO publishers VALUES ( @id, @name );

SET @id = '3';
SET @name = 'Salesforce';
INSERT INTO publishers VALUES ( @id, @name );

SET @id = '4';
SET @name = 'pEARSON';
INSERT INTO publishers VALUES ( @id, @name );

SET @id = '5';
SET @name = 'Genius Publications';
INSERT INTO publishers VALUES ( @id, @name );

/* Deleting rows of title table with publisher id = 1 */
DELETE FROM titles WHERE publisher_id = '1'; 