/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabbedpanedynamictabs;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabbedPaneDynamicTabs {

    
    public static void main(String[] args) 
    {
        //Create the main JFrame Window ...
        JFrame window = new JFrame("This is an example of Dynamic Tab.");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // this is close operation..
        window.setSize(450,350); // initial size of the window ..
        
        //Creating a tabbedpane to manage the tabs 
        JTabbedPane tabPanel = new JTabbedPane();
        
        //Create an "Add Tab" button with an Action Listener.
        JButton addTabButton = new JButton("Add Tab");
        addTabButton.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        //Create a new JPanel for the added tab
                        JPanel newTab = new JPanel();
                        newTab.add(new JLabel("New Tab Added"));
                        //add a label to the new tab
                        //add a new tab to the JTabbedPane with a dynamically generated title .
                        tabPanel.addTab("Tab"+tabPanel.getTabCount(),newTab);
                    }
                }
        );
        
        //Create a "Remove Tab" button with an ActionListener
        JButton removeTabButton = new JButton("Remove Tab");
        removeTabButton.addActionListener(
                new ActionListener()
                {
                 @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        //Get the index of the currently selected tab
                        int selectedIndex = tabPanel.getSelectedIndex();
                        
                        if(selectedIndex != -1)
                        {
                            //Remove the selected Tab
                            tabPanel.removeTabAt(selectedIndex);
                        }
                    }
                }
        );
        
        //Create the control panel to hold the buttons
        JPanel controlPanel = new JPanel();
        
        //Add "Add Tab" Button
        controlPanel.add(addTabButton);
        
        //Add "Remove Tab" Button
        controlPanel.add(removeTabButton);
        
        window.setVisible(true); //make the JFrame visible...
        window.add(tabPanel, BorderLayout.CENTER);
        window.add(controlPanel, BorderLayout.SOUTH);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
