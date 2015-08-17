package com.sadakhata.retrocarracing;

import javax.swing.*;

public class GameWindow extends JFrame {
	
	GameBoard gb;
	
	public GameWindow()
	{
		gb = new GameBoard(this);
		this.add(gb);
		this.setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
		System.out.println("window height = " + this.getHeight());
		this.setLocationRelativeTo(null);
		this.setTitle(Settings.GAME_TITLE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	

}
