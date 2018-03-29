//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		passCount=0;
		quickSort(list,0,list.length-1);
		System.out.println("\n");


	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		if(low<high)
		{
			int split=partition(list, low, high);
			System.out.println(Arrays.toString(list));
			passCount++;
			quickSort(list,low,split);
			quickSort(list,split+1,high);
		}
	}


	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable piv=list[low];
		int lower=low-1;
		int upper=high+1;
		while(lower<upper)
		{
			while(list[++lower].compareTo(piv)<0);
			while(list[--upper].compareTo(piv)>0);
			if(lower>=upper)
			{
				return upper;
			}
			Comparable tmp=list[upper];
			list[upper]=list[lower];
			list[lower]=tmp;
		}
		return 0;
	}
}