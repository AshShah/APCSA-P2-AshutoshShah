//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan= new Scanner(new File("lab21i.dat"));
		Maze test;
		int size;
		while(scan.hasNextLine())
		{
			size=scan.nextInt();
			scan.nextLine();
			test=new Maze(size,scan.nextLine());
			System.out.println(test);
		}
	}
}