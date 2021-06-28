/*
Alyssa, INIT 2022
First window, an itroduction of what this recipe is and who I am 
 */

package mugcakerecipe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.SwingConstants;

public class Introduction extends JFrame implements ActionListener 
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
    private JLabel introText;
    private JButton startButton;
    private JPanel buttonPanel;
    private JLabel backPicture;
    private JPanel backPanel;
    
    public Introduction()
    {
        super("Introduction to my favorite mugcake recipe!");
        // constructing frame size 
        // FIXED
        this.setBounds(0, 0, 3100, 870);
        // close operation
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel backPanel = new JPanel();
        
        LayoutManager overlay = new OverlayLayout(backPanel);
        backPanel.setLayout(overlay);
        
        // Constructing intro text
        this.introText = new JLabel("<html><center>"
                + "Hello, there! It's Alyssa! This is a step by step recipe "
                + "walkthrough for my favorite mug cake. The ingredients would "
                + "be on the next window. Enjoy!!"
                + "</center><html>", SwingConstants.CENTER);
        
        introText.setFont(RECIPE_FONT);
        introText.setForeground(FONT_COLOR);
        
        // constructing picture as background
        this.backPicture = new JLabel(RECIPE_BACKGROUND);
        
        // constructing button to start
        this.startButton = new JButton("Ingredients");
        startButton.addActionListener(this);
        
        // Constructing panel
        this.buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(PANEL_COLOR);
        buttonPanel.add(startButton);
        
        // adding elements to frame !! this is to be fixed 
        backPanel.add(introText);
        backPanel.add(backPicture);
        this.add(backPanel);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        // Visible
        this.setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        new Introduction();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       String command = e.getActionCommand();
       if(command.equals("Ingredients"))
       {
            new IngredientList();
       }
       this.validate();
       this.repaint();
    }
    
}
