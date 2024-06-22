/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DONOR;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class Donor_Data_fetcher 
{
    public ArrayList getDonordata(Statement st,String adharno)
    {
        ArrayList data=new ArrayList();
        try
        {
            String Q="Select *from donor Where Adhar='"+adharno+"'";
            ResultSet rs=st.executeQuery(Q);
            if(rs.next())
            {
//                Adhar, Name, Mobile, Email, Address, DOB, Age, Gender, Height, Weight, BloodG, BMI, Token, Token_Status, Date_Time, Blood_volume
                String Name=rs.getString(2);
                String Mobile=rs.getString(3);
                String Email=rs.getString(4);
                String Address=rs.getString(5);
                String DOB=rs.getString(6);
                String Age=rs.getString(7);
                String Gender=rs.getString(8);
                String Height=rs.getString(9);
                String Weight=rs.getString(10);
                String BloodG=rs.getString(11);
                
                data.add(Name);
                data.add(Mobile);
                data.add(Email);
                data.add(Address);
                data.add(DOB);
                data.add(Age);
                data.add(Gender);
                data.add(Weight);
                data.add(Height);
                data.add(BloodG);
               
                
                
            }
            System.out.println("Data is : "+data);
        }
        catch(Exception ex)
        {
            System.out.println("Exception is : "+ ex);
        }
        return data;
    }
    
}
