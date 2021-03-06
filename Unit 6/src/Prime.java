//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		setPrime(number);

	}

	public Prime(int num)
	{
		setPrime(num);

	}

	public void setPrime(int num)
	{
		number=num;

	}

	public boolean isPrime()
	{
		for(int i=2; i<number;i++)
		{
			if(number%i==0)
			{
				return true;
			}
		}
		return false;
	}

	public String toString()
	{
		String output="is a prime number";
		if(isPrime()==true)
		{
			return number + " " + "is not a prime number";
		}
		return number + " " + output;
	}
}