/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flowlayoutexample2;
import java.awt.*;
import javax.swing.*;
public class FlowLayoutExample2 {

    FlowLayoutExample2()
    {
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("10");
        
        jf.add(b1);  jf.add(b2); jf.add(b3); jf.add(b4); jf.add(b5);
         jf.add(b6); jf.add(b7); jf.add(b8); jf.add(b9); jf.add(b10);
         
         /* 
         Parameterized constructor is used, and alignment is set to left.
         horizontal gap is 20 units and vertical gap is 25 units .
         */
         jf.setLayout(new FlowLayout(FlowLayout.LEFT,20,25));
         
    }
    public static void main(String[] args) {
      new FlowLayoutExample2();
    }
    
}
