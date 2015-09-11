-- Query To open library database
use librarysystem;

-- list of books having price grater than minimum price of book purchase so far
select * from  Books 
Where price>(SELECT min(price) from Books);



