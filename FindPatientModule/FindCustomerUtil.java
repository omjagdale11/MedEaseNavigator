/*
 * GUI for srch bar
 * @Ruddarm
 * 
 */
package MedEaseNavigator.FindPatientModule;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import MedEaseNavigator.MedEaseComponent.MedEaseBtn;
import MedEaseNavigator.MedEaseComponent.MedPannel;
import MedEaseNavigator.UtilityModule.GUIUtil;
/*
 * 
 */
public class FindCustomerUtil {
    MedPannel SrchPannel;
    JTextField SrchFeild;
    MedEaseBtn ScrhBtn;


    public FindCustomerUtil(JFrame MedeaseFrame){
        SrchPannel = new MedPannel(Color.white, Color.white, null, 10);
        // SrchPannel =new();
        SrchPannel.setBounds(100, 50, 600, 40);
        MedeaseFrame.add(SrchPannel);
        ScrhBtn =new MedEaseBtn(GUIUtil.Dark_Backgourng, GUIUtil.WhiteClr, null, 20);
        ScrhBtn.setBounds(550, 5, 150, 30);
        ScrhBtn.setText("Find");
        SrchPannel.add(ScrhBtn);
        
    }
    
    
    
}
