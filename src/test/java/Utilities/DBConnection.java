package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection;

    public static Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/orangehrm";
        String user = "root";
        String pass = "password";

        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(url, user, pass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
