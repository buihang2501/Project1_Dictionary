package connection;

import java.sql.*;

public class connectDB {
    // Tạo connection tới database
    public Connection conectDatabase() {
        Connection cnn = null;
        try {
            String url = "jdbc:sqlite:database//Dictionary.db";
            cnn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cnn;
    }
}

