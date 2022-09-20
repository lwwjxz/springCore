package classloader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        ClassLoader loader = Test.class.getClassLoader();
        System.err.println(loader);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "1234");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
