/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class NewDatabase 
{
    public static void main(String[] args) 
    {
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","");
            Statement st = con.createStatement();
            String query = "INSERT INTO "
                + "marks(id,java) "
                + "VALUES(10,70)";
            
            st.execute(query);
            System.out.println("Value inserted in database");
        }
        
        catch(Exception ex)    
        {
            System.out.println("Not connected");
        }
    } 
}
