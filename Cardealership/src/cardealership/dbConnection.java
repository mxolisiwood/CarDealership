
package cardealership;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import cardealership.tables_Classes.accounts;

public class dbConnection {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN = "jdbc:mysql://localhost/cardealership";
    
  
    
    public static Connection getConnection() {
       Connection cnn = null;
       try {
           cnn =  DriverManager.getConnection(CONN, USERNAME, PASSWORD);
           JOptionPane.showMessageDialog(null,"Connected");
           return cnn;
       } catch (SQLException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
           JOptionPane.showMessageDialog(null,"Not Connected");
           return null;
       
       }
    }
     
    public String getFirst(){
        ResultSet result;
        try(
              Connection con = getConnection();
              Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
              ResultSet rs = stmt.executeQuery("SELECT * FROM accounts");
                ){
          return accounts.getUserData(rs);
        }catch(SQLException e){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,e);
        }
          return "ERROR IN DBCLASS";
    }
}
