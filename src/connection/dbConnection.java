/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author GOVIND SINGLA
 */
public class dbConnection {
    
           static Connection con;
   static public Connection getConnect(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
          con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "system" ,   "KrishnaJi798");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
