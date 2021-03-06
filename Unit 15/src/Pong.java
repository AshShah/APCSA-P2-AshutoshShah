//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private Wall top;
	private Wall bottom;
	private Wall left;
	private Wall right;
	private int rightscore = 0;
	private int leftscore = 0;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(600,200,10,10,Color.BLUE,3,2);


		leftPaddle = new Paddle(50,200,20,95,Color.RED,7);
		rightPaddle = new Paddle(730,200,20,95,Color.RED,7);

		top = new Wall(0, 0, 800, 10, Color.RED);
		bottom = new Wall(0, 551, 800, 10, Color.RED);
		left = new Wall(0, 10, 10, 541, Color.RED);
		right = new Wall(774, 10, 10, 541, Color.RED);
		
		rightscore = 0;
		leftscore = 0;
		
		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		graphToBack.setColor(Color.GRAY);
		graphToBack.drawString("Scores",350,60);
		graphToBack.drawString("Left: " + (leftscore), 250, 80);
		graphToBack.drawString("Right: " + (rightscore), 450, 80);
		
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		top.draw(graphToBack);
		bottom.draw(graphToBack);
		left.draw(graphToBack);
		right.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(ball.getX()<=0 && ball.getX()>=780)
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
		}

		
		//see if the ball hits the top or bottom wall 
		if((ball.getY()<=10 && ball.getY()>=790))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
		}

		if (ball.didCollideLeft(left) || ball.didCollideRight(right)){
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			
			if (ball.didCollideLeft(left)){
				rightscore += 1;
			}
			if (ball.didCollideRight(right)){
				leftscore += 1;
			}
			
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Left: " + (leftscore - 1), 250, 80);
			graphToBack.drawString("Right: " + (rightscore - 1), 450, 80);
			graphToBack.setColor(Color.GRAY);
			graphToBack.drawString("Left: " + (leftscore), 250, 80);
			graphToBack.drawString("Right: " + (rightscore), 450, 80);
		
			ball.draw(graphToBack, Color.WHITE);
			ball.setX(400);
			ball.setY(300);
			ball.setColor(Color.GRAY);
			
			ball.setXSpeed(3);
			ball.setYSpeed(1);
			
		}
		
		//see if the ball hits the left paddle
		if (ball.didCollideLeft(leftPaddle) || ball.didCollideRight(rightPaddle)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		if (ball.didCollideTop(top) || ball.didCollideBottom(bottom)){
			ball.setYSpeed(-ball.getYSpeed());
			
		}
		else if (ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle)){
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
			
			
		}
		else if (ball.didCollideTop(rightPaddle) || ball.didCollideBottom(rightPaddle)){
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
			
		}
		
		
		//see if the ball hits the right paddle


		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		twoDGraph.drawImage(back, null, 0, 0);
		
		if(leftscore==21||rightscore==21)
		{
			if(leftscore==21)
			{
				graphToBack.drawString("Left team wins!", 350, 120);
			}
			else if(rightscore==21)
			{
				graphToBack.drawString("Right team wins!", 350, 80);
			}
		}
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}