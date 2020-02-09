package jdbc_improvements;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*1) THE JDBC-ODBC BRIDGE HAS BEEN REMOVED.
 
Oracle does not support the JDBC-ODBC Bridge. 
Oracle recommends that you use JDBC drivers provided by the vendor 
of your database instead of the JDBC-ODBC Bridge.*/

/*
 2) Added some new features in JDBC 4.2.
Java JDBC 4.2 introduces the following features:

Addition of REF_CURSOR support.
Addition of java.sql.DriverAction Interface
Addition of security check on deregisterDriver Method in DriverManager Class
Addition of the java.sql.SQLType Interface
Addition of the java.sql.JDBCType Enum
Add Support for large update counts
Changes to the existing interfaces
Rowset 1.2: Lists the enhancements for JDBC RowSet.
 */

/*
 3) Java JDBC DriverAction
 
It is an interface that must be implemented when a Driver wants to be notified by DriverManager.
It is added in java.sql package and contains only one abstract method.

void deregister() -- This method called by DriverManager.deregisterDriver(Driver) 
to notify the JDBC driver that it was de-registered.

The deregister method is intended only to be used by JDBC Drivers and not by applications.

JDBC drivers are recommended not to implement the DriverAction in a public class.

If there are active connections to the database at the time that the deregister method is called,
 it is implementation specific as to whether the connections are closed or allowed to continue. 
 Once this method is called, it is implementation specific as
to whether the driver may limit the ability to create new connections to the database, 
invoke other Driver methods or throw a SQLException.
 */

public class Jdbc8Improvements implements DriverAction{
	// implementing deregister method of DriverAction interface  
    @Override  
    public void deregister() {  
        System.out.println("Driver deregistered");  
    }  
    public static void main(String args[]){  
        try{  
            // Creating driver instance  
            Driver driver = new oracle.jdbc.driver.OracleDriver();  
            // Creating Action Driver  
            DriverAction da = new Jdbc8Improvements();  
            // Registering driver by passing driver and driverAction  
            DriverManager.registerDriver(driver, da);  
            // Creating connection  
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");  
            //Here student is database name, root is username and password is mysql  
            Statement stmt=con.createStatement();   
            // Executing SQL query  
            ResultSet rs=stmt.executeQuery("SELECT USER_ID,USER_NAME FROM USERTABLE");    
            while(rs.next()){    
                System.out.println(rs.getString(1)+" "+rs.getString(2));    
            }  
            // Closing connection  
            con.close();    
            // Calling deregisterDriver method  
            DriverManager.deregisterDriver(driver);  
        }catch(Exception e){ System.out.println(e);}    
    }    
}
