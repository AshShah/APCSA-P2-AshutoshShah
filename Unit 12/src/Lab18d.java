//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.ArrayList;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.dat"));
		ArrayList<Word> collection= new ArrayList<Word>();
		int size = file.nextInt();
		file.nextLine();
		while (file.hasNextLine())
		{
			collection.add(new Word(file.nextLine()));
		}
		for(int z=0; z<collection.size();z++)
		{
			for(int i=0;i<collection.size()-1; i++)
			{
				if(collection.get(i).compareTo(collection.get(i+1))==1)
				{
					Word temp=collection.get(i);
					collection.set(i, collection.get(i+1));
					collection.set(i+1, temp);
				}
			}
		}
		for(int j=0;j<collection.size();j++)
		{
			System.out.println(collection.get(j));
		}
	}
}