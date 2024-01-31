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
<<<<<<< HEAD
        app.MedEaseUtil.DbConnectObj = new DBConnectivity("jdbc:mysql://localhost:3306/", "Serene@123#",
                app.MedEaseUtil.DBCon);
=======
        app.MedEaseUtil.DbConnectObj = new DBConnectivity("jdbc:mysql://localhost:3306/", "ashroot", app.MedEaseUtil.DBCon);
>>>>>>> cf15fe229a44e7ee4bf6f1c20a432636db11fdee
        // If true then connection Sucesfull
        if (!app.MedEaseUtil.DbConnectObj.setConnection()) {
            app.MedEaseUtil.Notify.setMsg("Bhai DataBase connect Nhi ho raha hai ", -1);
        }
        // if True then DataBase MedEaseNavigator already exist or created
        if (!app.MedEaseUtil.DbConnectObj.CreateDB("MedEaseNavigator")) {
            app.MedEaseUtil.Notify.setMsg("Bhai DB nhi create hua ", -1);
        }
        // Creating Tables in Database if not exist
<<<<<<< HEAD
=======
        // Login Moudle
        // App main screen
        app.MedEaseUtil.SetMainFrame();
        
>>>>>>> cf15fe229a44e7ee4bf6f1c20a432636db11fdee

    }
}
