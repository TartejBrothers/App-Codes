import java.sql.*;

public class App {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "mypassword";

        String selectQuery = "SELECT * FROM students";

        try {
            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a Statement
            Statement statement = connection.createStatement();

            // Execute the SELECT query
            ResultSet resultSet = statement.executeQuery(selectQuery);

            // Iterate through the result set and print the data
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Close the resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
