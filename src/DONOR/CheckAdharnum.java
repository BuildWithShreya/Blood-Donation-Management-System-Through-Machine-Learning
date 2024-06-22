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
public class CheckAdharnum {
    public boolean getAdhar(Statement st,String Adhar)
    { 
        boolean flag=false;
    try
    {
          String Q="select * from donor where Adhar='"+Adhar+"'";
          ResultSet X=st.executeQuery(Q);
          if(X.next())
          {
              flag=true;
          }
          
    }
    catch(Exception ex)
    {
        System.out.println("EXCPETION :"+ex);
    }
      return flag;
    }
}
