import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.imageio.ImageIO;

public class Alien1 extends MovingThing
{
	private double speed;
	private Image image;

	public Alien1()
	{
		this(0,0,30,30,0);
	}

	public Alien1(int x, int y)
	{
		super(x,y);
	}

	public Alien1(int x, int y, double s)
	{
		super(x,y);
		setSpeed(s);
	}

	public Alien1(int x, int y, int w, int h, double s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			URL url = getClass().getResource("\\NPMoinsunepatate.jpg");
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
