package MedEaseNavigator.FindPatientModule;
import java.awt.event.*;

import MedEaseNavigator.AppointMentModule.MedEaseAppointMentInterface;
import MedEaseNavigator.DriverPackage.MedEaseApp;;

public class FindPatientEventHandel implements ActionListener{
    FindCustomerUtil findpteint;

    public FindPatientEventHandel(FindCustomerUtil obj){
        findpteint = obj;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==findpteint.ScrhBtn)
        {
            new MedEaseAppointMentInterface();
        }
        
    }
    
}
