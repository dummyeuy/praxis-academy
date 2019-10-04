package latihan.endpoint;

import io.micronaut.context.annotation.Property;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class Database {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mariadb://localhost/companies", "root", "root");
    }
}

