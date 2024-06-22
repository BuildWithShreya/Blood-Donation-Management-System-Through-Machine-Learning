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
public class Fetch_donor_info {
    public ArrayList getData(Statement st,String Adhar)
    {
        ArrayList a1= new ArrayList();
        try
        {
//         Class.forName("com.mysql.jdbc.Driver").newInstance();
//         Connection co=DriverManager.getConnection("jdbc:mysql://localhost:/3306:/blood donation","root","root");
//         
         String query ="select * from donor where Username='"+Adhar+"'";
            ResultSet rs=st.executeQuery(query);
            
            if(rs.next())
            {
                String Name=rs.getString(2);
                String Mobile_no=rs.getString(3);
                String Email=rs.getString(4);
                String Address=rs.getString(5);
                String DOB=rs.getString(6);
                String Age=rs.getString(7);
                String Gender=rs.getString(8);
                String Height=rs.getString(9);
                String Weight=rs.getString(10);
                String blood_group=rs.getString(11);
                String Bmi=rs.getString(12);
                String token=rs.getString(13);
                String token_status=rs.getString(14);
                String date_time=rs.getString(15);
                
                
               a1.add(Adhar);
               a1.add(Name);
               a1.add(Mobile_no);
               a1.add(Email);
               a1.add(Address);
               a1.add(DOB);
               a1.add(Age);
               a1.add(Gender);
               a1.add(Height);
               a1.add(Weight);
               a1.add(blood_group);
               a1.add(Bmi);
               a1.add(token);
               a1.add(token_status);
               a1.add(date_time);
                        
            }
        }
        catch(Exception ex)
        {
              System.out.println("Excpetion Occured"+ex);
        }
                
        return a1;
    }
}
