//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private double speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   super(x,y);
	}

	public Ship(int x, int y, double s)
	{
	   super(x,y);
	   setSpeed(s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("\\ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}


	public void setSpeed(double s)
	{
	   speed=s;
	}

	public double getSpeed()
	{
	   return speed;
	}
	
	public void setPos( int x, int y)
	{
		setX((double)x);
		setY((double)y);
	}

	public void move(String direction)
	{
		if(direction.equals("LEFT")){
            setX(getX()-getSpeed());
        }
        else if(direction.equals("RIGHT")){
            setX(getX()+getSpeed());
        }
        else if(direction.equals("UP")){
            setY(getY()+getSpeed());
        }
        else if(direction.equals("DOWN")){
            setY(getY()-getSpeed());
        }
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,(int)getX(),(int)getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}