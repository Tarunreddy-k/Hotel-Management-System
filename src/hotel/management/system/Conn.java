package hotel.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = System.getenv("DB_URL");
            String username = System.getenv("DB_USER");
            String password = System.getenv("DB_PASSWORD");

            c = DriverManager.getConnection(url, username, password);
            s = c.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}