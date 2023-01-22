package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//hw---: 1: insert 102,"surbhi", 103,"Rhishab", 104,"shreya", 105,"subu"  into table 
public class InsertData {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			// Step 1: Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step:2 establish the connection
			String url = "jdbc:mysql://localhost:3306/javabatch4";
			con = DriverManager.getConnection(url, "root", "123456");
			// step 3: Prepare sql statement.
		//	String sql = "insert into student(sid,sname) values(103,'Rhishab'),(104,'shreya')";
			String sql = "insert into student1 values(1 ,'surbhi' ,9922446, 'F')";
			// step 4: Create jdbc statement
			st = con.createStatement();
			// step 5: submit sql statement to database using jdbc statement.
			int x = st.executeUpdate(sql);
			// step 6: process the result or check wheather record is inserted or not.
			if (x == 1) {
				System.out.println("Inserted data successfully");
			} else
				System.out.println("failed to insert the record");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				con.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
