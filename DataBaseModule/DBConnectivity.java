/*
 * In this class we will have all operation such as DB connectivty, adn DB and Table  creation 
 * 
 */
package MedEaseNavigator.DataBaseModule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import MedEaseNavigator.NotificationMoudle.MedEaseNotify;

public class DBConnectivity {
    String UserName;
    String Password;
    Connection DBCon;
    Statement SqlStaement;
    MedEaseNotify DbNotify = new MedEaseNotify();

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
            DbNotify.setMsg("Unnable To Connect ", -1);
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
            SqlStaement=DBCon.createStatement();
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
                DbNotify.setMsg("DB Creation Failed ", -1);
                return false;
            }
        }
        // System.out.println("DB exist");
        return true;
    }

    /*
     * A method to create Tables in DBbase
     */
    public boolean createPatientTable() {
        try {

            String PatientTableQuerry = "create table PATIENT" +
                    "( Patient_ID          varchar(40)        not null     primary key," +
                    " Name                varchar(50)        not null," +
                    " Number              varchar(10)        not null," +
                    " Age                 int," +
                    " Height              varchar(5)," +
                    " Weight              int," +
                    " BloodGrp            varchar(3)," +
                    " Allergy             varchar(30)," +
                    " )";
            if (SqlStaement.execute(PatientTableQuerry)) {
                return true;
            } else {
                DbNotify.setMsg("Unable to create Patient Table", -1);
                return false;
            }
        } catch (SQLException ex) {
            DbNotify.setMsg("Error While Creating Patient Table", -1);
        }
        return true;
    }
    public boolean CreateMedicalReportTable(){
        try{
            String MedicalReportTableQuerry="create table MEDICAL_HISTORY"+
            " ( MRID               varchar(20)        not null     primary key,"+
            "   Cheif_Complaint    varchar(300),"+
            "   Diagnosis          varchar(5000),"+
            "   Prescription       varchar(1000),"+
            "   FollowUp_Advice    varchar(500),"+
            "   FollowUp_Date      Date,"+
            "   Symptoms           varchar(200),"+
            "   "+
            " )";
            if(SqlStaement.execute(MedicalReportTableQuerry)){
                return true;
            }
            else {
                DbNotify.setMsg("Unable to create Medical Report Table ", -1);
                return false;
            }

        }catch(SQLException ex){
            DbNotify.setMsg("Error while Creating Medical Report Table", -1);
            return false;
        }

    }
    

}
