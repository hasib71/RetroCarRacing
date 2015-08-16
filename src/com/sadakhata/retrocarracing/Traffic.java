package com.sadakhata.retrocarracing;

public class Traffic extends Thread {
	
	Car[] cars;
	Car user;
	GameBoard board;
	
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
				System.out.println("Game Over");
				break;
			}
			
			try{
				Thread.sleep(2);
			}catch(Exception ex)
			{
				
			}
		}
	}
	
	
	public boolean checkCollision()
	{
		boolean isCollide = false;
		
		for(int i=0; i<cars.length; i++)
		{
			
		}
		
		
		return isCollide;
	}

}
