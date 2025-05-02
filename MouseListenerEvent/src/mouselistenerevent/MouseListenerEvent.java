/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mouselistenerevent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEvent implements MouseListener 
{
    JFrame j1;
    Label l1;

    public MouseListenerEvent() {
        j1 = new JFrame("Mouse Click Listener Example");
        j1.addMouseListener(this);
        
        l1 = new Label();
        l1.setBounds(20, 50, 150, 20);
        j1.add(l1);
        
        j1.setSize(400, 600);
        j1.setLayout(null); // Set layout to null to allow setBounds
        j1.setVisible(true);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MouseListenerEvent();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l1.setText("Mouse Clicked");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse Exited");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Optionally implement
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Optionally implement
    }
}