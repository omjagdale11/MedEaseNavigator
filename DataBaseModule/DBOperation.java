package MedEaseNavigator.DataBaseModule;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import MedEaseNavigator.NotificationMoudle.MedEaseNotify;

public class DBOperation implements DBOpertaionInterface {
    Connection DBcon;
    ResultSet data;
    PreparedStatement preparedQuery;
    Statement SqlStatement;
    MedEaseNotify Dbnotfy=new MedEaseNotify();

    public DBOperation(Connection DBcon2) {
        this.DBcon = DBcon2;
        try {
            
            SqlStatement = this.DBcon.createStatement();

        } catch (SQLException ex) {
            System.out.println("Error in DBopertiaon Constructor");
        }
    }

    @Override
    public ResultSet GetPatient(String Number) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GetPatient'");
    }

    @Override
    public ResultSet GetMedicalReport(String PID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GetMedicalReport'");
    }

    @Override
    public ResultSet GetAppointmentSchedule(String Date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GetAppointmentSchedule'");
    }

    @Override
    public boolean UpdateAppointment(String Stas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'UpdateAppointment'");
    }

    @Override
    public boolean SetUserDetails(String UserName, String Password) {
        try{
            preparedQuery = this.DBcon.prepareStatement("UPDATE utility set Admin_login =?, Pswd=? WHERE utindex =1;");
            preparedQuery.setString(1, UserName);
            preparedQuery.setString(2, Password);
            preparedQuery.executeUpdate();
            Dbnotfy.setMsg("User Detials Updated ", 1);
            return true;
        }catch(SQLException ex){
            Dbnotfy.setMsg("Error while Updatning User Detials", 0);
            return false;
        }
    }

}
