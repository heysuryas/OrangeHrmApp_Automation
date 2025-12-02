package Utilities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtils {

    public static ResultSet executeQuery(String query) {
        ResultSet result = null;
        try {
            Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();
            result = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
