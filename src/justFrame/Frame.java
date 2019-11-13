package justFrame;

import javax.swing.*;
import java.awt.*; // awt - abstract window toolkit 


public class Frame extends JFrame
{    
    public Frame()
    {
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        
        this.setSize(width/2, height/2);
        
        int frameWidth = this.getSize().width;
        int frameHeight = this.getSize().height;
        
        this.setLocation((width-frameWidth)/2, (height-frameHeight)/2);
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.jpg"));
        this.setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) 
    {
        new Frame().setVisible(true);
        System.out.println("Hello");
    }
}
