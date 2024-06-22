/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DONOR;

import dbdriver.Dbconnection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class View_donor_class
{
   public void  getViewDonorDetails()
    {
      String token_status="TOKEN GIVEN";
            try
                 { 
                     Statement st1=new Dbconnection().getConnection(); 
                     Statement st2=new Dbconnection().getConnection();
                     
                     String Query="Select * from Donor where token_status='"+token_status+"'";
                     ResultSet rs1=st1.executeQuery(Query);
                     ResultSet rs2=st2.executeQuery(Query);
                     
                     int row=0;
                     
                     while(rs1.next())
                     {
                         row++;
                     }
                     
                     int i=0;
                     String data[][]=new String [row][3];
                     
                     while(rs2.next())
                     {
                         String adhar=rs2.getString(1);
                         data[i][0]=adhar;
                         String Name=rs2.getString(2);
                         data[i][1]=Name;
                         String T_status=rs2.getString(14);
                         data[i][2]=T_status;
                         i++;
                     }
                     View_details.data=data;
                 }
                         catch(Exception ex)
                 {
                     System.out.println("Exception occured"+ex);
                 }
  
}
}
