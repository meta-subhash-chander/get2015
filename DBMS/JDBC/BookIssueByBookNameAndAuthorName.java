import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BookIssueByBookNameAndAuthorName {

	public static void main(String arg[]) {

		String bookName;
		String memberName;
		Scanner scan = new Scanner(System.in);
		System.out.print("\n Enter title of Book : ");
		bookName = scan.nextLine();
		System.out.print("\n Enter member name : ");
		memberName = scan.nextLine();
		System.out.println(bookName);
		System.out.println(memberName);
		
		boolean flag = bookIssueByBookName(bookName, memberName);
		if (flag) {
			System.out.print("\n Book has issued to :" + memberName);
		} else {
			System.out.print("\n Book can't be issued ");
		}
		scan.close();
	}

	public static boolean bookIssueByBookName(String bookName, String memberName) {
		String query = "INSERT INTO Book_issue(issue_dt, accession_no, member_id, due_dt)  "
				+ " VALUES(now(), "
				+ "(select accession_no  from Books where title_id = "
				+ "(select title_id from Titles where title_nm=?)),  "
				+ "(select member_id from members where member_nm = ?),'2015-11-06');";

		boolean result = false;
		Connection connection = null;
		PreparedStatement statement = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		connection = conUtil.getConnection();

		try {
			statement = connection.prepareStatement(query);
			statement.setString(1, bookName);
			statement.setString(2, memberName);
			statement.executeUpdate(query);
			result = true;

		} catch (SQLException e) {
			return result;
		}
		return result;
	}

}
