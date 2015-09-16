import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Books {

	private String titleName;

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public static ArrayList<Books> getBooksByAuthorName(String authorName) {
		String query = "SELECt t.title_nm FROM titles t, authors a, title_author ta WHERE ta.title_id = t.title_id AND ta.author_id = a.author_id AND a.author_nm = '"
				+ authorName + "';";
		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		Books title;
		connection = connectionUtil.getConnection();
		ArrayList<Books> titleList = new ArrayList<Books>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				title = new Books();
				title.setTitleName(resultSet.getString(1));
				titleList.add(title);
			}
		} catch (SQLException e) {
			e.getStackTrace();
		}
		return titleList;
	}

}
