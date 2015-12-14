
package gui;
import java.sql.*;

/**
 *
 * @author Karen Springford
 * @date December 8, 2015
 */
public class DBUtil {

    //The database URL//
    final String DB_URL = "jdbc:mysql://sql.computerstudi.es:3306/gc200299681";

    //userName & password & connection//
        private final String userName ="gc200299681";
        private final String password = "3VNBh2r4";
        private Connection conn;


    //method to create and return a connection
    public Connection getConnection() {
        try {
            conn = DriverManager.getConnection(
                    DB_URL,
                    userName,
                    password);
        } catch (SQLException error) {

        }
        return conn;
    }

}
