package MedEaseNavigator.DataBaseModule;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.PreparedQuery;

public class DBOperation {
    Connection DBcon;
    ResultSet   data;
    PreparedQuery  preparedQuery;
    Statement      SqlStatement;
    public DBOperation(Connection DBcon) {
        this.DBcon=DBcon;
    }


}
