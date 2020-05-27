
package cardealership.tables_Classes;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class accounts {
    
    public static String toStringUserData(ResultSet rs){
        
        try {
            
            StringBuilder buffer = new StringBuilder();
            
            while(rs.next()){
                buffer.append("Account_id : ").append(rs.getInt("id"));
                buffer.append(rs.getString("user_name") + " ");
                buffer.append(rs.getDouble(" account_balance" + " "));
            }
            
            return buffer.toString();
            
        } catch (SQLException ex) {
            Logger.getLogger(accounts.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "ERROR IN ACCOUNTS CLASS";
    }
}
