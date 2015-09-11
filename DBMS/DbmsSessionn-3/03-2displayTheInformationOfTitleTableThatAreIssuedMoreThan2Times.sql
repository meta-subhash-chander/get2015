-- Query To open library database
use librarysystem;
-- Query to display the information of title table that are issued more than 2 times

SELECT COUNT(T.title_id) AS total_issued,T.title_id,T.title_nm FROM Titles T,Books B,Book_Issue BI 
WHERE B.accession_no=BI.accession_no AND B.Title_id=T.title_id  GROUP BY T.Title_id HAVING COUNT(T.title_id)>=2;


