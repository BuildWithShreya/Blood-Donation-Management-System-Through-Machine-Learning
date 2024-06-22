/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.Statement;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class forget_1 {
    public boolean isUpdate(Statement st,String Password,String Username)
    {
    boolean flag=false;
    try
    {
    
        String q="Update register set Password='"+Password+"' where Username='"+Username+"'";
        int x=st.executeUpdate(q);
        if (x>0)
         flag=true;
    }
    catch(Exception ex)
    {
    System.out.println("Exception while updating data"+ex);
    }
    return flag;
    }
}
