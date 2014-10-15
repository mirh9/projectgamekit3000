import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * @author jonesj62
 * @version 1.0
 * @created 08-Oct-2014 5:47:54 PM
 */
public class MainMenuPanel extends JPanel
{

	private JFrame frame;
	private JLabel menuTitle;
	private JButton battleshipButton;
	private JButton gameHistoryButton;
	private JButton hangmanButton;
	private JButton signOutButton;
	private JButton ticTacToeButton;

	public MainMenuPanel(MainFrame frame){
		JPanel tempPanel = new JPanel();
		
		GridBagLayout gridBag = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		
		tempPanel.setLayout(gridBag);
		tempPanel.setBackground(Color.BLACK);
		
		this.frame = frame;
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 3;
		constraints.fill = GridBagConstraints.CENTER;
		//create the title to be displayed. Set the size of the font used to be larger than default
		menuTitle = new JLabel("Game Kit 3000");
		menuTitle.setFont(menuTitle.getFont().deriveFont(50f));
		menuTitle.setForeground(Color.YELLOW);
		tempPanel.add(menuTitle,constraints);
		
		//Resizes the components when they do not completely fill their provided spaces
		constraints.fill = GridBagConstraints.BOTH;
		
		battleshipButton = new JButton();
		Image battleshipPic = null;
		try {
			battleshipPic = ImageIO.read(getClass().getResource("Images/battleship.bmp"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		battleshipButton.setSize(new Dimension(250,250));
		battleshipButton.setIcon(new ImageIcon(battleshipPic));
		battleshipButton.setBorder(null);
		ActionListener listener1 = new StartGameListener(1);
		battleshipButton.addActionListener(listener1);
		battleshipButton.setBackground(Color.BLACK);
		
		hangmanButton = new JButton();
		Image hangmanPic = null;
		try {
			hangmanPic = ImageIO.read(getClass().getResource("Images/hangman.bmp"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hangmanButton.setSize(new Dimension(250,250));
		hangmanButton.setIcon(new ImageIcon(hangmanPic));
		hangmanButton.setBorder(null);
		hangmanButton.setBackground(Color.BLACK);
		ActionListener listener2 = new StartGameListener(2);
		hangmanButton.addActionListener(listener2);
		
		ticTacToeButton = new JButton();
		Image ticTacToePic = null;
		try {
			ticTacToePic = ImageIO.read(getClass().getResource("Images/TicTacToe.bmp"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ticTacToeButton.setSize(new Dimension(500,150));
		ticTacToeButton.setIcon(new ImageIcon(ticTacToePic));
		ticTacToeButton.setBorder(null);
		ticTacToeButton.setBackground(Color.BLACK);
		ActionListener listener3 = new StartGameListener(3);
		ticTacToeButton.addActionListener(listener3);
		
		gameHistoryButton = new JButton("Game History"); 
		gameHistoryButton.setSize(250,150);
		gameHistoryButton.setFont(gameHistoryButton.getFont().deriveFont(42f));
		
		signOutButton = new JButton("Sign Out");
		signOutButton.setSize(new Dimension(250,150));
		signOutButton.setFont(signOutButton.getFont().deriveFont(42f));
		
		//add vertical glues to center the panel into the middle of the screen
		//add all of the components with space between them
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		tempPanel.add(battleshipButton,constraints);
		constraints.gridx = 1;
		constraints.fill = GridBagConstraints.BOTH; //fill up entire space given to each component
		
		//black label for empty blank
		JLabel empty = new JLabel(); 
		empty.setBackground(Color.BLACK);
		tempPanel.add(empty,constraints);
		
		constraints.gridx = 2;
		tempPanel.add(hangmanButton,constraints);
		constraints.gridy = 2;
		constraints.gridx = 0;
		constraints.gridwidth = 3;
		tempPanel.add(ticTacToeButton,constraints);
		
		constraints.gridwidth = 1;
		constraints.gridx = 0;
		constraints.gridy = 4;
		tempPanel.add(gameHistoryButton,constraints);
		constraints.gridx = 2;
		tempPanel.add(signOutButton,constraints);
		add(tempPanel,BorderLayout.CENTER);
	}
	
	public class StartGameListener implements ActionListener
	{
		int option;
		
		public StartGameListener(int option)
		{
			this.option = option;
		}
		
		public void actionPerformed(ActionEvent arg0) 
		{
			if (option==1)
			{
				JOptionPane.showMessageDialog(null, "You picked Battleship!!!");
			}
			else if (option==2)
			{
				JOptionPane.showMessageDialog(null, "You picked Hangman!!!");
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "You picked Tic Tac Toe!!!");
			}
			
		}
	}
	

	public void finalize() throws Throwable {

	}
}//end MainMenuPanel