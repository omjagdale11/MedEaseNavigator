/* This is Our Main Class from where our software will start it is like engine of our software :()
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
        app.MedEaseUtil.DbConnectObj = new DBConnectivity("jdbc:mysql://localhost:3306/", "Serene@123#",
                app.MedEaseUtil.DBCon);
        // If true then connection Sucesfull
        if (!app.MedEaseUtil.DbConnectObj.setConnection()) {
            app.MedEaseUtil.Notify.setMsg("Bhai DataBase connect Nhi ho raha hai ", -1);
        }
        // if True then DataBase MedEaseNavigator already exist or created
        if (!app.MedEaseUtil.DbConnectObj.CreateDB("MedEaseNavigator")) {
            app.MedEaseUtil.Notify.setMsg("Bhai DB nhi create hua ", -1);
        }
        // Creating Tables in Database if not exist

    }
}
