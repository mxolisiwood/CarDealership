
package cardealership;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


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
    
}
