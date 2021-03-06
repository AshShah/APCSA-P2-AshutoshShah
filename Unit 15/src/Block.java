//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos=0;
		yPos=0;
		width=0;
		height=0;
		color=Color.WHITE;
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y)
	{
		setPos(x,y);
	}
	
	public Block(int x, int y, Color col)
	{
		xPos=x;
		yPos=y;
		color=col;
	}
	
	public Block(int x, int y, int wth)
	{
		setPos(x,y);
		setWidth(wth);
	}
	
	public Block(int x, int y, int wth, int ht)
	{
		setPos(x,y);
		setWidth(wth);
		setHeight(ht);
		color=Color.BLACK;
	}
	
	public Block(int x, int y, int wth, int ht, Color col)
	{
		setPos(x,y);
		setWidth(wth);
		setHeight(ht);
		setColor(col);
	}
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color=col;
   }

   public void setHeight(int ht)
   {
	   height=ht;
   }
   
   public void setWidth(int wth)
   {
	   width=wth;
   }
   
   public void setPos(int x, int y)
   {
	   xPos=x;
	   yPos=y;
   }
   
   public void setX(int x)
   {
	   xPos=x;
   }
   
   public void setY(int y)
   {
	   yPos=y;
   }
   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		Block rhs=(Block) obj;
		if(rhs.getX()!=xPos)
		{
			return false;
		}
		else if(rhs.getY()!=yPos)
		{
			return false;
		}
		else if(rhs.getHeight()!=height)
		{
			return false;
		}
		else if(rhs.getWidth()!=width)
		{
			return false;
		}
		else if(rhs.getColor()!=color)
		{
			return false;
		}
		else
		{
			return true;
		}
	}   

   //add the other get methods
	public Color getColor()
	{
		return color;
	}

	public int getHeight()
	{
		return height;
	}
	   
	public int getWidth()
	{
		return width;
	}
	   
	public int getX()
	{
		return xPos;
	}
	   
	public int getY()
	{
		return yPos;
	}
   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		String output="";
		output=output + getX()+", " + getY()+ ", " + getWidth()+ ", " + getHeight()+ ", " + getColor();
		return output;
	}
}