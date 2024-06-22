///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package dbdriver;





import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class Dbconnection {
    public Statement getConnection()
    {
        Statement st=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection CT=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood donation","root","Shreya@1305");
        st= CT.createStatement();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"EXEPTION HERE"+ex);
        }

        
        return st;
    }
}
