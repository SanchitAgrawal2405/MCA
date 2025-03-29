package week_10;

import java.sql.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Problem3 {
    private static final Logger logger = LogManager.getLogger(Problem2.class);

    public static Connection getConnection() throws ClassNotFoundException, DatabaseConnectionException {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "SYSTEM";
        String password = "SYSTEM";

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new DatabaseConnectionException("Failed to connect to the database.", e);
        }
    }

    public static void executeQueries() throws DatabaseConnectionException, ClassNotFoundException {
        String createTableQuery =
            "CREATE TABLE user_data (" +
            "id NUMBER PRIMARY KEY, " +
            "name VARCHAR2(50), " +
            "email VARCHAR2(50))";

        String insertQuery = "INSERT INTO user_data (id, name, email) VALUES (1, 'John Doe', 'john.doe@example.com')";
        String selectQuery = "SELECT * FROM user_data";

        Statement stmt = null;
        ResultSet rs = null;

        try (Connection conn = getConnection()) {
            stmt = conn.createStatement();

            // Try creating the table
            try {
                stmt.executeUpdate(createTableQuery);
                System.out.println("Table created successfully.");
            } catch (SQLException e) {
                if (e.getErrorCode() == 955) { // ORA-00955: name is already used by an existing object
                    System.out.println("Table already exists.");
                } else {
                    throw e;
                }
            }

            // Insert data
            try {
                int rowsInserted = stmt.executeUpdate(insertQuery);
                System.out.println(rowsInserted + " row(s) inserted.");
            } catch (SQLException e) {
                if (e.getErrorCode() == 1) { // ORA-00001: unique constraint violated
                    System.out.println("Data with the same ID already exists.");
                } else {
                    throw e;
                }
            }

            // Select data
            rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

        } catch (SQLException e) {
            System.out.println("An error occurred during SQL operations: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                logger.error("Error closing resources", e);
            }
            System.out.println("Database connection closed (handled automatically).");
        }
    }

    public static void main(String[] args) {
        try {
            executeQueries();
        } catch (DatabaseConnectionException | ClassNotFoundException ex) {
            logger.error("Error: ", ex);
        }
    }
}
