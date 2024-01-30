/*
 * GUI for srch bar
 * @Ruddarm
 * 
 */
package MedEaseNavigator.FindPatientModule;

import java.awt.Color;

import javax.swing.BorderFactory;
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

    public FindCustomerUtil(JFrame MedeaseFrame) {
        SrchPannel = new MedPannel(Color.white, Color.white, null, 10);
        // SrchPannel =new();
        SrchPannel.setBounds(100, 50, 600, 45);
        SrchPannel.setLayout(null);
        MedeaseFrame.add(SrchPannel);
        ScrhBtn = new MedEaseBtn(GUIUtil.Dark_BLue, GUIUtil.Dark_BLue, null, 5);
        ScrhBtn.setBounds(440, 5, 150, 35);
        ScrhBtn.setText("Find");
        ScrhBtn.setFont(GUIUtil.TimesBold);
        ScrhBtn.setForeground(GUIUtil.WhiteClr);
        SrchPannel.add(ScrhBtn);
        SrchFeild = new JTextField();
        SrchFeild.setBorder(BorderFactory.createLineBorder(GUIUtil.WhiteClr));
        SrchFeild.setBounds(10, 5, 420, 30);
        SrchPannel.add(SrchFeild);
        SrchFeild.setFont(GUIUtil.TimesBoldS2);
        


    

    }

}
