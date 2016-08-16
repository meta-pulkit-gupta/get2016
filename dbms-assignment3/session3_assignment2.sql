/* Assignment 2 */
/* Selecting the database */
USE lis;

/* To display subjectwise information on number of books purchased.
 * It should include subject name, subject id and number of books purchased */

SELECT s.subject_id AS 'Subject ID', s.subject_name AS 'Subject Name',
    COUNT(b.accession_number) AS 'Number of books' FROM subjects s
    INNER JOIN titles t ON s.subject_id = t.subject_id
    INNER JOIN books b ON t.title_id = b.title_id
    GROUP BY s.subject_id;
 

/* To display those rows from book_issue table where a book can be returned 
 * after 2 months i.e. difference between issue and due date is greater than 2 months*/
SELECT * FROM book_issue
	WHERE timestampdiff(month,issue_date, due_date) > 2;

/* To display the list of books having price greater than the 
 * minimum price of books purchased so far */	
SELECT t.title_name 
	FROM books b
    INNER JOIN titles t ON b.title_id = t.title_id
    WHERE b.price > (SELECT min(price) FROM books );