/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_application;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Chamila
 */
public class DbConnect {
    Connection conn = null;
    public static Connection DbConnect(){
        try{
         Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/gymdb","root","root");
         return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
             return null;
        }
       
        
    }
}
