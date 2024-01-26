// A login event will hande herer
/*
 * @author ruddarm
 * 
 */

package MedEaseNavigator.LoginModule;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

public class LoginEventHandeler  extends KeyAdapter implements ActionListener{
    MedEaseLogin logobj;
    public LoginEventHandeler(){

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==logobj.LoginBtn){
            
        }
    }
    
}
