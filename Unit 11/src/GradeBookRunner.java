//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		Scanner keyboard = new Scanner(System.in);
		out.print("\n Enter class name.");
		String name= keyboard.nextLine();
		out.print("\n Enter student total");
		int num=keyboard.nextInt();
		
		keyboard.nextLine();
		Class myClass= new Class(name,num);
		int studentNum=1;
		
		while (studentNum<=num)
		{
			System.out.println("Enter the name of the student: ");
			Scanner student= new Scanner(System.in);
			String stuName= student.nextLine();
			System.out.println("Enter the grades for the student as number of grades - grade grade grade etc.");
			Scanner grades= new Scanner(System.in);
			String stuGrades= grades.nextLine();
			System.out.println(stuGrades);
			myClass.addStudent(studentNum-1, new Student(stuName, stuGrades));
			studentNum++;
		}
		
		System.out.println(myClass);
		
		out.println("Failure List = " + myClass.getFailureList(70));	
		out.println("Highest Average = " + myClass.getStudentWithHighestAverage());
		out.println("Lowest Average = " + myClass.getStudentWithLowestAverage());						
		out.println(String.format("Class Average = %.2f",myClass.getClassAverage()));
	}		
}
