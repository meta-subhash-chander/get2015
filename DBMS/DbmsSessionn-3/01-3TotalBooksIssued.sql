-- Query To open library database
use librarysystem;
-- count of books issued

select Count(member_Id) as Total_books_issued from Book_Issue;

TotalBooksIssued