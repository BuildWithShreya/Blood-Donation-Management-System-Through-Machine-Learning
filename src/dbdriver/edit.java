/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class edit {
    public boolean isUpdate(Statement st,String Name,String Email,String Mobile_no,String Address,String Username,String Password)
    {
    boolean flag=false;
    try
    {
    
        String q="Update register set Name='"+Name+"',Email='"+Email+"',Mobile_no='"+Mobile_no+"',Address='"+Address+"',Password='"+Password+"' where Username='"+Username+"'";
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
