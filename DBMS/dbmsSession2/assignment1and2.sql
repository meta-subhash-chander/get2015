use library;
-- Query to find the columns of table members
SELECT * FROM members;
-- Query to find the member id,member name,category of table members
SELECT member_id,member_nm, catagory FROM members;
-- Query to find the member id,member name,category of table members whose category = "f"
SELECT member_id,member_nm, catagory FROM members WHERE catagory = 'f';
-- Query to find distinct category of table members
SELECT DISTINCT(catagory) FROM members;
-- Query to find the member id,member name of table members order by desc
SELECT member_id,member_nm FROM members ORDER BY member_nm DESC;
-- Query to find the titles name,publisher name, subject id of table
SELECT title_nm,e.publisher_nm, subject_Id FROM Titles t , Publishers e WHERE t.publisher_id=e.publisher_id;
-- Query to find the count of members of category
SELECT catagory,COUNT(*) From members GROUP BY catagory;
-- Query to find name of members to which subhash belongs
SELECT m1.member_nm FROM members AS m1 JOIN members AS m2 ON m1.catagory = m2.catagory WHERE m2.member_nm ="subhash";
-- Query to find the status of return book and if returned  then place blank
SELECT issue_Dt,member_Id,e.accession_No, IF( status = 0 , return_Dt," " ) as Book_Returned FROM Books e,Book_Return f WHERE e. accession_No = f.accession_No;


-- Assignment 2
-- Query to  display results in ascending order of issue date and within issue date in ascending order of members name.

SELECT f.issue_Dt, f.member_Id,f.accession_No,IF( e.status =0 , return_Dt," " ) as Book_Returned from Books e,Book_Return f, Members m WHERE ((e. accession_No = f.accession_No )&&(f.member_Id=m.member_Id)) ORDER BY issue_dt asc , member_Nm asc;


