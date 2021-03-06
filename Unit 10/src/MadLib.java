//� A+ Computer Science  -  www.apluscompsci.com
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

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		try
		{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext())
			{
				String example = file.next();
				
				if(example.equals("@"))
				{
					out.print(getRandomVerb()+ " ");
				}
				else if(example.equals("#"))
				{
					out.print(getRandomNoun()+ " ");
				}
				else if(example.equals("&"))
				{
					out.print(getRandomAdjective()+ " ");
				}
				else
				{
					out.print(example + " ");
				}
			}	
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadNouns()
	{
		try
		{
			Scanner noun= new Scanner(new File("nouns.dat"));
					while(noun.hasNext())
					{
						nouns.add(noun.next());
					}
		}
		catch(Exception e)
		{
			out.println("noun issue");
		}	
	}
	
	public void loadVerbs()
	{
		try
		{
			//Scanner verb= new Scanner(new File("C:\\Users\\Shaha5249\\Desktop\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			Scanner verb= new Scanner(new File("verbs.dat"));
			while(verb.hasNext())
			{
				verbs.add(verb.next());
			}
		}
		catch(Exception e)
		{
			out.println("verb issue");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner adj= new Scanner(new File("adjectives.dat"));
			while(adj.hasNext())
			{
				adjectives.add(adj.next());
			}
		}
		catch(Exception e)
		{
			out.println("adjective issue");
		}
	}

	public String getRandomVerb()
	{
		int rand= (int) (Math.random()*(verbs.size()-1));
		String verb=verbs.get(rand);
		return verb;
	}
	
	public String getRandomNoun()
	{
		int rand= (int) (Math.random()*(nouns.size()-1));
		String noun=nouns.get(rand);
		return noun;
	}
	
	public String getRandomAdjective()
	{
		int rand= (int) (Math.random()*(adjectives.size()-1));
		String adj=adjectives.get(rand);
		return adj;
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}