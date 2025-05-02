/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabbedpane;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;


public class TabbedPane extends JFrame
{
    void sampleframe()
    {
        this.setBounds(0,0,1900,1900);
        this.setTitle("Tabbed Sample");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("From Constructor");
        
        JButton b1 = new JButton("from tab 1");
        b1.setBounds(50,50,100,100);
        
        JTextArea t2 = new JTextArea("Text area is important");
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.red);
        p1.add(b1);
        
        JPanel p2 = new JPanel();
        p2.add(t2);
        JPanel p3 = new JPanel();
        
        JTabbedPane t1 = new JTabbedPane();
        t1.setBounds(30,30,500,500);
        t1.add("student",p1);
        t1.add("teacher",p2);
        t1.add("staff",p3);
        this.add(t1);
        this.setVisible(true);
    }


    
    public static void main(String[] args) 
    {
       TabbedPane t1 = new TabbedPane();
       t1.sampleframe();
    }

//    private void setLocationRelativeto(Object object) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
}
