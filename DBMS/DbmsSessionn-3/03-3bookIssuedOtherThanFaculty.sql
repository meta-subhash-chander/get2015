-- Query To open library database
use librarysystem;

-- book issued other than faculty

select BI.member_Id , U.member_nm from Book_Issue BI ,members U 
where BI.member_Id=U.member_Id and U.catagory not in('faculty');

