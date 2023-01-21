package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//3:- update the ID of Rhishab from 103 to 999.
//4:- update the ID of surbhi from 102 to 888.
public class UpdateData {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {

			con = JDBCUtil.getConnection();
			//String sql = "update student set sid=999 where sname='Rhishab'";
			String sql = "update student set sid=888 where sname='surbhi'";

			st = con.createStatement();

			int x = st.executeUpdate(sql);

			if (x == 1) {
				System.out.println("Record updated successfully");
			} else
				System.out.println("update fails");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeResource(con, st);
		}

	}

}
