/*
 *  login interface
 *  
 */
package MedEaseNavigator.LoginModule;
import javax.swing.JFrame;
import javax.swing.JTextField;

import MedEaseNavigator.MedEaseComponent.MedEaseBtn;

public class MedEaseLogin {
    JFrame LoginFrame;
    MedEaseBtn LoginBtn;    // Btn to login
    MedEaseBtn SetupBtn;    //setup Btn
    LoginEventHandeler LogEvent;
    JTextField UserName;
    JTextField Password;
    public MedEaseLogin(){
        LogEvent =new LoginEventHandeler(this);
        /* Design Implemntaion of Login Frame */
    }

}
