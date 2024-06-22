/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DONOR;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class Date_Time {
    
    public String getDate()
    {
        Calendar cla=Calendar.getInstance();
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        String p=dateformat.format(cla.getTime());
        return p;
    }
    
     public String getTime()
    {
        Calendar calendar= new GregorianCalendar();
        String am_pm;
        int hr=calendar.get(Calendar.HOUR);
        int mn=calendar.get(Calendar.MINUTE);
        int sec=calendar.get(Calendar.SECOND);
        if(calendar.get(Calendar.AM_PM)==0)
        {
            am_pm="Am";
        }
        else
        {
            am_pm="Pm";
        }
        
        String gg=hr+":"+mn+":"+sec+":"+am_pm; 
        return gg;
        
        }
    
}
