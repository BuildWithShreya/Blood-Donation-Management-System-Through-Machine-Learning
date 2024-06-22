/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class Registration {
    public boolean isiner(Statement st,String Name,String Email,String Password,String Username,String Address,String Mobile_no)
    {
        boolean flag=true;
        try
        {
            String query="insert into register values('"+Name+"','"+Email+"','"+Password+"','"+Username+"','"+Address+"','"+Mobile_no+"')";
int x=st.executeUpdate(query);
            
            if(x>0)
                {
                    flag=true;
    
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
