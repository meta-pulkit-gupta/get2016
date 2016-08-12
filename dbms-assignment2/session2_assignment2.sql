/* Assignment 2 */

/* Selecting the database */
USE lis;

/* To display information on all the books issued. The result should have issue date, 
 * accessin number, member id, member name and return date. If book is not returned,
 * keep the return date column blank. Sort the result in ascending order of issue date
 * and then ascending ordeer of member name*/
SELECT bi.issue_date AS 'Issue Date', bi.accession_number AS 'Accession Number', bi.member_id AS 'Member Id', bi.due_date AS 'Return Date', m.member_name AS 'Member Name'
	FROM book_issue bi 
	LEFT JOIN book_return br ON bi.accession_number = br.accession_number
	LEFT JOIN members m ON bi.member_id = m.member_id
	ORDER BY bi.issue_date, m.member_name;
	