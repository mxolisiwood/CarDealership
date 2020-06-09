
package cardealership;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dbConnection {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN = "jdbc:mysql://localhost/cardealership";
    
    public static boolean CompareUserData(String username, String password){
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM account WHERE user_name = '" + username + "'");
            
            while(rs.next()){
                if(rs.getString("user_name").equals(username) && rs.getString("password").equals(password)){
                    return true;
                }
            }
    
        
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static Connection getConnection() {
       Connection cnn = null;
       try {
           cnn =  DriverManager.getConnection(CONN, USERNAME, PASSWORD);
           return cnn;
       } catch (SQLException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
           JOptionPane.showMessageDialog(null,"Not Connected");
           return null;
       
       }
    }
     
    public static String executeUserdata(){
        try(
              Connection con = getConnection();
              Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
              ResultSet rs = stmt.executeQuery("SELECT * FROM account");
                ){
          return toStringUserData(rs);
        }catch(SQLException e){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,e);
        }
          return "ERROR IN DBCLASS";
    }
    
    public static String toStringUserData(ResultSet rs){
        
        try {
            
            StringBuilder buffer = new StringBuilder();
            
            while(rs.next()){
                buffer.append("Account_id : ").append(rs.getInt("id") + "\n");
                buffer.append("User name : ").append(rs.getString("user_name") + " \n");
                buffer.append("Account Balance : ").append(rs.getDouble("account_balance") + "\n");
            }
            
            return buffer.toString();
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "ERROR IN ACCOUNTS CLASS";
    }
    
    public static String getBalance(String username){
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT account_balance FROM account WHERE user_name = '" +username+"'");
            if(rs.next()){
                return Double.toString(rs.getDouble("account_balance"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     return "ERROR IN getBalance";   
    }
    
    public static String getAccountid(String username){
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT id FROM account WHERE user_name = '" +username+"'");
            if(rs.next()){
                return  Integer.toString(rs.getInt("id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     return "ERROR IN getAccountid";
    }
    
    public static String InsertCar(String username, String Brand, String Model, String Numberplate, double price, double wieght, int noofpass, int topspeed){
        try {
            Connection con = getConnection();
            
            String sql = "INSERT INTO cars (number_plate, model, brand, price, account_id, topspeed, num_passengers, weight) "
                    + "VALUES (?,?,?,?,?,?,?,?)";
            String sql1 = "UPDATE account set account_balance = account_balace - " + price;
            
            PreparedStatement stmt = con.prepareStatement(sql);
            PreparedStatement stmt1 = con.prepareStatement(sql1);
            stmt.setString(1, Numberplate);
            stmt.setString(2, Model);
            stmt.setString(3, Brand);
            stmt.setDouble(4, price);
            stmt.setInt(5, Integer.parseInt(getAccountid(username)));
            stmt.setInt(6, topspeed);
            stmt.setInt(7, noofpass);
            stmt.setDouble(8, wieght);
            
            int rowsinserted = stmt.executeUpdate();
            int rowsupdated = stmt1.executeUpdate();
            
            if(rowsinserted > 0){
                if(rowsupdated > 0){
                    return "Balance updated, car bought";
                }
                return "Inserted values";
            }
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "ERROR IN INSERTING CAR";
    }
}
