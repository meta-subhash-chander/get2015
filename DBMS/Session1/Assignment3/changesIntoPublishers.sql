

/*Delete all the rows from Publishers table.*/

/*store table data into temporary tables*/
CREATE TEMPORARY TABLE tempPublisher ENGINE=MEMORY  AS (SELECT * FROM publishers);
CREATE TEMPORARY TABLE tempTitle ENGINE=MEMORY  AS (SELECT * FROM titles);
CREATE TEMPORARY TABLE temptitle_authors ENGINE=MEMORY  AS (SELECT * FROM title_authors);
CREATE TEMPORARY TABLE tempbooks ENGINE=MEMORY  AS (SELECT * FROM books);
CREATE TEMPORARY TABLE tempbook_issue ENGINE=MEMORY  AS (SELECT * FROM book_issue);
CREATE TEMPORARY TABLE tempbook_return ENGINE=MEMORY  AS (SELECT * FROM book_return);

/*Delete all rows of publishers tables*/
DELETE FROM publishers;

/*Insert the sample data back in Publishers table using substitution variables.*/
INSERT INTO publishers SELECT * FROM tempPublisher;
INSERT INTO titles SELECT * FROM tempTitle;
INSERT INTO title_authors SELECT * FROM temptitle_authors;
INSERT INTO books SELECT * FROM tempbooks;
INSERT INTO book_issue SELECT * FROM tempbook_issue;
INSERT INTO book_return SELECT * FROM tempbook_return;




/*Delete those rows of Titles table belonging to Publisher with publisher_id = publisher2*/
DELETE FROM titles WHERE publisher_id='publisher2';