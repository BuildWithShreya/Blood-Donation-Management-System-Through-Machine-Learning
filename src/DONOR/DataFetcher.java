
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DONOR;

/**
 *
 * @author Chavan Shreya Navnath
 */

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class DataFetcher {
    
   public ArrayList<String> getLastDate(Statement st, String adharno) {
        ArrayList<String> dates = new ArrayList<>();
        try {
            ResultSet rs = st.executeQuery("SELECT * FROM Donor WHERE Adhar = '" + adharno + "'");
            while (rs.next()) {
                String dateTime = rs.getString("date_time"); // Assuming column name is "date_time"
                String[] str = dateTime.split(",");
                String date = str[0];
                dates.add(date);
            }
            System.out.println("Dates: " + dates);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
        return dates;
    }
}
