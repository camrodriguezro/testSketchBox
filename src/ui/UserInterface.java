/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Rodriguez
 */
public class UserInterface implements Runnable{
    private JFrame frame;
    
    public UserInterface(){
        
    }

    @Override
    public void run() {
        frame = new JFrame("Test");
        frame.setPreferredSize(new Dimension(300,300));        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);       
        
        createComponents(frame.getContentPane());        
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container){
        JButton button= new JButton("");
              
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File("red.bmp"));
        } catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
        ImageIcon red = new ImageIcon(img);
        button.setIcon(red);    
        
        container.add(button);
    }
    
    public JFrame getFrame(){
        return frame;
    }
    
    
}
