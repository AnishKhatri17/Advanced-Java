/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardlayoutexample;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import java.actionperform.ActionPerform;

public class CardLayoutExample extends JFrame implements ActionListener {

   CardLayout card ;
   // button variables to hold the references to button
   JButton btn1, btn2, btn3 ;
   Container cPane;
   
   //Constructor of the class
   CardLayoutExample()
   {
       cPane = getContentPane();
       //default constructor used therefore, components will cover the whole area...
       card = new CardLayout();
//       card = new CardLayout(40,30); this is used to set the parameters ...
       cPane.setLayout(card);
       
       //Creating the buttons.
       btn1 = new JButton("Apple");
       btn2 = new JButton("Boy");
       btn3 = new JButton("Cat");
       
       //Adding listeners to it
       btn1.addActionListener(this);
       btn2.addActionListener(this);
       btn3.addActionListener(this);
       
       cPane.add("a",btn1); //first card is button btn1
        cPane.add("b",btn2); //second card is button btn2
         cPane.add("c",btn3); //third card is button btn3 
   }
   
   public void actionPerformed(ActionEvent e)
   {
       //upon clicking the button, next card of the container is shown.
       //after the last card, again, the first card of the container is shown upon clicking
       card.next(cPane);
   }
           
    public static void main(String[] args) {
        //Creating object of the main class
        CardLayoutExample cardl = new CardLayoutExample();
        //size is 300 * 300
        cardl.setSize(300,300);
        cardl.setVisible(true);
        cardl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
