//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle(letter, size);
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		size=sz;
		letter=let;
	}

	public String getLetter()
	{
		int iterations=0;
		String output="";
		while(iterations<size)
		{
			for(int i=0; i<size-iterations;i++)
			{
				output= output + " ";
			}
			for(int i=0; i<iterations;i++)
			{
				output= output + letter;
			}
			output=output+"\n";
			iterations++;
		}
		return output;
	}

	public String toString()
	{
		String output= getLetter();
		return output+"\n";
	}
}