//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;
	private String direc=System.getProperty("user.dir");

	public Histogram()
	{
		count=new ArrayList<Integer>();
		letters=new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName)
	{
		count=new ArrayList<Integer>();
		letters=new ArrayList<Character>();
		for (int x=0; x<values.length;x++)
		{
			letters.add(values[x]);
		}
		out.println("search letters = "+letters);
		fileName=direc + "\\src\\" +fName;
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		for(int z=0;z<letters.size();z++)
		{
			count.add(0);
		}
		Scanner doc=new Scanner(new File(fileName));
		while(doc.hasNext())
		{
			String example=doc.next();
			for(int w=0;w<test.length();w++)
			{
				for(int q=0;q<letters.size();q++)
				{
					if(test.CharAt(w)==(letters.get(q)))
					{
						count.set(q,count.get(q)+1);
					}
				}	   
			}
		}	
	}

	public char mostFrequent()
	{
		int current=0;
		for(int d=0;d<count.size();d++)
		{
			if(count.get(d)>count.get(current))
			{
				current=d;
			}
			
		}
		return letters.get(current);
	}

	public char leastFrequent()
	{
		int crrnt=0;
		for(int p=0;p<count.size();p++)
		{
			if(count.get(p)<count.get(crrnt))
			{
				crrnt=p;
			}
			
		}
		return letters.get(crrnt);
	}

	public String toString()
	{
	   return fileName + "\n" + letters + "\n" + count + "\n\n\n";
	}
}
