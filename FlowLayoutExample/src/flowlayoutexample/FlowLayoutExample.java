/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flowlayoutexample;
import java.awt.*;
import javax.swing.*;
public class FlowLayoutExample {

    FlowLayoutExample()
    {
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(300,300);
        
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
         Parameterless constructor is used, therefore alignment is center.
         horizontal as well as vertical gap is 5 units .
         */
         jf.setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new FlowLayoutExample();
    }
    
}
