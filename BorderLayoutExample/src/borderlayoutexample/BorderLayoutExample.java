/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package borderlayoutexample;
import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {
    
    BorderLayoutExample() //default Constructor ...
    {
        JFrame f = new JFrame();
        //Creating Buttons 
        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");
        
        f.add(b1,BorderLayout.NORTH);
         f.add(b2,BorderLayout.SOUTH);
          f.add(b3,BorderLayout.EAST);
           f.add(b4,BorderLayout.WEST);
            f.add(b5,BorderLayout.CENTER);
            
           f.setSize(300,300);
           f.setVisible(true);
           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) 
    {
       new BorderLayoutExample();
    }
    
}
