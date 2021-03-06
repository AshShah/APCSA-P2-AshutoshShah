//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word=s;
	}

	public int compareTo( Word rhs )
	{
		String s=rhs.toString();
		if(word.length()>s.length())
		{
			return 1;
		}
		else if(word.length()<s.length())
		{
			return -1;
		}
		else
		{
			for(int i=0; i<word.length();i++)
			{
				if (word.compareTo(s)>0)
				{
					return 1;
				}
				else if(word.compareTo(s)<0)
				{
					return -1;
				}
			}
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}