package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseCon {

    private static final String protocol = "jdbc";
    private static final String vendorName = ":mysql:";
    private static final String ipAddress = "//wgudb.ucertify.com:3306/";
    private static final String dbName = "notknown";// Adding the dbname

    //This will ultimately build: "jdcb:mysql://wgudb.ucertify.com:3306/notknown"
    private static final String jdbcURL = protocol + vendorName + ipAddress + dbName;
    //  private static final String jdbcURL = protocol + vendorName + ipAddress + dbName + "?connectionTimeZone=SERVER; //v8.0.21

    private static final String MYSQLJBCDriver = com.mysql.jdbc.Driver;

    private static final String username = "unknown"; //Username
    private static Connection conn = null;

    public static Connection startConnection() {
        try {
            Class.forName(MYSQLJBCDriver);
            conn = DriverManager.getConnection(jdbcURL, username, Password.getPassword()); // Fine with Driver Manager
            System.out.println("Connection successful");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Connection getConnection(){

        return conn;
    }

    public static void closeConnection(){
        try{
            conn.close();
        }
        catch (Exception e){
            //do nothing
        }
    }
}



