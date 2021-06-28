/*
Alyssa, INIT 2022
This is step one.
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


public class StepOne extends JFrame implements ActionListener
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
    private JLabel oneText;
    private JButton nextButton;
    private JButton ingredientsButton;
    private JPanel buttonPanel;
    private JLabel backPicture;
    private JPanel backPanel;   
    
    public StepOne()
    {
        super("Step one to completing your awesome mugcake!");
        // constructing frame size 
        // FIXED
        this.setBounds(0, 0, 3100, 870);
        // close operation
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel backPanel = new JPanel();
  
        LayoutManager overlay = new OverlayLayout(backPanel);
        backPanel.setLayout(overlay);   
        // Constructing intro text
        this.oneText = new JLabel("<html><center>"
                + "Step One! <br>"
                + "In a medium bowl (NOT MUG), whisk all the dry ingredients "
                + "together. <br>"
                + "<br>"
                + "*refer to the ingredients list if you are not sure. "
                + "</center><html>", SwingConstants.CENTER);  
        
        oneText.setFont(RECIPE_FONT);
        oneText.setForeground(FONT_COLOR);
        
        // constructing picture as background
        this.backPicture = new JLabel(RECIPE_BACKGROUND);
        
        // constructing buttons
        this.ingredientsButton = new JButton("Ingredients list");
        ingredientsButton.addActionListener(this);
        this.nextButton = new JButton("Let's move on to step two!");
        nextButton.addActionListener(this);
        
        // Constructing panel
        this.buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(PANEL_COLOR);
        buttonPanel.add(ingredientsButton);       
        buttonPanel.add(nextButton);
        
        // adding elements to frame !! this is to be fixed 
        backPanel.add(oneText);
        backPanel.add(backPicture);
        this.add(backPanel);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        // Visible
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new StepOne();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String command = e.getActionCommand();
        if(command.equals("Let's move on to step two!"))
        {
            new StepTwo();
        }
        else if(command.equals("Ingredients list"))
        {
            new IngredientList();
        }
        this.validate();
        this.repaint();  
    }
}
