/* DBMS session 2 assignment*/

USE lis;

/* Write a select command to display all the columns of members table. */
SELECT member_id, member_name, addressline1, addressline2, category 
	FROM members;

/* To display member name, member id and category of member table */   
SELECT member_id, member_name, category 
	FROM members;
    
/* To display member name, member id and category of member table 
 * where the category of member is Faculty i.e. F */
SELECT member_id, member_name, category 
	FROM members WHERE category LIKE 'F%';
 
/* To display various categories of member */ 
SELECT DISTINCT category
	FROM members;

/* To display member name and category in descending order of member name */    
SELECT member_name, category 
	FROM members
    ORDER BY member_name DESC;

/* To display all titles, their subjects and their publishers */    
SELECT title_name, subject_name, publisher_name
	FROM titles t1
    INNER JOIN subjects s1 ON t1.subject_id = s1.subject_id
    INNER JOIN publishers p1 ON t1.publisher_id = p1.publisher_id;

/* To display number of members present in each category */
SELECT category, COUNT(member_id) AS 'Number of Members' FROM members GROUP BY category;

/* To display name of those members who belongs to the same category
 * as to which 'Keshav Sharma' belongs */
SELECT m1.member_name
	FROM members m1
    LEFT JOIN members m2 ON m1.category = m2.category
    WHERE m2.member_name = 'pulkit' AND m1.member_name != 'pulkit';

/* To display information on all the books issued. The result should have issue date, 
 * accessin number, member id, member name and return date. If book is not returned,
 * keep the return date column blank. */
SELECT bi.issue_date AS 'Issue Date', bi.accession_number AS 'Accession Number', bi.member_id AS 'Member Id', bi.due_date AS 'Return Date'
	FROM book_issue bi LEFT JOIN
		book_return br ON bi.accession_number = br.accession_number;

