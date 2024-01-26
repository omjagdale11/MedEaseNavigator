/* Notification moudle will use to show error or message 
 * @author Ruddarm
 * 
 */
package MedEaseNavigator.NotificationMoudle;

import javax.swing.JDialog;
import javax.swing.JLabel;

import MedEaseNavigator.UtilityModule.GUIUtil;

public class MedEaseNotify {
    JDialog NotifyBox;
    JLabel errorMsg;

    // Constructor to Create Notification pannel
    public MedEaseNotify() {
        NotifyBox = new JDialog();
        NotifyBox.setLayout(null);
        NotifyBox.setBounds(500, 200, 400, 200);
        // NotifyBox.getContentPane().setBackground(GUIUtil.Base_Background);
        errorMsg = new JLabel();
        errorMsg.setBounds(50, 60, 250, 30);
        NotifyBox.add(errorMsg);
        NotifyBox.setVisible(false);
    }

    // Set message for notification
    /*
     * @param msg A message to print in notification box
     * 
     * @param val value indicate type of msg -1 for error 0 for succesfull
     */
    public void setMsg(String msg, int val) {
        NotifyBox.setVisible(true);
        if (val == -1) {
            errorMsg.setForeground(GUIUtil.WarningColor);
            errorMsg.setText(msg);
            errorMsg.setFont(GUIUtil.TimesItalic);
            NotifyBox.setVisible(true);
        }
    }
}
