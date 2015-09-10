/*Set default value to due_dt column in members table with current date of system + 15 day*/
DELIMITER $$

CREATE TRIGGER set_default_duedate 
BEFORE INSERT ON book_issue
FOR EACH ROW
BEGIN
SET NEW.due_dt = issue_dt + INTERVAL 15 DAY;
END$$

DELIMITER ;
/*Insert data into members table*/

INSERT INTO members (
	`member_id`, `member_nm`, `addressline1`, `addressline2`, `catagory`)
 	VALUES ('1', 'subahsh', 'bhadra', 'hanumangarh, rajasthan', 'm'
);

INSERT INTO members (
	`member_id`, `member_nm`, `addressline1`, `addressline2`, `catagory`)
 	VALUES ('2', 'sita', 'EPIP', 'kota', 'f'
);

INSERT INTO members (
	`member_id`, `member_nm`, `addressline1`, `addressline2`, `catagory`)
 	VALUES ('3', 'ram', 'Malviya nagar', 'jaipur, rajasthan', 'm'
);





/*Insert data into subjects table*/

INSERT INTO subjects (
	`subject_id`, `subject_nm`)
	 VALUES ('50', 'dbms'
);

INSERT INTO subjects (
	`subject_id`, `subject_nm`)
	 VALUES ('51', 'rdbms'
);

INSERT INTO subjects (
	`subject_id`, `subject_nm`)
	 VALUES ('52', 'oops'
);


/*Insert data into publishers table*/
INSERT INTO publishers (
	`publisher_id`, `publisher_nm`)
	 VALUES ('60', 'jaipur books'
);

INSERT INTO publishers (
	`publisher_id`, `publisher_nm`)
	 VALUES ('61', 'delhi books'
);

INSERT INTO publishers (
	`publisher_id`, `publisher_nm`)
	 VALUES ('62', 'Ajmer books'
);



/*Insert into authors table*/

INSERT INTO authors (
	`author_id`, `author_nm`)
	 VALUES ('70', 'mehul'
);

INSERT INTO authors (
	`author_id`, `author_nm`)
	 VALUES ('71', 'subahsh'
);

INSERT INTO authors (
	`author_id`, `author_nm`)
	 VALUES ('72', 'suman'
);
use librarySystem;
/*insert data into titles*/

INSERT INTO titles (
	`title_id`, `title_nm`, `subject_id`, `publisher_id`)
	 VALUES ('80', 'first title', '50', '60'
);
INSERT INTO titles (
	`title_id`, `title_nm`, `subject_id`, `publisher_id`)
	 VALUES ('81', 'second title', '51', '61'
);

INSERT INTO titles (
	`title_id`, `title_nm`, `subject_id`, `publisher_id`)
	 VALUES ('82', 'thrird title', '52', '62'
);

/*Insert into books*/

INSERT INTO books (
	`accession_no`, `title_id`, `purchase_dt`, `price`, `status`)
	VALUES (100, '80', '2015-03-12', 20, 'Y'
);

INSERT INTO books (
	`accession_no`, `title_id`, `purchase_dt`, `price`, `status`)
	VALUES (101, '81', '2015-04-12', 22, 'Y'
);

INSERT INTO books (
	`accession_no`, `title_id`, `purchase_dt`, `price`, `status`)
	VALUES (102, '82', '2015-05-12', 32, 'Y'
);


/*Insert data into title_author*/

INSERT INTO title_author (
	`title_id`, `author_id`) 
	VALUES ('80', '70'
);

INSERT INTO title_author (
	`title_id`, `author_id`) 
	VALUES ('81', '71'
);

INSERT INTO title_author (
	`title_id`, `author_id`) 
	VALUES ('82', '72'
);




/*Insert into book_issue*/


INSERT INTO book_issue (
	`issue_dt`, `accession_no`, `member_id`, `due_dt`) 
	VALUES ('2015-08-01', 101, '1', '2015-08-16'
);
INSERT INTO book_issue (
	`issue_dt`, `accession_no`, `member_id`, `due_dt`) 
	VALUES ('2015-08-15', 102, '2', '2015-08-31'
);

/*Insert into book_return*/
INSERT INTO book_return (
	`return_dt`, `accession_no`, `member_id`, `issue_dt`) 
	VALUES ('2015-08-31', 102, '2', '2015-08-15'
);


