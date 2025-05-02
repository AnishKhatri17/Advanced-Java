/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaswingcomponents;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JavaSwingComponents {
    public static void main(String[] args) {
        // Creating a Frame
        JFrame j1 = new JFrame();
        j1.setSize(400, 500); // width and height
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.setTitle("Java Swing Components ....");
        j1.setResizable(false); // user now cannot change the size of the Frame manually
        j1.setLayout(null); // Using null layout manager for custom positioning

        // Create and label TextField .....
        JLabel l1 = new JLabel("Name :");
        l1.setBounds(20, 20, 80, 25);
        JTextField txt1 = new JTextField();
        txt1.setBounds(100, 20, 150, 25);

        JLabel l2 = new JLabel("Email :");
        l2.setBounds(20, 50, 80, 25);
        JTextField txt2 = new JTextField();
        txt2.setBounds(100, 50, 150, 25);

        JLabel l3 = new JLabel("Address :");
        l3.setBounds(20, 80, 80, 25);
        JTextField txt3 = new JTextField();
        txt3.setBounds(100, 80, 150, 25);

        // Creating JPassword Field
        JLabel l4 = new JLabel("Password :");
        l4.setBounds(20, 110, 80, 25); // Adjusted Y-position for this label
        JPasswordField pass = new JPasswordField();
        pass.setBounds(100, 110, 150, 25);

        // Creating Checkboxes ...
        JCheckBox cb1 = new JCheckBox("Option 1");
        cb1.setBounds(20, 140, 100, 25);
        JCheckBox cb2 = new JCheckBox("Java");
        cb2.setBounds(20, 170, 100, 25);
        JCheckBox cb3 = new JCheckBox("Java", true); // Default checked
        cb3.setBounds(20, 200, 100, 25);

        // Creating Button
        JButton b1 = new JButton("Click");
        b1.setBounds(100, 240, 150, 25);

        // Add Components to the frame
        j1.add(l1);
        j1.add(txt1);
        j1.add(l2);
        j1.add(txt2);
        j1.add(l3);
        j1.add(txt3);
        j1.add(l4);
        j1.add(pass);
        j1.add(cb1);
        j1.add(cb2);
        j1.add(cb3);
        j1.add(b1);

        // Now, make the frame visible after adding all components
        j1.setVisible(true);
    }
}

