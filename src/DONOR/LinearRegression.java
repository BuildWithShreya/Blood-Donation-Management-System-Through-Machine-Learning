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
public class LinearRegression {
     
    public static void main(String[] args) {
         String Path= "C:\\blood\\blood_dataset.xls";
        ArrayList data =new Calculate_Linear_Regression_Bllod().getExcelData(Path);

//        data.add(data);
       System.out.println(data);
//        Calculate_Linear_Regression_Bllod tcl=new Calculate_Linear_Regression_Bllod();
//        ArrayList Blood_volume =new Blood_volume();
//         ArrayList BMI =new BMI();
    }
    
}
