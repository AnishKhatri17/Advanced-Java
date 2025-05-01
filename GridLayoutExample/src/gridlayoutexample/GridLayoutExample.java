/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gridlayoutexample;
import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {

    GridLayoutExample()
    {
        JFrame j1 = new JFrame("Grid Layout Example");
        j1.setVisible(true);
        j1.setSize(700,500);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //adding 10 buttons in layout.
        JButton btn1 = new JButton("1");
         JButton btn2 = new JButton("2");
          JButton btn3 = new JButton("3");
           JButton btn4 = new JButton("4");
            JButton btn5 = new JButton("5");
             JButton btn6 =new JButton("6");
              JButton btn7 = new JButton("7");
               JButton btn8 = new JButton("8");
                JButton btn9 = new JButton("9");
                 JButton btn10 = new JButton("10");
                 
        //adding buttons to the frame 
        j1.add(btn1);  j1.add(btn2);  j1.add(btn3);  j1.add(btn4);  j1.add(btn5);
         j1.add(btn6);  j1.add(btn7);  j1.add(btn8);  j1.add(btn9);  j1.add(btn10);
         
         /*
         Since we are using parameterless constructor the number of columns is equal to the number of buttons
         we are adding to the frame.
         The row count remains one .
         */
        
         //Setting the GridLayout Using parameterless constructor
         j1.setLayout(new GridLayout());
    }
    public static void main(String[] args) 
    {
      new GridLayoutExample();
    }
    
}
