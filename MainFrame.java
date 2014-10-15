import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @author jonesj62
 * @version 1.0
 * @created 08-Oct-2014 5:47:54 PM
 */
public class MainFrame extends JFrame{

	private int[][] battleshipWinLoss;
	private int[][] hangmanWinLosss;
	private int[][] ticTacToeWinLoss;
	public SignInPanel m_SignInPanel;
	public CreateAccountPanel m_CreateAccountPanel;
	public GameHistoryPanel m_GameHistoryPanel;
	public MainMenuPanel m_MainMenuPanel;
	public Player m_Player;
	public Game m_Game;

	public MainFrame(){
		Dimension screenRes = Toolkit.getDefaultToolkit().getScreenSize();

		
		//make it so the atm can only be closed using the file option
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setVisible(true);

		//make the size of the frame 3/4th the size the screen
		setLayout(new BorderLayout());
		setSize((int)(screenRes.width*.75), (int)(screenRes.height*.75));
		setLocationRelativeTo(null);
		setResizable(false);
	}

	public void finalize() throws Throwable {

	}
}//end MainFrame