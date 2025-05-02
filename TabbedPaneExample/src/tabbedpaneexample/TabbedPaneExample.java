/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabbedpaneexample;
import javax.swing.*;

public class TabbedPaneExample {

    public TabbedPaneExample()
    {
    
   JFrame j = new JFrame("Tabbed Pane Example");
   //j.setVisible(true);
   //j.setSize(300,300);
   JTextArea ta = new JTextArea(200,200);
   JPanel p1 = new JPanel();
   p1.add(ta);
   JPanel p2 = new JPanel();
   JPanel p3 = new JPanel();
   
   JTabbedPane tp = new JTabbedPane();
   tp.setBounds(50,50,200,200);
   tp.add("main",p1);
   tp.add("visit",p2);
   tp.add("help",p3);
   j.add(tp);
   j.setSize(400,400);
   j.setLayout(null);
   j.setVisible(true);
   j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) 
    {
       new TabbedPaneExample();
    }
    
}
