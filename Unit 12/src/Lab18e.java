//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
		public static void main( String args[] ) throws IOException
		{
			Scanner file = new Scanner(new File("lab18e.dat"));
			ArrayList<WordLab18e> collection= new ArrayList<WordLab18e>();
			int size = file.nextInt();
			file.nextLine();
			while (file.hasNextLine())
			{
				collection.add(new WordLab18e(file.nextLine()));
			}
			for(int z=0; z<collection.size();z++)
			{
				for(int i=0;i<collection.size()-1; i++)
				{
					if(collection.get(i).compareTo(collection.get(i+1))==1)
					{
						WordLab18e temp=collection.get(i);
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