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
public class Donor_Update_details {
     public boolean isUpdate(Statement st,String Adhar)
    {
    boolean flag=false;
    String Token_Status="DONATED BLOOD";
    try
    {
//    Adhar, Name, Mobile, Email, Address, DOB, Age, Gender, Height, Weight, BloodG, BMI, Token, Token_Status, Date_Time, Blood_volume
     
        String q = "UPDATE donor SET Token_status='" + Token_Status + "' WHERE Adhar='" + Adhar + "'";

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
