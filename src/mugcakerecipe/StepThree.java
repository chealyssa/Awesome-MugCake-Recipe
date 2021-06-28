/*
Alyssa, INIT 2022
This is step three
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

public class StepThree extends JFrame implements ActionListener
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
    private JLabel threeText;
    private JButton nextButton;
    private JButton ingredientsButton;
    private JButton backButton;
    private JPanel buttonPanel;
    private JLabel backPicture;
    private JPanel backPanel;      
    
    public StepThree()
    {
        super("Step three to completing your awesome mugcake!");
        // constructing frame size 
        // FIX IF NEEDED
        this.setBounds(0, 0, 3100, 870);
        // close operation
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel backPanel = new JPanel();   
        
        LayoutManager overlay = new OverlayLayout(backPanel);
        backPanel.setLayout(overlay);   
        // Constructing intro text
        this.threeText = new JLabel("<html><center>"
                + "Step Three! <br>"
                + "Pour half of your awesome batter into a 14-ounce mug. <br>"
                + "Put in your chocolate spead and <br>"
                + "pour the remaining batter into cup. <br>"
                + "<br>"
                + "This way you have a lava cake effect in your mug cake!!"
                + "</center><html>", SwingConstants.CENTER); 
        
        threeText.setFont(RECIPE_FONT);
        threeText.setForeground(FONT_COLOR);
        
        // constructing picture as background
        this.backPicture = new JLabel(RECIPE_BACKGROUND);
        
        // constructing buttons
        this.backButton = new JButton("Go back");
        backButton.addActionListener(this);
        this.ingredientsButton = new JButton("Ingredients list");
        ingredientsButton.addActionListener(this);
        this.nextButton = new JButton("Let's move on to step four!");
        nextButton.addActionListener(this);
        
        // Constructing panel
        this.buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(PANEL_COLOR);
        buttonPanel.add(backButton);
        buttonPanel.add(ingredientsButton);       
        buttonPanel.add(nextButton);
        
        // adding elements to frame !! this is to be fixed 
        backPanel.add(threeText);
        backPanel.add(backPicture);
        this.add(backPanel);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new StepThree();
    }    
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String command = e.getActionCommand();
        if(command.equals("Let's move on to step four!"))
        {
            new StepFour();
        }
        else if(command.equals("Go back"))
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

    
    
    
    
    
    
  
