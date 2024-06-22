/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class checkuser1 {
    public ArrayList checkusername(Statement st)
    {
        ArrayList e=new ArrayList();
        
        try
        {
            String query="Select * from register";
ResultSet x=st.executeQuery(query);
            
            while(x.next())
                {
                    String Username=x.getString(5);
                    e.add(Username);
    
                }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"EXEPTION HERE"+ex);
        }
        System.out.println("AI is:"+e);
        return e;

        
        
    }
}
