/*
 *  login interface
 *  
 */
package MedEaseNavigator.LoginModule;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import MedEaseNavigator.MedEaseComponent.MedEaseBtn;
import MedEaseNavigator.MedEaseComponent.MedPannel;
import MedEaseNavigator.UtilityModule.GUIUtil;

public class MedEaseLogin {
    JFrame LoginFrame;
    MedEaseBtn LoginBtn;    // Btn to login
    MedEaseBtn SetupBtn;    //setup Btn
    LoginEventHandeler LogEvent;
    MedPannel UserDetailsPannel;
    JLabel UsernameLabel,UserPasswordLabel;
    JLabel MedEaselabel, NavigatorLabel;
    JTextField UserName;
    JTextField Password;
    public MedEaseLogin(){
        LogEvent =new LoginEventHandeler(this);
        /* Design Implemntaion of Login Frame */
        LoginFrame =new JFrame();
        LoginFrame.setBounds(200, 200, 600, 300);
        LoginFrame.setVisible(true);
        LoginFrame.setLayout(null);
        LoginFrame.setResizable(false);
        LoginFrame.getContentPane().setBackground(GUIUtil.Dark_BLue);
        LoginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        UserDetailsPannel =new MedPannel(GUIUtil.WhiteClr, GUIUtil.WhiteClr, null, 0);
        UserDetailsPannel.setBounds(300, 0, 300, 300);
        UserDetailsPannel.setLayout(null);
        LoginFrame.add(UserDetailsPannel);  
        MedEaselabel =new JLabel("MedEase");
        MedEaselabel.setForeground(GUIUtil.WhiteClr);
        MedEaselabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
        MedEaselabel.setBounds(70, 80, 200, 30);
        LoginFrame.add(MedEaselabel);
        NavigatorLabel =new JLabel("Navigator");
        NavigatorLabel.setForeground(GUIUtil.WhiteClr);
        NavigatorLabel.setBounds(80, 130, 200, 40);
        NavigatorLabel.setFont(new Font("Times New Roman", Font.CENTER_BASELINE,30));
        LoginFrame.add(NavigatorLabel);



    }

}
