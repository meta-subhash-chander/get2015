-- Query To open library database
use librarysystem;

-- subject wise information on number of books purchased
SELECT COUNT(S.subject_Id) AS total_Purchased ,S.subject_Id,S.subject_nm FROM Subjects S,Books B,Titles T
WHERE
T.title_Id=B.title_Id AND S.subject_Id=T.subject_Id GROUP BY S.subject_Id;

