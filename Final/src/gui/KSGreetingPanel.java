
package gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Karen
 */
public class KSGreetingPanel extends JPanel{
    
    private final JLabel greeting;
    
    public KSGreetingPanel()
    {
        //set the GREETING
        greeting = new JLabel("Welcome to Karen's Store!");
        //set the FONT
        greeting.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        //add the GREETING
        add(greeting);
        //set the BORDER
        setBorder(BorderFactory.createRaisedBevelBorder());
    }
}
