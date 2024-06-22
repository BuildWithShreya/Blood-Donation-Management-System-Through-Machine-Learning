/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DONOR;

import java.util.Random;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class RandomGenerator {
    
    public String getCode(int low,int high)
    {
        Random r=new Random();
        
        int result=r.nextInt(high-low)+low;
        String Res=Integer.toString(result);
        
        return (Res);
    }
}
