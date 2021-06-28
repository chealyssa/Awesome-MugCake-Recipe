/*
Alyssa, INIT 2022
This is the ingredients list.
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

public class IngredientList extends JFrame implements ActionListener
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
    private JLabel ingredientsText;
    private JButton startBakingButton;
    private JPanel buttonPanel;
    private JLabel backPicture;
    private JPanel backPanel;
    
    public IngredientList()
    {
        super("List of ingredients used in this recipe! ");
        // constructing frame size 
        // FIXED
        this.setBounds(0, 0, 3100, 870);
        // close operation
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel backPanel = new JPanel();
        
        LayoutManager overlay = new OverlayLayout(backPanel);
        backPanel.setLayout(overlay);   
        // Constructing intro text
        this.ingredientsText = new JLabel("<html><center>"
                + "1/4 Cup Flour (DRY) <br>"
                + "2 Tablespoon unsweetened cocoa powder (DRY) <br>"
                + "1/4 Teaspoon baking powder (DRY) <br>"
                + "1 Tablespoon sugar (DRY) <br>"
                + "1/8 teaspoon salt (DRY) <br>"
                + "1/4 Cup + 1 Tablespoon Milk <br>"
                + "2 Tablespoon vegetable oil <br>"
                + "3 Tablespoon chocolate spread <br>" 
                + "</center><html>", SwingConstants.CENTER);   
        
        ingredientsText.setFont(RECIPE_FONT);
        ingredientsText.setForeground(FONT_COLOR);
        
        // constructing picture as background
        this.backPicture = new JLabel(RECIPE_BACKGROUND);
        
        // constructing button to start
        this.startBakingButton = new JButton("Lets start baking!");
        startBakingButton.addActionListener(this);
        
        // Constructing panel
        this.buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(PANEL_COLOR);
        buttonPanel.add(startBakingButton);    
        
        // adding elements to frame !! this is to be fixed 
        backPanel.add(ingredientsText);
        backPanel.add(backPicture);
        this.add(backPanel);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        // Visible
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new IngredientList();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String command = e.getActionCommand();
        if(command.equals("Lets start baking!"))
        {
            new StepOne();
        }
        this.validate();
        this.repaint();
    }   
}

    
    
    
    
    

