/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boxlayoutyaxis;
import java.awt.*;
import javax.swing.*;

public class BoxLayoutYAxis {

  Button buttons[];
    public BoxLayoutYAxis()
    {
        JFrame j1 = new JFrame("Box Layout Example");
         buttons = new Button[5];
        for(int i=0; i <5; i++)
        {
            buttons[i] = new Button("Button"+(i+1));
            //adding the buttons so that it can be displayed ...
            j1.add(buttons[i]);
        }
        
        //the buttons in the output will be aligned vertically .
       j1.setLayout(new BoxLayout(j1.getContentPane(), BoxLayout.Y_AXIS));
        j1.setSize(400,400);
        j1.setVisible(true);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
       new BoxLayoutYAxis();
    }
    
}
