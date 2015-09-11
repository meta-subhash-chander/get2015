-- Query To open library database
use librarysystem;

-- to show maximum length of user name
select member_nm,Length(member_nm) as Length_of_user_name from members 
Where Length(member_nm)=(SELECT MAX(Length(member_nm)) from members);


