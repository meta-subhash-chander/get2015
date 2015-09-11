
-- Query To open library database
use librarysystem;

-- to display information of books issued for more than two months

select period_diff(DATE_FORMAT(due_dt, '%y%m'),DATE_FORMAT(issue_dt, '%y%m')) as 
issue_for_months,BI.accession_no, U.member_id,U.member_nm,T.title_nm,BI.issue_dt,BI.due_dt 
from Book_Issue BI,members U,Titles T,Books B 
where  period_diff(DATE_FORMAT(due_dt, '%y%m'),DATE_FORMAT(issue_dt, '%y%m')) >= 2 AND
BI.member_id=U.member_id AND 
B.title_id=T.title_id AND 
B.accession_no=BI.accession_no
ORDER BY U.member_nm,T.title_nm;



