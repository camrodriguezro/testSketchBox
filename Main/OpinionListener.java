package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JTextField;

public class OpinionListener implements ActionListener{
    private JButton send;
    private FileWriter opinionWriter;
    private JTextField comments;
    private Scanner reader;
    private ArrayList<Integer> puntuation;
    
    public OpinionListener(JButton send, JTextField comments){
        this.send = send;
        this.comments = comments;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            opinionWriter = new FileWriter("Opinion.ser",true);
            opinionWriter.write(comments.getText() + System.lineSeparator());
            opinionWriter.close();
            comments.setText("");
        }catch(IOException IOError){
            IOError.getStackTrace();
        }catch(NullPointerException NPEx){
            NPEx.getStackTrace();
        }

    }
    
}
