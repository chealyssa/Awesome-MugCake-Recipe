/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mugcakerecipe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.SwingConstants;


public class Thanks extends JFrame
{
    // Panel color
    // CHANGE ACCORDING TO BACKGROUND !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static final Color PANEL_COLOR = new Color(241, 156, 135);
    // Making a font
    public static final Font RECIPE_FONT = new Font("Comic Sans MS", Font.BOLD, 40);
    // Font color
    public static final Color FONT_COLOR = new Color(0, 0, 0);
    // Background image 
    public final URL RECIPE_PATH = getClass().getResource("BakeBcg.jpeg");
    private final ImageIcon RECIPE_BACKGROUND = new ImageIcon(new ImageIcon
        (RECIPE_PATH).getImage().getScaledInstance
        (1650, 1070, Image.SCALE_DEFAULT));
    
     // Declaring text, button and picture 
    private JLabel thanksText;
    private JLabel backPicture;
    private JPanel backPanel;      
    
    public Thanks()
    {
        super("Thank you for following along my recipe!");
        // constructing frame size 
        // FIX IF NEEDED
        this.setBounds(0, 0, 3100, 870);
        // close operation
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel backPanel = new JPanel();   
        
        LayoutManager overlay = new OverlayLayout(backPanel);
        backPanel.setLayout(overlay);   
        // Constructing intro text
        this.thanksText = new JLabel("<html><center>"
                + "Thank You! <br>"
                + "Thank you for following along my recipe, if you have any "
                + "feedback, feel free to dm me on discord! <br>"
                + "Enjoy your mugcake! ❤ <br>"
                + "<br>"
                + "alicenessa#2285"
                + "</center><html>", SwingConstants.CENTER); 
        
        thanksText.setFont(RECIPE_FONT);
        thanksText.setForeground(FONT_COLOR);
        
        // constructing picture as background
        this.backPicture = new JLabel(RECIPE_BACKGROUND);
        
        // adding elements to frame !! this is to be fixed 
        backPanel.add(thanksText);
        backPanel.add(backPicture);
        this.add(backPanel);
        
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new Thanks();
    }
}

    
    
