import java.awt.BorderLayout;
import java.awt.Color;



/**
 * @author Jacob
 * @version 1.0
 * @created 09-Oct-2014 12:42:12 AM
 */
public class AppMain {

	public AppMain(){

	}

	public void finalize() throws Throwable {

	}
	public static void main(String[] args){
		MainFrame frame = new MainFrame();
		MainMenuPanel mainMenu = new MainMenuPanel(frame);
		mainMenu.setBackground(Color.BLACK);
		frame.add(mainMenu, BorderLayout.CENTER);
		frame.revalidate();
	}
}//end AppMain