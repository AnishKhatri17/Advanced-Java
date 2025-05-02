/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseconnection;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static void main(String[] args) 
    {
       try{
               
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/bca","root","");
           Statement st = con.createStatement();
            String query = "INSERT INTO "
                + "marks(id,java) "
                + "VALUES(110,100)";
        st.execute(query);
            System.out.println("Value inserted in database");
        }
       catch(Exception ex)    
        {
            System.out.println("not connected");
        }
        
    }
}

