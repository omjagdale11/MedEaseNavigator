/* Utilities we may required through out project  
 * @author Ruddarm
 * 
*/
package MedEaseNavigator.UtilityModule;

import java.sql.Connection;

import javax.swing.JFrame;


import MedEaseNavigator.DataBaseModule.DBConnectivity;
import MedEaseNavigator.DataBaseModule.DBOperation;
import MedEaseNavigator.NotificationMoudle.MedEaseNotify;

public class UtilityMedease {
    public JFrame MedEaseFrmae; // Main Window Frame
    public Connection DBCon; // Database Connection
    public DBConnectivity DbConnectObj; // object to create Database and estabhlish connection with database
    public MedEaseNotify Notify;
    public DBOperation DBO;

    public UtilityMedease() {
        Notify = new MedEaseNotify();

    }

    public  void SetMainFrame(){
        MedEaseFrmae = new JFrame("MeadEas Navigator");
        MedEaseFrmae.setSize(1920, 1020);
        MedEaseFrmae.getContentPane().setBackground(GUIUtil.Base_Background);
        MedEaseFrmae.setVisible(true);
        MedEaseFrmae.setLayout(null);
        MedEaseFrmae.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    /*
     * this method will chech weather givn number is valid contact number or not
     * @param Number  A string of Number
     * @return   boolean     true if String length =10 and String char== 0 to 9;
     * 
     */
    public boolean isValidNumber(String Number){
        
        return false;
    }
    /*
     * A Method to count Character in String 
     * @param String    A set of character array
     * @return int      Number of character in given String
     */
    
}

