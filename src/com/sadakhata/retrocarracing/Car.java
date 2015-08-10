package com.sadakhata.retrocarracing;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Car {
	
	private String imagePath = "assets/images/car.png";
	
	private int posX, posY;
	
	
	public Car(int posX, int posY)
	{
		this.posX = posX;
		this.posY = posY;
	}
	
	
	public void moveLeft()
	{
		this.posX = Settings.LEFT_X;
	}
	
	public void moveRight()
	{
		this.posX = Settings.RIGHT_X;
	}
	
	
	
	public void draw(Graphics g)
	{
		ImageIcon img = new ImageIcon(imagePath);
		g.drawImage(img.getImage(), posX, posY, null);
	}

}
