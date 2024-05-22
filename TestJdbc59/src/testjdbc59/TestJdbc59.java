
package testjdbc59;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestJdbc59 {

    public static void main(String[] args)  {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "2020");
            PreparedStatement ps =connection.prepareStatement("select * from TestJdbc59.student");
            ResultSet rs =ps.executeQuery();
            while (rs.next()) {                
                System.out.println(rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("email")+ " "+rs.getString("Address"));
//                    
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestJdbc59.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
