
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteBooksNotIssueByMemberMorThenOneYear {

	private int numberOfBooksDeleted;

	public int getNumberOfBooksDeleted() {
		return numberOfBooksDeleted;
	}

	public void setNumberOfBooksDeleted(int numberOfBooksDeleted) {
		this.numberOfBooksDeleted = numberOfBooksDeleted;
	}

	public static DeleteBooksNotIssueByMemberMorThenOneYear deleteBooks() {
		String query = "DELETE FROM books "
				+ "WHERE (accession_no "
				+ "NOT IN (SELECT accession_no FROM book_issue)"
				+ "AND DATEDIFF(now(),purchase_dt)>365)"
				+ "OR accession_no "
				+ "IN (SELECT bi.accession_no FROM book_issue bi "
				+ "WHERE DATEDIFF(now(),bi.issue_dt)>365 "
				+ "AND (bi.accession_no,bi.issue_dt,bi.member_id) "
				+ "IN (SELECT br.accession_no,br.issue_dt,br.member_id FROM book_return br));";
		Connection connection = null;
		int resultSet = 0;
		Statement statement = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		DeleteBooksNotIssueByMemberMorThenOneYear deleteBooks = null;
		connection = connectionUtil.getConnection();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeUpdate(query);
			deleteBooks = new DeleteBooksNotIssueByMemberMorThenOneYear();
			deleteBooks.setNumberOfBooksDeleted(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deleteBooks;
	}
}