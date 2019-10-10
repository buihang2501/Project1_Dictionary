package connection;

import java.sql.*;

public class connectDB {

    public Connection conectDatabase(){
        Connection cnn = null;
        try {
            String url = "jdbc:sqlite:E:\\Hoc tap\\Project1\\Database\\Dictionary.db";
            cnn = DriverManager.getConnection(url);
            //System.out.println("Connect successed!!!");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } /*finally {
            try{
                if(cnn != null){
                    cnn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }*/
        return cnn;
    }

    /*public void selectAll(){
        String sql = "SELECT * FROM tablefirst WHERE name = ?";
        try(Connection cnn = this.conectDatabase();
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql)){
            while (rs.next()){
                System.out.println(rs.getInt("id") + "\t"
                        + rs.getString("name") + "\t"
                        + rs.getString("course") + "\t");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

   public static void main(String[] args){
        connectDB select = new connectDB();
        select.selectAll();
    }*/
}
