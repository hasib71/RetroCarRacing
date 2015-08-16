package com.sadakhata.retrocarracing;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GameBoard extends JPanel implements KeyListener {
	
	Car user = new Car(Settings.LEFT_X, Settings.WINDOW_HEIGHT - Settings.CAR_HEIGHT);
	
	Car[] otherCars = new Car[Settings.TOTAL_TRAFIC];
	
	Traffic traffic;
	
	public GameBoard()
	{
		super();
		
		for(int i=0; i<otherCars.length; i++)
		{
			otherCars[i] = new Car(0, -(Settings.CAR_HEIGHT + Settings.GAP_BETWEEN_CARS )*(i+1));
			
			if(Math.random() < 0.5)
			{
				otherCars[i].moveLeft();
			}
			else
			{
				otherCars[i].moveRight();
			}
			
		}
		
		traffic = new Traffic(otherCars, user, this);
		
		traffic.start();
		
		addKeyListener(this);
		setFocusable(true);
	}
	
	public void paint(Graphics g)
	{
		ImageIcon background = new ImageIcon(Settings.BACKGROUN_IMAGE_PATH);
		g.drawImage(background.getImage(), 0, 0, null );
		user.draw(g);
		
		for(int i=0; i<otherCars.length; i++)
		{
			otherCars[i].draw(g);
		}
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
