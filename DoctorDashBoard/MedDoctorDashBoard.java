package MedEaseNavigator.DoctorDashBoard;

import MedEaseNavigator.MedEaseComponent.MedEaseBtn;
import MedEaseNavigator.MedEaseComponent.MedPannel;
import MedEaseNavigator.UtilityModule.GUIUtil;

import javax.swing.JLabel;
public class MedDoctorDashBoard {
    DocDasBoarUtil  docDasBoarUtil =new DocDasBoarUtil();
    MedPannel BackPannel, FrontPannel;
    /*
     * 
     */
    JLabel WelcomLogo;
    /* 
     * Patitent information
     */
    JLabel PaitienTLogo,PID,Name,Number,Age,Gender,BloodGrup,Heigh,Weight,Allergy;
    MedEaseBtn Update,Next,CreateMedicalReport;
    public MedDoctorDashBoard(){
        BackPannel =new MedPannel(GUIUtil.Dark_BLue, GUIUtil.Dark_BLue, null, 0);
        BackPannel.setBounds(0, 100, 1440, 500);
        docDasBoarUtil.DoctorFrame.add(BackPannel);
    }
}
