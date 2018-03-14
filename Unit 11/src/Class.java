//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String Name;
	//private Student[] studentList;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		Name="";
		//studentList=new Student[0];
		studentList= new ArrayList<Student>(0);
	}
	
	public Class(String name, int stuCount)
	{
		Name=name;
		//studentList=new Student[stuCount];
		studentList= new ArrayList<Student>(stuCount);
	}
	
	public void addStudent(int stuNum, Student s)
	{
		//studentList[stuNum]=s;
		studentList.add(stuNum, s);

	}
	
	public String getClassName()
	{
	   return Name;	
	}
	
	public double getClassAverage()
	{
		double sum=0.0;
		//double size=studentList.length;
		double size=studentList.size();
		//for(int k=0;k<studentList.length;k++)
		for(int k=0;k<studentList.size();k++)
		{
			//sum+=studentList[k].getAverage();
			sum+=studentList.get(k).getAverage();
		}
		double classAverage=sum/size;

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		//return studentList[stuNum].getAverage();
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		double average=0;
		//for(int j=0;j<studentList.length;j++)
		for(int j=0; j<studentList.size();j++)
		{
			//if(studentList[j].getName().equals(stuName))
			if((studentList.get(j).getName()).equals(stuName))
			{
				//average = studentList[j].getAverage();
				average= studentList.get(j).getAverage();
			}
		}
		return average;
	}
	
	public String getStudentName(int stuNum)
	{
		//return studentList[stuNum].getName();
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		//for (int z=0; z<studentList.length;z++)
		for(int z=0;z<studentList.size();z++)
		{
			//if((studentList[z].getAverage())>high)
			if((studentList.get(z).getAverage())>high)
			{
				//high=studentList[z].getAverage();
				high=studentList.get(z).getAverage();
				//hName=studentList[z].getName();
				hName=studentList.get(z).getName();
			}
		}
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		//for (int z=0; z<studentList.length;z++)
		for(int z=0;z<studentList.size();z++)
		{
			//if((studentList[z].getAverage())<low)
			if((studentList.get(z).getAverage())<low)
			{
				//low=studentList[z].getAverage();
				low=studentList.get(z).getAverage();
				//hName=studentList[z].getName();
				hName=studentList.get(z).getName();
			}
		}
		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		//for(int h=0;h<studentList.length;h++)
		for(int h=0; h<studentList.size();h++)
		{
			//if (studentList[h].getAverage()<60.0)
			if(studentList.get(h).getAverage()<60.0)
			{
				//output= output + studentList[h].getName();
				output=output + studentList.get(h).getName();
			}
		}
		return output;
	}
	
	public void sort()
	{
		Collections.sort(studentList);
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		return output;
	}  	
}