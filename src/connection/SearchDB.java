package connection;

import javafx.beans.property.StringProperty;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class SearchDB {
    public String SearchDB(String english){
        connectDB cnn1 = new connectDB();
        String searchSql = "SELECT vietnamese FROM Translate WHERE english_Word = ?";
        try(Connection cnn = cnn1.conectDatabase();
            PreparedStatement prs = cnn.prepareStatement(searchSql)) {
            prs.setString(1, english);
            ResultSet rst = prs.executeQuery();
            return rst.getString("vietnamese");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return "UNKNOWN!!!";
        }
    }
}
