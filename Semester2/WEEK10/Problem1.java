package week_10;

import java.sql.*;

public class Problem1 {

    public static void main(String[] args) {
        // Hardcoded SQL Queries
        String createTableQuery =
            "CREATE TABLE user_data (" +
            "id NUMBER PRIMARY KEY, " +
            "name VARCHAR2(50), " +
            "email VARCHAR2(50))";

        String insertQuery =
            "INSERT INTO user_data (id, name, email) VALUES (1, 'John Doe', 'john.doe@example.com')";

        String selectQuery = "SELECT * FROM user_data";

        try {
            String user = "system";
            String password = "system";

            // Load Oracle JDBC driver
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";

            // Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            // Execute hardcoded queries
            stmt.executeUpdate(createTableQuery);
            System.out.println("Table created successfully.");

            stmt.executeUpdate(insertQuery);
            System.out.println("1 row inserted.");

            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("An error occurred while accessing the database.");
        }
    }
}