package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	private static Connection con=null;
	
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mydb";
			 con = DriverManager.getConnection(url, "root","Subodh@123" );
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		return con;
	}
	
	public static void closeResource(Connection con,Statement st) {
		try {
			con.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}


}
