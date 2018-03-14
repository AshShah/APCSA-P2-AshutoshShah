//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		Scanner file = new Scanner(new File("gradebook.dat"));
		String name= file.nextLine();
		int size=file.nextInt();
		file.nextLine();
		Class myClass= new Class(name, size);
		for(int i=0; i<size;i++)
		{
			String stuName=file.nextLine();
			String grade= file.nextLine();
			myClass.addStudent(i, new Student(stuName, grade));
		}
		myClass.sort();
		System.out.println(myClass +"\n\n");
		
		out.println("Failure List = " + myClass.getFailureList(70));	
		out.println("Highest Average = " + myClass.getStudentWithHighestAverage());
		out.println("Lowest Average = " + myClass.getStudentWithLowestAverage());						
		out.println(String.format("Class Average = %.2f",myClass.getClassAverage()));
	}		
}