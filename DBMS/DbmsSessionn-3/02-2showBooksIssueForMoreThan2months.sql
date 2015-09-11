-- Query To open library database
use librarysystem;

--  to show books issue for more than 2 months

select *
from Book_Issue
where period_diff( date_format(due_dt, '%Y%m') ,date_format(issue_dt, '%Y%m') )>2 ; 






