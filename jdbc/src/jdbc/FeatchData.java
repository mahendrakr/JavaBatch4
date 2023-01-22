package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FeatchData {

	public static void main(String[] args) throws SQLException {
		
	Connection con = JDBCUtil.getConnection();
       String sql= " select * from student1";
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
       
       if(rs.next()) {
    	   do {
    		 System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getLong(3)+" "+rs.getString(4));  
    	   }while(rs.next());
    	  
       }
       JDBCUtil.closeResource(con, st);
	}

}
