/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class Login {
    public boolean isiner(Statement st,String Password,String Username)
    {
        boolean flag=true;
        try
        {
            String query="Select * from register where Username='"+Username+"'and Password='"+Password+"'";
      ResultSet x=st.executeQuery(query);
            
            if(x.next())
                {
                   flag =true;
    
                }
            else
            {
                flag=false;
            }
            
                    
           
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"EXEPTION HERE"+ex);
        }

        
        return flag;
    }
    
}
