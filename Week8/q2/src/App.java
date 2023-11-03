import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        // JDBC URL, username, and password of the database
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            if (connection != null) {
                System.out.println("Connected to the database!");
                // Do database operations here

                // 3. Close the connection when done
                connection.close();
                System.out.println("Connection closed.");
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Error: JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error: Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}