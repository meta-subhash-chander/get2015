
public class ImplementationOfDeleteBooks {

	public static void main(String[] args) {

		DeleteBooksNotIssueByMemberMorThenOneYear deletedBooks = DeleteBooksNotIssueByMemberMorThenOneYear.deleteBooks();
		if (deletedBooks.getNumberOfBooksDeleted() == 0) {
			System.out.println("No Books are deleted");
		} else {
			System.out.println("Number of book deleted = "
					+ deletedBooks.getNumberOfBooksDeleted());
		}

	}

}
