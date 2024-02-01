package MedEaseNavigator.FindPatientModule;

import java.awt.event.*;
import MedEaseNavigator.AppointMentModule.MedEaseAppointMentInterface;
import MedEaseNavigator.UtilityModule.MedEasePatient;

public class FindPatientEventHandel implements ActionListener {
    FindCustomerUtil findpteint;
    MedEasePatient Patient = new MedEasePatient();
    

    public FindPatientEventHandel(FindCustomerUtil obj) {
        findpteint = obj;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == findpteint.ScrhBtn) {
            String Number = findpteint.SrchFeild.getText();

            new MedEaseAppointMentInterface(Patient);
        } else {


        }

    }

}
