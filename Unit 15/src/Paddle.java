//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10,Color.BLACK);
	   speed =5;
   }
   
   public Paddle(int x, int y)
   {
	   super(x,y,Color.BLACK);
	   speed=5;
   }
   
   public Paddle(int x, int y, int spd)
   {
	   super(x,y,Color.BLACK);
	   speed=spd;
   }
   
   public Paddle(int x, int y, int wth, int ht, int spd)
   {
	   super(x,y,wth,ht,Color.BLACK);
	   speed=spd;
   }

   public Paddle(int x, int y, int wth, int ht, Color col, int spd)
   {
	   super(x,y,wth,ht,col);
	   speed=spd;
   }

   //add the other Paddle constructors










   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY()-speed);
	   draw(window, Color.BLACK);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY()+speed);
	   draw(window, Color.BLACK);
   }

   //add get methods
   public int getSpeed()
   {
	   return speed;
   }
   
   //add a toString() method
   public String toString()
   {
	   String output="";
		output=output + getX()+", " + getY()+ ", " + getWidth()+ ", " + getHeight()+ ", " + getColor() + " " + getSpeed();
		return output;
   }
}