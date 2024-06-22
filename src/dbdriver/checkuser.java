/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

//import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class checkuser {
    public boolean checkusername(Statement st,String Username)
    {
        boolean flag=false;
        
        try
        {
            String query="Select * from register where Username='"+Username+"'";
            ResultSet x=st.executeQuery(query);
            
            if(x.next())
                {
                    flag=true;
                }
          
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"EXEPTION HERE"+ex);
        }
//        System.out.println("AI is:"+e);
        return flag;

        
        
    }
}
