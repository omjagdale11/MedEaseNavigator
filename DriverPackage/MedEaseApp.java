/* This is Our Main Class from where our software will start it is like engine of our software
 * @author Ruddarm
 * @author
 * .
 * .
 * 
 */
package MedEaseNavigator.DriverPackage;

import MedEaseNavigator.DataBaseModule.DBConnectivity;
import MedEaseNavigator.UtilityModule.UtilityMedease;

public class MedEaseApp {
    UtilityMedease MedEaseUtil;

    public MedEaseApp() {
        MedEaseUtil = new UtilityMedease();
    }

    public static void main(String[] args) {
        MedEaseApp app = new MedEaseApp();
        /*
         * First we will setup connection with database
         */
        // Creating object of DBconnectivity
        app.MedEaseUtil.DbConnectObj = new DBConnectivity("UserName", "pswd", app.MedEaseUtil.DBCon);
        // If true then connection Sucesfull
        if (!app.MedEaseUtil.DbConnectObj.setConnection()) {
            System.out.println("Code is here");
            app.MedEaseUtil.Notify.setMsg("Bhai error hogya ", -1);
        }

    }
}
