/*
 * @author Ruddarm
 */
package MedEaseNavigator.AppointMentModule;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import MedEaseNavigator.MedEaseComponent.MedEaseBtn;
import MedEaseNavigator.MedEaseComponent.MedPannel;
import MedEaseNavigator.UtilityModule.AppointMent;
import MedEaseNavigator.UtilityModule.GUIUtil;

public class MedEaseAppointMentInterface {
    /*
     * 
     * 
     */
    JDialog PatientBox;
    MedPannel logoBox, InfoBox;
    JLabel Plogo, PID, Name, Number;
    MedEaseBtn AppointmentBtn, ViewBtn;

    public MedEaseAppointMentInterface() {
        PatientBox = new JDialog();
        PatientBox.setBounds(100, 50, 600, 250);
        PatientBox.setVisible(true);
        PatientBox.getContentPane().setBackground(GUIUtil.Base_Background);
        PatientBox.setLayout(null);
        logoBox = new MedPannel(GUIUtil.WhiteClr, GUIUtil.WhiteClr, null, 10);
        logoBox.setBounds(20, 20, 130, 130);
        PatientBox.add(logoBox);
        /*
         * 
         */
        Plogo = new JLabel();
        Plogo.setText("This is profile");
        Plogo.setBackground(GUIUtil.Dark_BLue);
        logoBox.add(Plogo);
        Plogo.setBounds(0, 0, 130, 130);
        Plogo.setBorder(BorderFactory.createLineBorder(Color.black));
        /*
         * 
         */
        InfoBox =new MedPannel(GUIUtil.WhiteClr, GUIUtil.WhiteClr   , null, 10);
        InfoBox.setBounds(170, 20, 400, 130);
        InfoBox.setLayout(null);
        PatientBox.add(InfoBox);

        AppointmentBtn = new MedEaseBtn(GUIUtil.Dark_BLue, GUIUtil.Dark_BLue, null, 10);
        AppointmentBtn.setText("Book Appointment");
        AppointmentBtn.setForeground(GUIUtil.WhiteClr);
        AppointmentBtn.setFont(GUIUtil.TimesBold);
        AppointmentBtn.setBounds(435, 160, 130, 40);

        PatientBox.add(AppointmentBtn);
        


    }
}
