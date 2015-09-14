-- 1. Create a View which can be used to display member name and
-- all issue details of the member using a simple SELECT command.

create view  member_detail as select member_nm 
create view  member_detail as select m.member_nm ,bi.member_id ,bi.accession_no, bi.issue_dt,bi.due_dt 
FROM book_issue bi
Left join
Members m
on bi.member_id=m.member_id;


select * from member_detail;

-- 2. Create a View which contains three columns, member name,
-- member id and full description of category, i.e., Faculty, Students
-- and Others instead of F,S and O.

create view member_desc 
as select member_id ,member_nm,if(catagory='faculty','F',if(catagory='Student','S','O')) 
from members;

select * from member_desc;

-- 3. Create a View which contains the information – subject name,
-- title, member name, category, issue date, due date and return
-- date. If the books have not been returned, NULL should be
-- displayed instead of return date.

  create view member_issue_detail as select bi.issue_dt ,b.title_id ,m.member_nm ,bi.due_dt,br.return_dt from books b ,members m ,book_issue bi
  left outer join
  book_return br
  on br.return_dt = bi.due_dt and br.member_id = bi.member_id
  where b.accession_no = bi.accession_no  and m.member_id = bi.member_id and m.member_id
  ; 
  
  select * from member_issue_detail;