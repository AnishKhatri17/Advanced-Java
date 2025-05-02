/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jframeexample;

import java.awt.GraphicsConfiguration;
import javax.swing.JFrame;


public class JFrameExample {

    static GraphicsConfiguration gc ;
    public static void main(String[] args) {
       JFrame j1 = new JFrame(gc);
       j1.setVisible(true);
       j1.setSize(600,400);
       j1.setTitle("Project");
       j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closing the frame if we exit .....
       j1.setResizable(false);
//       j1.setLocation(600,250); // first x-axis and second y-axis ...
       j1.setLocationRelativeTo(null); // it is used to center the Frame .....
       
    }
    
}
