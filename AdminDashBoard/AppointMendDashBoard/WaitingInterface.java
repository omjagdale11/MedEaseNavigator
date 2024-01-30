/*
 * 
 */
package MedEaseNavigator.AdminDashBoard.AppointMendDashBoard;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import MedEaseNavigator.MedEaseComponent.MedPannel;

public class WaitingInterface {
    MedPannel BackPannel;
    MedPannel FrontPannel;
    JLabel  WaitingLable;
    JScrollPane jsp;
    JTable WattingTable;
    DefaultTableModel Dtm;
    String TableHead[]={
        "PID", "Name", "Number","Status", "Time Slot"
    };
    WaitingInterface(JFrame MedFrame){
        
    }

}
