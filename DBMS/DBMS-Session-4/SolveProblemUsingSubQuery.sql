-- 1. Write a SELECT command to display name of those members
--  who belong to the category as to which member
-- “Keshav Sharma” belongs.

  SELECT member_nm from members 
  where catagory = (select catagory from members where member_nm = 'subahsh');

-- 2. Write a SELECT command to display information on the books
-- that have not been returned till date. The information should
-- include book issue date, title, member name and due date.

  select bi.issue_dt ,b.title_id ,m.member_nm ,due_dt from books b,book_issue bi ,members m
  where b.accession_no = bi.accession_no  and m.member_id = bi.member_id and m.member_id NOT IN(select br.member_id from
  book_return br where br.return_dt = bi.due_dt and br.member_id = bi.member_id); 

-- 3. Write a SELECT command to display information on the books
-- that have been returned after their due dates. The information
-- should include book issue date, title, member name and due
-- date.

  select bi.issue_dt ,b.title_id ,m.member_nm ,due_dt from books b,book_issue bi ,members m
  where b.accession_no = bi.accession_no  and m.member_id = bi.member_id and m.member_id IN(select br.member_id from
  book_return br where br.return_dt >= bi.due_dt and br.member_id = bi.member_id); 
  
-- 4. Write a SELECT command to display information of those books
-- whose price is equal to the most expensive book purchase so far.
  select s.subject_nm , a.author_nm ,p.publisher_nm ,b.price from  subjects s , publishers p , authors a ,titles t ,title_author ta,
  books b where price = (select max(price) from books) and b.title_id = t.title_id and t.subject_id = s.subject_id 
  and t.publisher_id = p.publisher_id and b.title_id = ta.title_id and ta.author_id = a.author_id;
 
-- 5. Write a SELECT command to display the second maximum price
-- of a book.

  select max(price) from books where price not in (select max(price) from books);