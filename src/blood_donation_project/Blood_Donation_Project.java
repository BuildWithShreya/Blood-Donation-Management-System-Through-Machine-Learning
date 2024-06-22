/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood_donation_project;

import Loading.splasher;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Chavan Shreya Navnath
 */
public class Blood_Donation_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       splasher ob=new splasher();
//       ob.setVisible(true);
//     ob.setSize(1040, 590); 
//        ob.doLayout();
//        
//        for(int i =0;i<=100;i++)
//        {
//            try
//            {
//                Thread.sleep(100);
//                ob.Loading.setText(i+"%");
//            if(i==10)
//            {
//                ob.LoadCompleted.setText("Turning on Modules.....");
//            }
//            else if(i==30)
//            {
//                ob.LoadCompleted.setText("Loading   Modules......");
//            }
//           else if(i==50)
//            {
//                ob.LoadCompleted.setText("Connecting to Databases.....");
//            }
//           else  if(i==70)
//            {
//                ob.LoadCompleted.setText("Connection Success..........");
//            }
//           else if(i==80)
//            {
//                ob.LoadCompleted.setText("Sever Fetching...... ");
//            }
//           else if(i==92)
//            {
//                ob.LoadCompleted.setText("Launching Application............");
//            }
//           ob.ProgressBar.setValue(i);
//       
//            }
//            catch( Exception e)
//            {
//                JOptionPane.showMessageDialog(null,e);
//            }
//        }
//      
        MainFrame1 l=new MainFrame1();
        Dimension ob =Toolkit.getDefaultToolkit().getScreenSize();
        l.setVisible(true);
        l.setSize(ob);

    }
    
}
