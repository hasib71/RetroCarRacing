package com.sadakhata.retrocarracing;

import javax.swing.JOptionPane;

public class Traffic extends Thread {
	
	Car[] cars;
	Car user;
	GameBoard board;
	
	int points = 0;
	
	public Traffic(Car []cars, Car user, GameBoard board )
	{
		this.cars = cars;
		this.user = user;
		this.board = board;
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			for(int i=0; i<cars.length; i++)
			{
				if(cars[i].getY() > Settings.WINDOW_HEIGHT)
				{
					points++;
					
					int y = cars[i].getY();
					
					y = y - Settings.TOTAL_TRAFIC * (Settings.CAR_HEIGHT + Settings.GAP_BETWEEN_CARS);
					
					cars[i].setY(y);
					
				
					if(Math.random() <= 0.5)
					{
						cars[i].moveLeft();
					}
					else
					{
						cars[i].moveRight();
					}
				}
				else
				{
					cars[i].setY(cars[i].getY() + 1);
				}
			}
			
			board.repaint();
			
			if(checkCollision())
			{
				board.isCrashed = true;
				JOptionPane.showMessageDialog(null, "Game Over. Your point is " + points );
				board.restartGame();
				break;
			}
			
			try{
				int sleepTime = 6 - points/10;
				if(sleepTime <= 0)
				{
					sleepTime = 1;
				}
				Thread.sleep(sleepTime);
				//Thread.sleep(2);
			}catch(Exception ex)
			{
				
			}
		}
	}
	
	
	public boolean checkCollision()
	{

		for(int i=0; i<cars.length; i++)
		{
			Car other = cars[i];
			
			if(other.getX() == user.getX())
			{
				if(other.getY() > user.getY())
				{
					int d = other.getY() - user.getY();
					
					if(d < (Settings.CAR_HEIGHT - 20))
					{
						return true;
					}
				}
				else
				{

					int d = user.getY() - other.getY();
					
					if(d < (Settings.CAR_HEIGHT - 25))
					{
						return true;
					}
				}
			}
		}
		
		
		return false;
		
	}

}
