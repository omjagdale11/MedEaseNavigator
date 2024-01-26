/* Utilities we may required through out project  
 * @author Ruddarm
 * 
*/
package MedEaseNavigator.UtilityModule;

import java.sql.Connection;

import javax.swing.JFrame;


import MedEaseNavigator.DataBaseModule.DBConnectivity;
import MedEaseNavigator.NotificationMoudle.MedEaseNotify;

public class UtilityMedease {
    public JFrame MedEaseFrmae; // Main Window Frame
    public Connection DBCon; // Database Connection
    public DBConnectivity DbConnectObj; // object to create Database and estabhlish connection with database
    public MedEaseNotify Notify;

    public UtilityMedease() {
        Notify = new MedEaseNotify();

    }

    public  void SetMainFrame(){
        MedEaseFrmae = new JFrame("MeadEas Navigator");
        MedEaseFrmae.setSize(1920, 1220);
        MedEaseFrmae.getContentPane().setBackground(GUIUtil.Base_Background);
        MedEaseFrmae.setVisible(true);
        MedEaseFrmae.setLayout(null);
        MedEaseFrmae.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
