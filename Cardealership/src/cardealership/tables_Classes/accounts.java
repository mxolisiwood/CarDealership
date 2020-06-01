
package cardealership.tables_Classes;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class accounts {
    
    public static String[] getUsernameAndPassword(ResultSet rs, String username){
        try {
              while(rs.next()){
                  
                  String [] result = null;
                  
                  if(rs.getString("user_name") == username){
                      result[0] = rs.getString("user_name");
                      result[1]= rs.getString("password");
                      return result;
                  } else {
                      result[0] = "NoUser";
                      return result;
                  }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(accounts.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
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
            Logger.getLogger(accounts.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "ERROR IN ACCOUNTS CLASS";
    }
}
