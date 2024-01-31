package MedEaseNavigator.MedMenuBar;

import javax.swing.JMenuBar;

import MedEaseNavigator.UtilityModule.GUIUtil;

import javax.swing.JMenu;
import javax.swing.JFrame;

public class MenuBar {
    JMenuBar menubar;
    JMenu AdminLog, DocLog;

    public MenuBar(JFrame medFrame) {
        menubar = new JMenuBar();
        AdminLog = new JMenu("Admin Login ");
        DocLog = new JMenu("Doctor Login");
        AdminLog.setForeground(GUIUtil.WhiteClr);
        DocLog.setForeground(GUIUtil.WhiteClr);
        menubar.add(AdminLog);
        menubar.add(DocLog);
        medFrame.add(menubar);
        menubar.setBounds(0, 0, 1440, 30);
        menubar.setBackground(GUIUtil.Dark_BLue);
        


    }
}
