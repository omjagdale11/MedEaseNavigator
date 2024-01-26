package MedEaseNavigator.DataBaseModule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBOperation {
    Connection DBcon;
    ResultSet   data;
    PreparedStatement  preparedQuery;
    Statement      SqlStatement;
    public DBOperation(Connection DBcon) {
        this.DBcon=DBcon;
        try{
            SqlStatement =DBcon.createStatement();

        }catch(SQLException ex){
            System.out.println("Error in DBopertiaon Constructor");
        }
    }
    


}
