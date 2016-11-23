package ops;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ReviewListener extends MouseAdapter {

    private JButton button;
    private FileWriter writer;

    public ReviewListener(JButton one) {
        this.button = one;
    }

    public void mousePressed(MouseEvent e) {
        button.setBorder(BorderFactory.createLoweredBevelBorder());
        try {
            writer = new FileWriter("puntuation.txt", true);
            writer.write(button.getText() + " ");
            writer.close();
        } catch (IOException ex) {}
    }

    public void mouseReleased(MouseEvent e) {
        button.setBorder(null);
    }

}
