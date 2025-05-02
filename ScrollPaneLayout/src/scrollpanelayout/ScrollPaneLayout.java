/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scrollpanelayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class ScrollPaneLayout {

   public ScrollPaneLayout() //default Constructor
   {
       JFrame j = new JFrame();
       //super("ScrollPane Demo");
       ImageIcon img = new ImageIcon("myphoto.png"); // learn how to insert image in netbeans .....
       
       JScrollPane png = new JScrollPane(new JLabel(img));
       j.getContentPane().add(png);
       j.setSize(300,250);
       j.setVisible(true);
       j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
    public static void main(String[] args) {
      new ScrollPaneLayout();
    }
}
