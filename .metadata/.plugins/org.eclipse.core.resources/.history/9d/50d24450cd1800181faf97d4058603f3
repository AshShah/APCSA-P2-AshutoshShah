//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int random;
	private int percent;
	private int attempts;
	private int guess;
	public GuessingGame(int stop)
	{
		upperBound=stop;
		playGame();
	}

	public void playGame()
	{	
		guess=0;
		random= (int) (Math.random()*upperBound+1);
		while(guess != random)
		{
			System.out.println("Choose a number between 1 and " + upperBound);
			Scanner input= new Scanner(System.in);
			guess= input.nextInt();
			if (guess > upperBound)
			{
				System.out.println("Please enter a number that exists within the given interval.");
			}
			attempts++;
		}
		
		double upper = attempts-1;
		double lower= attempts;
		percent = (int) ((upper/lower)*100);
	}
	public String toString()
	{
		String output="It took you " + attempts + " " + "tries to guess " + random + "\n" + "You were incorrect in your guessing " + percent + " " + "percent of the time.";
		return output;
	}
}