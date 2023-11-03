import java.sql.*;
public class App {
    public static void main(String[] args) {
        final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // For MySQL database
        final String DB_URL = "jdbc:mysql://localhost:3306/students"; // For MySQL database
        final String USER = "root";
        final String PASS = "mypassword";
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT id, name, age, grade FROM student";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String grade = rs.getString("grade");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}