/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DONOR;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class Date_diff {
     public long getDateDiff(ArrayList datelist, String cd)
    {
        long small=10000;
        try
        {
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
            Date currentdate=sdf.parse(cd);
            
            for(int i=0;i<datelist.size();i++)
            {
                String temp=(String)datelist.get(i);
                Date tempdate=sdf.parse(temp);
                long timediff=Math.abs(currentdate.getTime()- tempdate.getTime());
                long daysdiff=TimeUnit.DAYS.convert(timediff, TimeUnit.MILLISECONDS);
                
                if(daysdiff<small)
                small=daysdiff;
                System.out.println(temp+" -- "+daysdiff);
                
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception is : "+ex);
        }
        return small ;
        
    }
}
