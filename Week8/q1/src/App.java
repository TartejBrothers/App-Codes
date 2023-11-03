import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class App {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/airline";
        String username = "root";
        String password = "mypassword";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            if (connection != null) {
                System.out.println("Connected to the database!");
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