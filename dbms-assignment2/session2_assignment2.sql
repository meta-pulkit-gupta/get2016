USE lis;

SELECT bi.issue_date AS 'Issue Date', bi.accession_number AS 'Accession Number', bi.member_id AS 'Member Id', bi.due_date AS 'Return Date', m.member_name AS 'Member Name'
	FROM book_issue bi 
	LEFT JOIN book_return br ON bi.accession_number = br.accession_number
	LEFT JOIN members m ON bi.member_id = m.member_id
	ORDER BY bi.issue_date, m.member_name;
	