/* Assignment 1 */
/* Selecting the databse */
use lis;

/* To display information on books issued for more than 2 months.
 * It should include member name, member id, title name, accession number
 * issue date, due date and issued for how many months and be sorted on 
 * member name and then on title name. */

select m.member_name, m.member_id, t.title_name, b.accession_number, bi.issue_date, bi.due_date, br.return_date,
	TIMESTAMPDIFF(MONTH, bi.issue_date, IFNULL(br.return_date, CURRENT_TIMESTAMP)) AS 'Number of Months' 
		FROM book_issue bi
	INNER JOIN members m ON bi.member_id = m.member_id
	INNER JOIN books b ON bi.accession_number = b.accession_number
	INNER JOIN titles t ON b.title_id = t.title_id
	LEFT JOIN book_return br ON br.accession_number = bi.accession_number 
       AND br.member_id = bi.member_id AND br.issue_date = bi.issue_date
	WHERE timestampdiff(month,bi.issue_date,IFNULL(br.return_date, current_timestamp)) > 2;
 
/* To display those rows from members table having maximum length for member name */
SELECT member_name AS 'Member Name', length(member_name) AS 'Length'
	FROM members
    WHERE length(member_name) >= (SELECT max(length(member_name)) FROM members);

/* To display count of number of books issued so far */
SELECT count(books.accession_number) FROM books
	INNER JOIN book_issue ON books.accession_number = book_issue.accession_number;