/* Modify date into table book_issue ,set date as current date*/
ALTER TABLE book_issue MODIFY COLUMN issue_dt TIMESTAMP not NULL DEFAULT NOW();


