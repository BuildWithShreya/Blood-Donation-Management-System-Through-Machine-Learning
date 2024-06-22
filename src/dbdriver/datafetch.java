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
public class datafetch {
    public ArrayList getData(Statement st,String Username)
    {
        ArrayList a1= new ArrayList();
        try
        {
//         Class.forName("com.mysql.jdbc.Driver").newInstance();
//         Connection co=DriverManager.getConnection("jdbc:mysql://localhost:/3306:/blood donation","root","root");
//         
         String query ="select * from register where Username='"+Username+"'";
            ResultSet rs=st.executeQuery(query);
            
            if(rs.next())
            {
                String Name=rs.getString(1);
                String Email=rs.getString(2);
                String Mobile_no=rs.getString(3);
                String Address=rs.getString(4);
                String Password=rs.getString(6);
                
                a1.add(Name);
                a1.add(Email);
                a1.add(Mobile_no);
                a1.add(Address);
//                a1.add(Username);
                a1.add(Password);             
            }
        }
        catch(Exception ex)
        {
              System.out.println("Excpetion Occured"+ex);
        }
                
        return a1;
    }
}
