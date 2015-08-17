package com.sadakhata.retrocarracing;

import javax.swing.*;

public class GameWindow extends JFrame {
	
	GameBoard gb;
	
	public GameWindow()
	{
		gb = new GameBoard(this);
		this.add(gb);
		
		this.setTitle(Settings.GAME_TITLE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	

}
