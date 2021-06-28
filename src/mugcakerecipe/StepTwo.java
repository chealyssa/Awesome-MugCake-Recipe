/*
Alyssa, INIT 2022
This is step two
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

public class StepTwo extends JFrame implements ActionListener
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
    private JLabel twoText;
    private JButton nextButton;
    private JButton ingredientsButton;
    private JButton backButton;
    private JPanel buttonPanel;
    private JLabel backPicture;
    private JPanel backPanel;      
    
    public StepTwo()
    {
        super("Step two to completing your awesome mugcake!");
        // constructing frame size 
        // FIX IF NEEDED
        this.setBounds(0, 0, 3100, 870);
        // close operation
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel backPanel = new JPanel();   
        
        LayoutManager overlay = new OverlayLayout(backPanel);
        backPanel.setLayout(overlay);   
        // Constructing intro text
        this.twoText = new JLabel("<html><center>"
                + "Step Two! <br>"
                + "Whisk in milk and vegetable oil until all the ingredients "
                + "are combined and with no clumps in sight. <br>"
                + "<br>"
                + "It is perfectly fine to over-whisked!"
                + "</center><html>", SwingConstants.CENTER); 
        
        twoText.setFont(RECIPE_FONT);
        twoText.setForeground(FONT_COLOR);
        
        // constructing picture as background
        this.backPicture = new JLabel(RECIPE_BACKGROUND);
        
        // constructing buttons
        this.backButton = new JButton("Go back");
        backButton.addActionListener(this);
        this.ingredientsButton = new JButton("Ingredients list");
        ingredientsButton.addActionListener(this);
        this.nextButton = new JButton("Let's move on to step three!");
        nextButton.addActionListener(this);
        
        // Constructing panel
        this.buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(PANEL_COLOR);
        buttonPanel.add(backButton);
        buttonPanel.add(ingredientsButton);       
        buttonPanel.add(nextButton);
        
        // adding elements to frame !! this is to be fixed 
        backPanel.add(twoText);
        backPanel.add(backPicture);
        this.add(backPanel);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new StepTwo();
    }    
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String command = e.getActionCommand();
        if(command.equals("Let's move on to step three!"))
        {
            new StepThree();
        }
        else if(command.equals("Go back"))
        {
            new StepOne();
        }
        else if(command.equals("Ingredients list"))
        {
            new IngredientList();
        }
        this.validate();
        this.repaint();  
    }
    
}
