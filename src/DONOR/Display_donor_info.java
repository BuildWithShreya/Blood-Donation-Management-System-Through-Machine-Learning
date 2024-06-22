/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DONOR;

import java.sql.Statement;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class Display_donor_info {
     public boolean isUpdate(Statement st,String Adhar,String Name,String Mobile_no,String Email,String Address,String DOB ,String Age,String Gender,String Height,String Weight,String Blood_G,String BMI,String Token,String Token_status,String Date_Time)
    {
    boolean flag=false;
    try
    {
    
        String q="Update donor set Name='"+Name+",'Mobile_no='"+Mobile_no+"',Email='"+Email+"',Address='"+Address+"',DOB='"+DOB+"',Age='"+Age+"',Gender='"+Gender+"',Height='"+Height+"',Weight='"+Weight+"',Blood_G='"+Blood_G+"',BMI='"+BMI+"',Token='"+Token+"',Token_status='"+Token_status+"',Date_Time='"+Date_Time+"' where Adhar='"+Adhar+"'";
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
