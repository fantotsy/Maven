package ua.fantotsy;

import java.sql.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        if (containsArguments(args)) {
            System.out.print("There are some arguments: ");
            System.out.println(Arrays.toString(args));
        } else {
            System.out.println("There are no arguments!");
        }

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        Connection connection = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "fantotsy";
        String password = "root";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT st_name FROM students");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static boolean containsArguments(String[] args) {
        return (args.length > 0);
    }
}
