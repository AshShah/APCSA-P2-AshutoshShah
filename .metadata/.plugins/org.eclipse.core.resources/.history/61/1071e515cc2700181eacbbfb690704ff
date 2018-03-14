//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	//private double[] grades;
	private ArrayList<Double> grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner keyboard= new Scanner (gradeList);
		int x= keyboard.nextInt();
		//grades=new double[x];
		grades= new ArrayList<Double>();
		keyboard.next();
		for(int i=0; i<x;i++)
		{
			//grades[i]=keyboard.nextDouble();
			grades.add(i, keyboard.nextDouble());
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		//grades[spot]=grade;
		grades.set(spot, grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
		//for(int j=0;j<grades.length;j++)
		for(int j=0;j<grades.size();j++)
		{
			//sum=sum+grades[j];
			sum=sum+grades.get(j);
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		//for(int z=0;z<grades.length;z++)
		for(int z =0; z<grades.size();z++)
		{
			//if(grades[z]<low)
			if(grades.get(z)<low)
			{
				//low=grades[z];
				low=grades.get(z);
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		//for(int z=0;z<grades.length;z++)
		for(int z=0; z<grades.size();z++)
		{
			//if(grades[z]>high)
			if(grades.get(z)>high)
			{
				//high=grades[z];
				high=grades.get(z);
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		//return grades.length;
		return grades.size();
	}
	
	public String toString()
	{
		//String output= grades + "\n" + "Sum = " + getSum() +"\n" + "num grades = " + getNumGrades() + "\n" + "low grade = " + getLowGrade() + "\n" + "high grade = " + getHighGrade() +"\n";
		//String output=Arrays.toString(grades);
		String output= "";
		for(int i=0;i<grades.size();i++)
		{
			output= output+grades.get(i);
		}
		return output;
	}	
}