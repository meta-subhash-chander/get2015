

/*create table*/
CREATE TABLE members(
	member_id VARCHAR(50) PRIMARY KEY,
	member_nm VARCHAR(100),
	addressline1 VARCHAR(100),
	addressline2 VARCHAR(100),
	catagory VARCHAR(50)
);

/*Add foreign key constraints*/
ALTER TABLE book_issue
ADD FOREIGN KEY (member_id)
REFERENCES members(member_id);

ALTER TABLE book_return
ADD FOREIGN KEY (member_id)
REFERENCES members(member_id);