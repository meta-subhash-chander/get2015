-- Query To open library database
use librarysystem;

-- to show count of total number of students,faculty and others in single row

select (select count(*) from members where catagory='student') as Student_count ,
(select count(*) from members where catagory='faculty') as Faculty_count , 
(select count(*) from members where catagory='other') as Other_count; 

