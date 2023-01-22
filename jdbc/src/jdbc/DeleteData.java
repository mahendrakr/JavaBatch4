package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydb";
			con = DriverManager.getConnection(url, "root", "Subodh@123");

			String sql = "delete from student where sid=104";

			st = con.createStatement();

			int x = st.executeUpdate(sql);

			if (x == 1) {
				System.out.println("Record deleted successfully");
			} else
				System.out.println("deletion failed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				st.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
