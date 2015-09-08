/*remove foreign key constraints*/
ALTER TABLE book_issue 
DROP FOREIGN KEY book_issue_ibfk_1;

ALTER TABLE book_return 
DROP FOREIGN KEY book_return_ibfk_1;

/*drop table*/
DROP TABLE members;