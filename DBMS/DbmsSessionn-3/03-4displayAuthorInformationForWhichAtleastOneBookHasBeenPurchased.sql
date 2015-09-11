-- Query To open library database
use librarysystem;

-- Query TO display Author information for which atleast one book has been purchased

SELECT DISTINCT A.author_id,A.author_nm
FROM Authors A,Books B,Titles T ,Title_Author TA
WHERE A.author_id=TA.author_id AND T.title_id=TA.title_id AND T.title_id=B.title_id ;





