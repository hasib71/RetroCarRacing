package com.sadakhata.retrocarracing;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GameBoard extends JPanel implements KeyListener {
	
	Car user = new Car(25, 25);
	
	
	public GameBoard()
	{
		super();
		
		
		
		addKeyListener(this);
		setFocusable(true);
	}
	
	public void paint(Graphics g)
	{
		ImageIcon background = new ImageIcon(Settings.BACKGROUN_IMAGE_PATH);
		g.drawImage(background.getImage(), 0, 0, null );
		user.draw(g);
	}
	
	
	

	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		
		if(event.getKeyCode() == event.VK_LEFT)
		{
			user.moveLeft();
		}
		else if(event.getKeyCode() == event.VK_RIGHT)
		{
			user.moveRight();
		}
		
		
		
		this.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
