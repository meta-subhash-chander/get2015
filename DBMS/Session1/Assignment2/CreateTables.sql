
/* Create all tables of Library as described and mentioned in Slides. (Write all CREATE commands in a SQL file and run that SQL File).*/
CREATE TABLE members(
	member_id VARCHAR(50) PRIMARY KEY,
	member_nm VARCHAR(100),
	addressline1 VARCHAR(100),
	addressline2 VARCHAR(100),
	catagory VARCHAR(50)
);

CREATE TABLE subjects(
	subject_id VARCHAR(50) PRIMARY KEY,
	subject_nm VARCHAR(100)
);

CREATE TABLE publishers(
	publisher_id VARCHAR(50) PRIMARY KEY,
	publisher_nm VARCHAR(100)
);

CREATE TABLE authors(
	author_id VARCHAR(50) PRIMARY KEY,
	author_nm VARCHAR(100)
);

CREATE TABLE titles(
	title_id VARCHAR(50) PRIMARY KEY,
	title_nm VARCHAR(100),
	subject_id VARCHAR(50),
	publisher_id VARCHAR(50),
	FOREIGN KEY(subject_id) REFERENCES subjects(subject_id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY(publisher_id) REFERENCES publishers(publisher_id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE title_author(
	title_id VARCHAR(50),
	author_id VARCHAR(50),
	FOREIGN KEY(title_id) REFERENCES titles(title_id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY(author_id) REFERENCES authors(author_id) ON DELETE CASCADE ON UPDATE CASCADE,
	PRIMARY KEY(title_id,author_id)		
);

CREATE TABLE books(
	accession_no INT PRIMARY KEY,
	title_id VARCHAR(50),
	purchase_dt DATE,
	price DOUBLE,
	status VARCHAR(50),
	FOREIGN KEY(title_id) REFERENCES titles(title_id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE book_issue(
	issue_dt DATE NOT NULL,
	accession_no INT,
	member_id VARCHAR(50),
	due_dt DATE,
	FOREIGN KEY(member_id) REFERENCES members(member_id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY(accession_no) REFERENCES books(accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
	PRIMARY KEY(issue_dt,accession_no,member_id)
);

CREATE TABLE book_return(
	return_dt DATE NOT NULL,
	accession_no INT,
	member_id VARCHAR(50),
	issue_dt DATE,
	FOREIGN KEY(member_id) REFERENCES members(member_id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY(accession_no) REFERENCES books(accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
	PRIMARY KEY(return_dt,accession_no,issue_dt)
);

