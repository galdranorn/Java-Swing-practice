package justFrame;

import javax.swing.*;
import java.awt.*; // awt - abstract window toolkit
 
public class Frame 
{    
    public Frame()
    {
        JFrame frame = new JFrame("Hello");
        //frame.setSize(100, 100);
        //frame.setLocation(new Point (100, 50));
        //frame.setResizeable(false); // default true
        
        frame.setBounds(100, 50, 100, 100);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.jpg"));
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        new Frame();
        System.out.println("Hello");
    }
}
