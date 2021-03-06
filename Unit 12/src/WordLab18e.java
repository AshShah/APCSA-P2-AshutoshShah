//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordLab18e implements Comparable<WordLab18e>
{
	private String word;

	public WordLab18e( String s)
	{
		word=s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		System.out.println(word);
		for(int i=0; i<word.length();i++)
		{
			for(int j=0; j<vowels.length();j++)
			{
				if(word.charAt(i)==vowels.charAt(j))
				{
					vowelCount++;
				}
			}
		}
		System.out.println(vowelCount);
		return vowelCount;
	}

	public int compareTo(WordLab18e rhs)
	{
		WordLab18e s=(WordLab18e) rhs;
		if(this.numVowels()>s.numVowels())
		{
			return 1;
		}
		else if(this.numVowels()<s.numVowels())
		{
			return -1;
		}
		else
		{
				if (word.compareTo(s.toString())>0)
				{
					return 1;
				}
				else if(word.compareTo(s.toString())<0)
				{
					return -1;
				}
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}