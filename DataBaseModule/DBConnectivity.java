/*
 * In this class we will have all operation such as DB connectivty, adn DB and Table  creation 
 * 
 */
package MedEaseNavigator.DataBaseModule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JDialog;

public class DBConnectivity {
    String UserName;
    String Password;
    Connection DBCon;
    Statement SqlStaement;
    JDialog Notification;

    public DBConnectivity(String UserName, String Password, Connection DBCon) {
        this.UserName = UserName;
        this.Password = Password;
        this.DBCon = DBCon;

    }

    // Set connection with Mysql
    public boolean setConnection() {
        try {
            DBCon = DriverManager.getConnection(UserName, "root", Password);
            DBCon.setAutoCommit(false);
            return true;
        } catch (SQLException connectionError) {
            // System.out.println("ik");
            System.out.println(connectionError);
            return false;
        }

    }

    /*
     * A method to create DB is not exist else return connection with
     * MedEaseDatabase
     * 
     * @param DBName Name of DB for e.g MedEaeDB
     * 
     * @return boolean return true if connection established else return false
     * 
     */
    public boolean CreateDB(String DBName) {
        try {
            UserName = UserName + DBName;
            DBCon = DriverManager.getConnection(UserName, "root", Password);
            DBCon.setAutoCommit(false);
        } catch (SQLException DBCreation) {
            try {
                SqlStaement = DBCon.createStatement();
                // System.out.println(UserName);
                SqlStaement.execute("Create Database " + DBName);
                DBCon.commit();
                // System.out.println("Crating DB");
                DBCon = DriverManager.getConnection(UserName, "root", Password);
                DBCon.setAutoCommit(false);
                return true;

            } catch (SQLException error) {
                return false;
            }
        }
        // System.out.println("DB exist");
        return true;
    }
    /*
     * A method to create Tables in DBbase
     */
    public boolean createPatientTable(){
         return true;
    }

}
