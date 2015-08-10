import javax.swing.JFrame;

import com.sadakhata.retrocarracing.*;


public class Main {
	
	public static void main(String[] args)
	{
		JFrame window = new JFrame();
		
		GameBoard gb = new GameBoard();
		
		window.add(gb);
		
		window.setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		window.setLocation(50, 50);
		window.setTitle(Settings.GAME_TITLE);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}

}
