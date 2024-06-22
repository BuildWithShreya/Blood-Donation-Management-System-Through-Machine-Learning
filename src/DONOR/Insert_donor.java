/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DONOR;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class Insert_donor {
    public boolean isiner(Statement st,String Adhar,String Gender,String Height,String Weight,String Blood,String Age,String BMI,String Name,String Mobile,String Email,String Address,String Dob,String token,String Tk_status,String D_time,String blood_vol)
    {
        boolean flag=false;
        try
        {
            String query="insert into donor values('"+Adhar+"','"+Name+"','"+Mobile+"','"+Email+"','"+Address+"','"+Dob+"','"+Age+"','"+Gender+"','"+Height+"','"+Weight+"','"+Blood+"','"+BMI+"','"+token+"','"+Tk_status+"','"+D_time+"','"+blood_vol+"')";
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
