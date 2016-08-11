/* DBMS session 2 assignment*/

USE lis;

SELECT member_id, member_name, addressline1, addressline2, category 
	FROM members;
    
SELECT member_id, member_name, category 
	FROM members;
    
SELECT member_id, member_name, category 
	FROM members WHERE category LIKE 'F%';
    
SELECT DISTINCT category
	FROM members;
    
SELECT member_name, category 
	FROM members
    ORDER BY member_name DESC;
    
SELECT title_name, subject_name, publisher_name
	FROM titles t1
    INNER JOIN subjects s1 ON t1.subject_id = s1.subject_id
    INNER JOIN publishers p1 ON t1.publisher_id = p1.publisher_id;
    
SELECT category, COUNT(member_id) AS 'Number of Members' FROM members GROUP BY category;

SELECT m1.member_name
	FROM members m1
    LEFT JOIN members m2 ON m1.category = m2.category
    WHERE m2.member_name = 'pulkit' AND m1.member_name != 'pulkit';

/*dekhna 9 */
SELECT bi.issue_date AS 'Issue Date', bi.accession_number AS 'Accession Number', bi.member_id AS 'Member Id', bi.due_date AS 'Return Date'
	FROM book_issue bi LEFT JOIN
		book_return br ON bi.accession_number = br.accession_number;

