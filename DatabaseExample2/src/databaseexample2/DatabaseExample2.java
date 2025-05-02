/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseexample2;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class database
{
void intoDatabase(String name1,String address1,String phone1){
        try
        {
              Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/student","root","");
        
        /*
        Statement st = con.createStatement();
        String query = "INSERT INTO "
                + "registration(name,address,phone) "
                + "VALUES("+name1+",,'phone1')";
        st.execute(query);
        */
        
       
        String query = "INSERT INTO register (name,address,phone) VALUES (?, ?, ?)";
        //String query1 = "SELECT * FROM register";
        
//        while(st.(!))eof
//        {
//            String tempname = getstring();
//                   System.out.println(tempname);
//        }
        PreparedStatement st=con.prepareStatement(query);
        st.setString(1, name1);
        st.setString(2, address1);
        st.setString(3, phone1);
       
        int rowsInserted = st.executeUpdate();
            if (rowsInserted > 0) 
            {
                System.out.println("A new user is inserted successfully!");
            }
        
        
        }
        
        catch(Exception e)
        {
            System.out.println("not connected");
        }


}
}

public class DatabaseExample2 
{
     //static JList jl1;
    public static void main(String[] args )throws Exception {
        //Frame create
        JFrame fshow=new JFrame("Show Details");
        
        JFrame f=new JFrame("Button Example");  
        
        
        MenuBar menu=new MenuBar();        
        Menu menu1=new Menu("File");
        Menu menu2=new Menu("Edit");
        JLabel l1=new JLabel("Name");
    l1.setBounds(100, 90, 50, 50);
    
    JTextField tf=new JTextField();  
    tf.setBounds(150,100, 150,30); 
    
    
    JLabel l2=new JLabel("Address");
    l2.setBounds(100, 140, 100, 30);
        
    JTextField tf2=new JTextField();  
    tf2.setBounds(150,150, 150,30); 
    
    JLabel l3=new JLabel("Phone");
    l3.setBounds(100,200,95,30); 

    JTextField tf3=new JTextField();  
    tf3.setBounds(150,200, 150,30); 
    
    JButton b=new JButton("Register");  
    b.setBounds(100,250,95,30);  
    
    JButton cancel=new JButton("Cancel");  
    cancel.setBounds(200,250,95,30);  
    
    
    JLabel lfaculty=new JLabel("Faculty");
    //lfaculty.setBounds(315,85,40,30);
    String faculty[]={"BCA","BBA","BBM","BHM","BIT"};
    JList jl1=new JList(faculty);
    jl1.setBounds(360,90, 100,100);

    ///////////save button
    //f.add(save);
    //
    f.add(l1);
    f.add(l2);
    f.add(tf);
    f.add(tf2);
    f.add(tf3);
 //   f.add(jl1);
    f.add(lfaculty);
//    f.add(tf3);
    f.add(l3);
    f.add(cancel);
    ////////
    f.setMenuBar(menu);
    menu.add(menu1);
    ///
    f.add(b);
    f.add(tf);  
    //f.setSize(600,600);  
    f.setBounds(300, 200, 800, 600);
    f.setLayout(null);  
    f.setVisible(true);   
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
    ////////////
    //////
b.addActionListener(new ActionListener()
        {  
        public void actionPerformed(ActionEvent e)
            { 
        
        database d1=new database();
        String name_value=tf.getText();
        String address_value=tf2.getText();
        String phone_value=tf3.getText();
        //GET VALUE FROM LIST BOX//
       String listvalue=lfaculty.getText();
       
       System.out.println(listvalue);
       
    
        //
          
        if(name_value.isEmpty()==true)
        {
  JOptionPane.showMessageDialog(null,"COMPLETE THE FORM","Warning Message",JOptionPane.WARNING_MESSAGE);
       JOptionPane.showMessageDialog(null,"Data not complete");
        }
        else{
        d1.intoDatabase(name_value,address_value,phone_value);
        }       
            } 
            });
// cancel button click
cancel.addActionListener(new ActionListener()
        {  
        public void actionPerformed(ActionEvent e)
            { 
        
JOptionPane.showMessageDialog(null,"Do you want to cancel?","Warning Message",JOptionPane.WARNING_MESSAGE);
        tf.setText("    ");
        tf2.setText("   ");
        tf3.setText("   ");
        
fshow.setVisible(true);
f.setVisible(false);
fshow.setSize(600,600);
fshow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            } 
            });

///
    
}
}
