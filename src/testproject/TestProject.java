/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import javax.swing.SwingUtilities;
import ui.UserInterface;

/**
 *
 * @author Rodriguez
 */
public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);
        
    }
    
}
