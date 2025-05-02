/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaactionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaActionListener 
{
    public static void main(String[] args) {
       JFrame f1 = new JFrame("Action Listener Example ");
       f1.setVisible(true);
       f1.setSize(400,300);
       JButton j1 = new JButton("Click");
       j1.setBounds(100,140,150,50);
       f1.add(j1);    
//      j1.addActionListener(new ActionListener()
//      {
//        public void ActionPerformed(ActionEvent e)
//        {
//            System.out.println("Button is Clicked..");
//        }
//    });

      j1.addActionListener((ActionEvent e) -> 
      {
          System.out.println("Button is Clicked..");
       });
              
    }
    
}
