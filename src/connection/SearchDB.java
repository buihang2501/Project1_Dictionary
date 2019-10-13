package connection;

import javafx.beans.property.StringProperty;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class SearchDB {

    //Tìm kiếm nghĩa của từ Tiếng Anh nhập vào
    public String Translated(String english) throws SQLException {
        connectDB cnn1 = new connectDB();
        String searchSql = "SELECT vietnamese, type FROM Translate WHERE english = ?";
        Connection cnn = cnn1.connectDatabase();
        PreparedStatement prs = cnn.prepareStatement(searchSql);
        try{
            prs.setString(1, english.trim());
            ResultSet rst = prs.executeQuery();
            String test = rst.getString("vietnamese");

            //trả về kết quả
            String result = new String();
            while (rst.next()){
                String rstVietnamese = rst.getString("vietnamese");
                String rstType = rst.getString("type");
                result += "*" +rstType +"\n \t" + rstVietnamese + "\n";
            }
            return result;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return "UNKNOWN!!!";
        }
    }
}
