//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private ArrayList<Alien> aliens;
	private boolean left = true;
	private boolean right = true;
	
	public AlienHorde(int size)
	{
		int x = 50;
		int y = 100;
		aliens = new ArrayList<Alien>();
		for(int i = 0; i<size; i++)
		{
			aliens.add(i, new Alien(x, y, 40, 40, 1));
			x+=100;
			if(x>=700)
			{
				x=50;
				y+=50;
			}
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i<aliens.size(); i++)
		{
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		double x=1;
		for(int i = 0; i<aliens.size(); i++)
		{
			if(aliens.get(i).getX()>=780-aliens.get(i).getWidth() && right == true){
				right = false;
				left = true;
				for(int j = 0; j<aliens.size(); j++)
				{
					x+=0.4;
					aliens.get(j).setSpeed(10+x);
					aliens.get(j).move("UP");
					aliens.get(j).setSpeed(x);
				}
				break;
			}
			else if(aliens.get(i).getX()<=1){
				left = false;
				right = true;
				for(int j = 0; j<aliens.size(); j++)
				{
					x+=0.4;
					aliens.get(j).setSpeed(10+x);
					aliens.get(j).move("UP");
					aliens.get(j).setSpeed(x);
				}
				break;
			}

		}
		for(int i = 0; i<aliens.size(); i++){
			if(right == true){
				aliens.get(i).move("RIGHT");
			}
			else if(left == true){
				aliens.get(i).move("LEFT");
			}
		}
	}

	public Ammo removeDeadOnes(List<Ammo> ammo)
	{
		for(int j = aliens.size()-1; j>=0; j--){
			for(int i = 0; i<ammo.size(); i++){
				if(right == true){
					if(ammo.get(i).getX()+ammo.get(i).getWidth()+ammo.get(i).getSpeed() > aliens.get(j).getX() && ammo.get(i).getX()+ammo.get(i).getSpeed() < aliens.get(j).getX()+aliens.get(j).getWidth()
							&& ammo.get(i).getY() <= aliens.get(j).getY()+aliens.get(j).getHeight() && ammo.get(i).getY()-ammo.get(i).getHeight() >= aliens.get(j).getY()){
						aliens.remove(j);
						return ammo.get(i);
					}
				}
				else if(left == true){
					if(ammo.get(i).getX()+ammo.get(i).getWidth()-ammo.get(i).getSpeed() > aliens.get(j).getX() && ammo.get(i).getX()-ammo.get(i).getSpeed() < aliens.get(j).getX()+aliens.get(j).getWidth()
							&& ammo.get(i).getY() <= aliens.get(j).getY()+aliens.get(j).getHeight() && ammo.get(i).getY()-ammo.get(i).getHeight() >= aliens.get(j).getY()){
						aliens.remove(j);
						return ammo.get(i);
					}
				}
			}
		}
		return null;
	}

	public String toString()
	{
		return "";
	}
	
	public List<Alien> getList() 
	{
		return aliens;
	}
}