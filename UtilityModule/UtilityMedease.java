/* Utilities we may required through out project  
 * @author Ruddarm
 * 
*/
package MedEaseNavigator.UtilityModule;

import java.sql.Connection;

import javax.swing.JFrame;

public class UtilityMedease {
    JFrame MedEaseFrmae; // Main Window Frame
    Connection DBCon; // Database Connection

    public UtilityMedease(){
        MedEaseFrmae=new JFrame("MeadEas Navigator");
        MedEaseFrmae.setSize(1920, 1220);
        MedEaseFrmae.getContentPane().setBackground(GUIUtil.Base_Background);
        MedEaseFrmae.setVisible(true);
        MedEaseFrmae.setLayout(null);
        
    }
}
