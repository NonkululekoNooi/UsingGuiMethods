
package using.gui.methods;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class UsingGuiMethods {

    //add frames,panels and buttons
    //import jpanel1 as a swing
    //import jframe1 as a swing
    //import jButton as a swing
    JPanel jPanel1 = new JPanel ();
    JFrame jFrame1 = new JFrame ();
    JFrame jFrame2 = new JFrame ();
    JButton jButton1 = new JButton ("ESC");
    
    //create a constructor
    public UsingGuiMethods() {
        //set the visiblility of the frame
        
        
        jFrame1.setVisible(true);
        jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame1.setSize(400,400);
        jFrame1.setTitle("SCREEN 1");
        
        jFrame2.setVisible(true);
        jFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame2.setSize(400,400);
        jFrame2.setTitle("SCREEN 2");
        jFrame2.setLocation(400,40);
        jFrame2.add(jPanel1);
        jPanel1.add(jButton1);
       
       
        
    }

    public static void main(String[] args) {
        UsingGuiMethods myThis = new UsingGuiMethods();
    }
    
}
