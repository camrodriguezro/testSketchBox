package ops;

import java.awt.Dimension;
import static java.awt.EventQueue.invokeLater;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class Box extends JFrame{
    private JPanel Container = new JPanel();
    
    private JButton sendButton = new JButton();
    private JButton rate5 = new JButton();
    private JButton rate4 = new JButton();
    private JButton rate3 = new JButton();
    private JButton rate2 = new JButton();
    private JButton rate1 = new JButton();
    private JButton opinionImage = new JButton();
    
    private JLabel createdBy = new JLabel();
    private JLabel person1 = new JLabel();
    private JLabel person2 = new JLabel();
    private JLabel rights = new JLabel();
    private JLabel madeIn = new JLabel();
    private JLabel commentLabel = new JLabel();
    private JLabel version = new JLabel();

    private JTextField commentArea = new JTextField();
    private JComboBox<String> languageSelector = new JComboBox<String>();
    private Locale language = new Locale("en","EN");
    private ResourceBundle translator = ResourceBundle.getBundle("MessagesBundle",language);
    
    public Box() {
        initComponents();
    }
                       
    private void initComponents() {

        GroupLayout jPanel1Layout = new GroupLayout(Container);
        Container.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));
        setResizable(false);
        setSize(new Dimension(400, 400));

        rate5.setIcon(new ImageIcon(getClass().getResource("/ops/smiley.png")));
        rate4.setIcon(new ImageIcon(getClass().getResource("/ops/ok.png")));
        rate3.setIcon(new ImageIcon(getClass().getResource("/ops/nothing.png")));
        rate2.setIcon(new ImageIcon(getClass().getResource("/ops/shutted up.png")));
        rate1.setIcon(new ImageIcon(getClass().getResource("/ops/death.png")));
        opinionImage.setIcon(new ImageIcon(getClass().getResource("/ops/Rated5.png")));

        createdBy.setText("Created by: ");
        person1.setText("Carlos Rodriguez (@camrodriguezro)");
        person2.setText("Daniel Zuñiga (@dfzunigah)");
        rights.setText("All rights reserved - 2016");
        madeIn.setText("Coded with ❤ in Bogotá");
        commentLabel.setText("Write your comments here...");
        sendButton.setText("Send!");
        version.setText("V1.2.3");
        
        rate5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });


        rate4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });


        rate3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });


        rate1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        commentArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });



        languageSelector.setModel(new DefaultComboBoxModel<>(new String[] { "English", "Español", "Francais"}));
        languageSelector.setSelectedItem("English");

                languageSelector.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                languageSelectorActionPerformed(evt);
            }
        });
        
        opinionImage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createdBy))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(person2)
                            .addComponent(person1)
                            .addComponent(madeIn)
                            .addComponent(rights))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(commentLabel)
                                    .addGap(116, 116, 116)
                                    .addComponent(opinionImage, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
                                .addComponent(commentArea, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rate5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rate4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rate3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rate2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rate1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 33, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sendButton)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(version))))))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(languageSelector, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(languageSelector, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(createdBy)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(person1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(person2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(madeIn)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rights)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(commentLabel))
                    .addComponent(opinionImage, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commentArea, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(rate4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(rate5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(rate3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(rate2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(rate1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(sendButton)
                        .addGap(81, 81, 81))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(version)
                        .addGap(68, 68, 68))))
        );

        commentArea.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }                   

    private void jButton4ActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton6ActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jTextField1ActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton3ActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton7ActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(ActionEvent evt) {                                         
        
    }                                        

    private void languageSelectorActionPerformed(ActionEvent evt) {                                           
        String idiom = (String)languageSelector.getSelectedItem();
        if(idiom == null || idiom.isEmpty()){
            language = new Locale("en","EN");
            translator = ResourceBundle.getBundle("MessagesBundle",language);
            this.sendButton.setText(translator.getString("send"));
            this.commentLabel.setText(translator.getString("comments"));
            this.createdBy.setText(translator.getString("created"));
            this.madeIn.setText(translator.getString("coded"));
            this.rights.setText(translator.getString("rights"));
            
        }else if(idiom.equals("English")){
            language = new Locale("en","EN");
            translator = ResourceBundle.getBundle("MessagesBundle",language);
            this.sendButton.setText(translator.getString("send"));
            this.commentLabel.setText(translator.getString("comments"));
            this.createdBy.setText(translator.getString("created"));
            this.madeIn.setText(translator.getString("coded"));
            this.rights.setText(translator.getString("rights"));
            
        }else if(idiom.equals("Español")){
            language = new Locale("es","ES");
            translator = ResourceBundle.getBundle("MessagesBundle",language);
            this.sendButton.setText(translator.getString("send"));
            this.commentLabel.setText(translator.getString("comments"));
            this.createdBy.setText(translator.getString("created"));
            this.madeIn.setText(translator.getString("coded"));
            this.rights.setText(translator.getString("rights"));
            
        }else if(idiom.equals("Francais")){
            language = new Locale("fr","FR");
            translator = ResourceBundle.getBundle("MessagesBundle",language);
            this.sendButton.setText(translator.getString("send"));
            this.commentLabel.setText(translator.getString("comments"));
            this.createdBy.setText(translator.getString("created"));
            this.madeIn.setText(translator.getString("coded"));
            this.rights.setText(translator.getString("rights"));
        }
    
    }
    
    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Box.class.getName()).log(Level.SEVERE, null, ex);
        }

       invokeLater(new Runnable() {
            
           @Override 
            public void run() {
                new Box().setVisible(true);
            }
        });
    }               
}
