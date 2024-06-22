/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DONOR;

import java.util.ArrayList;

/**
 *
 * @author Chavan Shreya Navnath
 */
class TocalculateLinearRegression {
  public ArrayList getBMI_B(ArrayList data)
    {
        ArrayList<Double> BMI = new ArrayList <Double>();
       
        for(int i =0;i<data.size();i++)
        {
            ArrayList Row = (ArrayList)data.get(i);
        String bmil=(String)Row.get(0);
        double bmi=Double.parseDouble(bmil);
        
        BMI.add(bmi);
        }
         return BMI;
    }

public ArrayList getBlood_V(ArrayList data)
    {
       ArrayList<Integer> Blood_v = new <Integer> ArrayList();
       
        for(int i =0;i<data.size();i++)
        {
            ArrayList col = (ArrayList)data.get(i);
        String blood =(String)col.get(1);
        int B_V=Integer.parseInt(blood);
        
        Blood_v.add(B_V);
        }
         return Blood_v;
    }
    
  
}
