package UI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ColorListener implements ActionListener{
    private Pad drawPad;
    private JButton button;
    
    public ColorListener(Pad drawPad, JButton button){
        this.drawPad = drawPad;
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(button.getText().equals("red")){
            drawPad.getGraphics().setPaint(Color.red);
            drawPad.repaint();
        }else if(button.getText().equals("black")){
            drawPad.getGraphics().setPaint(Color.black);
            drawPad.repaint();
        }else if(button.getText().equals("green")){
            drawPad.getGraphics().setPaint(Color.green);
            drawPad.repaint();
        }else if(button.getText().equals("magenta")){
            drawPad.getGraphics().setPaint(Color.magenta);
            drawPad.repaint();
        }else if(button.getText().equals("blue")){
            drawPad.getGraphics().setPaint(Color.blue);
            drawPad.repaint();
        }
    }
    
    
    
}
