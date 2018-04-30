//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Moveable
{
	private double xPos;
	private double yPos;
	private int width;
	private int height;

	public MovingThing()
	{
		xPos = 10;
		yPos = 10;
		width = 10;
		height = 10;
	}

	public MovingThing(double x, double y)
	{
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
	}

	public MovingThing(int x, int y, int w, int h)
	{
		xPos=x;
		yPos=y;
		width=w;
		height=h;
	}

	public void setPos( double x, double y)
	{
		setX(x);
		setY(y);
	}

	public void setX(double x)
	{
		xPos=x;
	}

	public void setY(double y)
	{
		yPos=y;
	}

	public double getX()
	{
		return xPos;   //finish this method
	}

	public double getY()
	{
		return yPos;  //finish this method
	}

	public void setWidth(int w)
	{
		width=w;
	}

	public void setHeight(int h)
	{
		height=h;
	}

	public int getWidth()
	{
		return width;  //finish this method
	}

	public int getHeight()
	{
		return height;  //finish this method
	}

	public abstract void move(String direction);
	public abstract void draw(Graphics window);

	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight();
	}
}