package jdbc;
//https://jar-download.com/download-handling.php

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//hw---: 1: insert 102,"surbhi", 103,"Rhishab", 104,"shreya", 105,"subu"  into table 
// 2:- Delete record whose id is 104.
//3:- update the ID of Rhishab from 103 to 999.
        
public class JdbcDemo {
 public static void main(String[] args) {
  Connection con = null;
  Statement st = null;
  try {
   // Step 1:Load the Driver class.
   Class.forName("com.mysql.cj.jdbc.Driver"); 
   // Step 2: Establish the connection.
   final String url = "jdbc:mysql://localhost:3306/mydb";
   con = DriverManager.getConnection(url, "root", "Subodh@123");
   // Step 3: Prepare the SQL statement.
   String sql = "insert into student values(101,'Nyasha')";
   // Step 4: Create JDBC statement
   st = con.createStatement();
   // Step 5: Submit the SQL statement to Database using JDBC statement.
   int x = st.executeUpdate(sql);
   // Step 6: Process the result.
   if (x == 1) {
    System.out.println("Record Inserted");
   } else {
    System.out.println("Record Not Inserted");
   }
  } catch (ClassNotFoundException | SQLException e) {
   e.printStackTrace();
  } finally {
   // Step 7: Close all the resources.
   try {
    if (con != null)
     con.close();
    if (st != null)
     st.close();
   } catch (SQLException e) {
    System.out.println("Exception occur while closing the resources");
   }
  }
 }
}