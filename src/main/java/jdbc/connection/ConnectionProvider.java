package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    public static Connection connection;

    public static Connection createConnection() {

        try {
            //step1 : load driver
            Class.forName("com.mysql.jdbc.Driver");

            //step2 : create connection
            String url = "jdbc:mysql://localhost:3306/student_Manage?autoReconnect=true&useSSL=false";
            String userName = "root";
            String password = "Nepal@2040";
            connection = DriverManager.getConnection(url,userName,password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
