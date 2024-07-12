/*
 * package java_Programs;
 * 
 * import java.sql.Connection; import java.sql.DriverManager; import
 * java.sql.ResultSet; import java.sql.SQLException; import java.sql.Statement;
 * //import org.apache.poi.ss.usermodel.*;
 * 
 * import java.io.FileOutputStream; import java.io.IOException; public class
 * testing {
 * 
 * // Database connection parameters String dbUrl =
 * "jdbc:mysql://your_database_host:your_database_port/your_database_name";
 * String username = "your_database_username"; String password ="";
 * 
 * // Establish database connection and retrieve data try { Connection conn =
 * DriverManager.getConnection(dbUrl,username,password); Statement stmt
 * =conn.createStatement();
 * 
 * 
 * // Execute SQL query to retrieve data ResultSet rs =
 * stmt.executeQuery("SELECT * FROM your_table");
 * 
 * // Process and print the retrieved data while (rs.next()) { int id
 * =rs.getInt("id");
 * 
 * 
 * String name = rs.getString("name"); System.out.println("ID: " + id +
 * ", Name: " + name); }
 * 
 * }
 * 
 * catch(SQLException e) { e.printStackTrace();
 * 
 * } }
 * 
 * }
 * 
 * 
 */