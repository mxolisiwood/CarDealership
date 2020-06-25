
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
    
    public static String InsertCar(String username, String Brand, String Model, String Numberplate, double price, double wieght, int noofpass, int topspeed, String Condition, String FuelType, String Image) {
        try {
            Connection con = getConnection();
            
            String sql = "INSERT INTO cars (number_plate, model, brand, price, account_id, topspeed, num_passengers, weight,Car_Condition, FuelType, Image) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            
            String sql1 = "UPDATE account set account_balance = account_balance - " + price;
            
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
            stmt.setString(9, Condition);
            stmt.setString(10, FuelType);
            stmt.setString(11, Image);
            
            
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
    
    public static boolean isCarAvailable(String NumberPlate){
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT number_plate FROM cars");
            while(rs.next()){
                if(rs.getString("number_plate").equals(NumberPlate)){
                    return true; 
                }
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;
    }
    
    public static double getPrice(String NumberPlate){
        try {
            Connection con = getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT price FROM cars WHERE number_plate = " + "'" +NumberPlate + "'");
            if(rs.next()){
                return rs.getDouble("price");
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return 0;
    }
    
    public static String SellCar(String numberplate, String username){
        Connection con = getConnection();
        double price = getPrice(numberplate);
        if(price == 0){
            return "getPrice Error";
        }
        
        String sql = "DELETE FROM cars WHERE number_plate = ?";
        String sql1 = "UPDATE account SET account_balance = ? + account_balance WHERE user_name = ?";
        
        PreparedStatement stmt; 
        PreparedStatement stmt1;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, numberplate);
            
            stmt1 = con.prepareStatement(sql1);
            stmt1.setDouble(1, price);
            stmt1.setString(2, username);
            
            int rowsdeleted = stmt.executeUpdate();
            int rowsUpdated = stmt1.executeUpdate();
            
            if(rowsdeleted > 0){
                if(rowsUpdated > 0){
                    return "Car sold, Balance updated";
                }
                return "Car sold";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return "ERROR IN SELL CAR";
    }
}
