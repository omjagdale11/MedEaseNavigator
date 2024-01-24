/* This is Our Main Class from where our software will start it is like engine of our software
 * @author Ruddarm
 * @author
 * .
 * .
 * 
 */
package MedEaseNavigator.DriverPackage;

import MedEaseNavigator.UtilityModule.UtilityMedease;

public class MedEaseApp {
    UtilityMedease MedEaseUtil;
    
    MedEaseApp(){
        MedEaseUtil = new UtilityMedease();

    }
    
    public static void main(String[] args) {
        MedEaseApp app=new MedEaseApp();
        

    }
}
