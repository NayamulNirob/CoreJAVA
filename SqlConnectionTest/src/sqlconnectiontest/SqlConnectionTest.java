package sqlconnectiontest;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utill.DbUtill;

public class SqlConnectionTest {

    static PreparedStatement ps;
    static ResultSet rs;
    static DbUtill db = new DbUtill();

    public static void main(String[] args) {

        saveData();
        showdata();

    }

    public static void saveData() {

        try {

            String insertSql = "insert into employee (name,email,address,cell)"
                    + "values(?,?,?,?)";

            ps = db.getCon().prepareStatement(insertSql);
            ps.setString(1, "Neyamul");
            ps.setString(2, "neyamul@gmail.com");
            ps.setString(3, "Mohammodpur,Dhaka");
            ps.setString(4, "324654135451");

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(SqlConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showdata() {

        String selectSql = "select * from employee";
        try {
            ps = db.getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cell = rs.getString("cell");

                System.out.println("Id is :" + id + " Name is:" + name + " Email is: " + email
                        + " Address is: " + address + " Cell is :" + cell);
            }
            ps.close();
            rs.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    

}
