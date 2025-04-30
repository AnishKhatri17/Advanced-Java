/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package borderlayoutexample2;
import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample2 
{
    BorderLayoutExample2()
    {
        JFrame j = new JFrame();
        j.setVisible(true);
        j.setSize(300,300);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("NORTH");
         JButton b2 = new JButton("SOUTH");
          JButton b3 = new JButton("EAST");
           JButton b4 = new JButton("WEST");
            JButton b5 = new JButton("SOUTH");
            
            //horizontal gap is 20 and vertical gap is 15 ...
            j.setLayout(new BorderLayout(20,15));
            j.add(b1, BorderLayout.NORTH);
            j.add(b2, BorderLayout.SOUTH);
            j.add(b3, BorderLayout.EAST);
            j.add(b4, BorderLayout.WEST);
            j.add(b5, BorderLayout.CENTER);    
    }
    
    public static void main(String[] args) 
    {
        new BorderLayoutExample2();
    }
    
}
