package UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        Icon iconB = new ImageIcon("blue.gif");
        //the blue image icon
        Icon iconM = new ImageIcon("magenta.gif");
        //magenta image icon
        Icon iconR = new ImageIcon("red.gif");
        //red image icon
        Icon iconBl = new ImageIcon("black.gif");
        //black image icon
        Icon iconG = new ImageIcon("green.gif");
        //finally the green image icon
        //These will be the images for our colors.

        JFrame frame = new JFrame("Paint It");
        //Creates a frame with a title of "Paint it"
        //frame.setLayout(new BorderLayout());
        Container content = frame.getContentPane();
        //Creates a new container
        content.setLayout(new BorderLayout());
        //sets the layout
        final Pad drawPad = new Pad();
        //creates a new padDraw, which is pretty much the paint program
        
        //sets the padDraw in the center

        JPanel panel = new JPanel();
        //creates a JPanel
        panel.setPreferredSize(new Dimension(35, 68));
        panel.setMinimumSize(new Dimension(35, 68));
        panel.setMaximumSize(new Dimension(35, 68));
        //This sets the size of the panel

        JButton clearButton = new JButton("Clear");
        //creates the clear button and sets the text as "Clear"
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawPad.clear();
            }
        });
        //this is the clear button, which clears the screen.  This pretty
        //much attaches an action listener to the button and when the
        //button is pressed it calls the clear() method

        JButton redButton = new JButton("red",iconR);
        //creates the red button and sets the icon we created for red

        JButton blackButton = new JButton("black",iconBl);
        //same thing except this is the black button
        
        JButton magentaButton = new JButton("magenta",iconM);
        //magenta button
        
        JButton blueButton = new JButton("blue",iconB);
        //blue button
        
        JButton greenButton = new JButton("green",iconG);
        //green button
        
        redButton.addActionListener(new ColorListener(drawPad,redButton));
        greenButton.addActionListener(new ColorListener(drawPad,greenButton));
        blackButton.addActionListener(new ColorListener(drawPad,blackButton));
        magentaButton.addActionListener(new ColorListener(drawPad,magentaButton));
        blueButton.addActionListener(new ColorListener(drawPad,blueButton));
        
        JButton helpButton = new JButton(iconG);
        //green button
        helpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        blackButton.setPreferredSize(new Dimension(16, 16));
        magentaButton.setPreferredSize(new Dimension(16, 16));
        redButton.setPreferredSize(new Dimension(16, 16));
        blueButton.setPreferredSize(new Dimension(16, 16));
        greenButton.setPreferredSize(new Dimension(16, 16));
        helpButton.setPreferredSize(new Dimension(16, 16));
        //sets the sizes of the buttons

        panel.add(greenButton);
        panel.add(blueButton);
        panel.add(magentaButton);
        panel.add(blackButton);
        panel.add(redButton);
        panel.add(clearButton);
        panel.add(helpButton);
        //adds the buttons to the panel
        content.add(drawPad, BorderLayout.CENTER);
        content.add(panel, BorderLayout.EAST);
        //sets the panel to the left

        frame.setSize(500, 500);
        //sets the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //makes it so you can close
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        //makes it so you can see it
    }
}