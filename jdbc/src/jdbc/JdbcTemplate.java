package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JdbcTemplate {
	private Connection con = null;
	private Statement st = null;
	private static final String SINGLE_QUOTE = "'";
	private static final String COMMA = ",";

	public void saveRecord(Student student) {

		try {
			con=JDBCUtil.getConnection();
			String sql = "insert into student1 values (" + student.getId() + COMMA + SINGLE_QUOTE + student.getName()
					+ SINGLE_QUOTE + COMMA + student.getPhno() + COMMA + SINGLE_QUOTE + student.getGender()
					+ SINGLE_QUOTE + ")";
			st=con.createStatement();
			int x = st.executeUpdate(sql);

			if (x == 1) {
				System.out.println("record saved successfully");
			} else
				System.out.println("faild to save record");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeResource(con, st);
		}
	}

	public void deleteRecordByID(int id) {

	}

	public void updateRecord(int id) {

	}

	public List<Student> selectRecord() {
		return null;
	}
	public void saveRecordUsingPstatement(Student student) {
		PreparedStatement ps =null;
		try {
			con=JDBCUtil.getConnection();
			String sql="insert into student1 values(?,?,?,?)";
			 ps = con.prepareStatement(sql);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setLong(3, student.getPhno());
			ps.setString(4, student.getGender());
			
			//st=ps;
			
			//int x = st.executeUpdate(sql);
			int x = ps.executeUpdate();

			if (x == 1) {
				System.out.println("record saved successfully");
			} else
				System.out.println("faild to save record");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeResource(con, ps);
		}
	}
}
