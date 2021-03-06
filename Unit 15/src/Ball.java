//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200,Color.BLACK);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y)
	{
		super(x,y,Color.BLACK);
		xSpeed=3;
		ySpeed=1;
	}
	//add the other Ball constructors
	
	public Ball(int x, int y, int wth, int ht)
	{
		super(x,y,wth,ht);
		xSpeed=3;
		ySpeed=1;
	}
	
	public Ball(int x, int y, int wth, int ht, Color col)
	{
		super(x,y,wth,ht,col);
		xSpeed=3;
		ySpeed=1;
	}
	
	public Ball(int x, int y, int wth, int ht, Color col, int xspd)
	{
		super(x,y,wth,ht,col);
		xSpeed = xspd;
		ySpeed=1;
	}
	
	public Ball(int x, int y, int wth, int ht, Color col, int xspd, int yspd)
	{
		super(x,y,wth,ht);
		setXSpeed(xspd);
		setYSpeed(yspd);
	}
	
   //add the set methods
	
	public void setXSpeed(int xspd)
	{
		xSpeed=xspd;
	}
	
	public void setYSpeed(int yspd)
	{
		ySpeed=yspd;
	}
	
    public void moveAndDraw(Graphics window)
    {
   	//draw a white ball at old ball location
    	draw(window, Color.WHITE);
      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window);
    }
   
	public boolean equals(Object obj)
	{
		Ball rhs=(Ball) obj;
		if((rhs.getX()==getX())&&(rhs.getY()==getY())&&(rhs.getHeight()==getHeight())&&(rhs.getWidth()==getWidth())&&(rhs.getColor()==getColor())&&(rhs.getXSpeed()==getXSpeed())&&(rhs.getYSpeed()==getYSpeed()))
		{
			return true;
		}
		
		return false;
	}   

   //add the get methods
	
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
	public boolean didCollideLeft(Object obj){
		Block ob = (Block) obj;
		if (getX() > ob.getX() && getX() <= ob.getX() + ob.getWidth() && (getY() >= ob.getY() && getY() + getHeight() <= ob.getY() + ob.getHeight())){
			return true;
		}
		return false;
	}
	public boolean didCollideRight(Object obj){
		Block ob = (Block)obj;
		if (getX() < ob.getX() && getX() + getWidth() >= ob.getX() && (getY() >= ob.getY() && getY() + getHeight() <= ob.getY()+ob.getHeight())){
			return true;
		}
		return false;
	}
	public boolean didCollideTop(Object obj){
		Block ob = (Block)obj;
		if (getY()+getHeight() >= ob.getY() && getY() < ob.getY()+ob.getHeight() && (getX()>=ob.getX() && getX()+getWidth()<=ob.getX()+ob.getWidth())){
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj){
		Block ob = (Block)obj;
		if (getY() <= ob.getY()+ob.getHeight() && getY()+getHeight() > ob.getY() && (getX()>=ob.getX() && getX()+getWidth()<=ob.getX()+ob.getWidth())){
			return true;
		}
		return false;
	}
   //add a toString() method
	
	public String toString()
	{
		String output="";
		output=output + getX()+", " + getY()+ ", " + getWidth()+ ", " + getHeight()+ ", " + getColor() + " " + getXSpeed()+", " + getYSpeed();
		return output;
	}
}