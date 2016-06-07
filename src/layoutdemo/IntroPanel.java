/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutdemo;


import java.awt.*;
import javax.swing.*;

/**
 *
 * @author stimpy
 */
public class IntroPanel extends JPanel {
    
    public IntroPanel() {
        setBackground(Color.GREEN);
        
        JLabel l1 = new JLabel("Layout Manager Demonstration");
        JLabel l2 = new JLabel("Choose a tab to see an example of a layout manager.");
        
        add(l1);
        add(l2);
    }
}
