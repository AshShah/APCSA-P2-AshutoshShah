//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list=new ArrayList<String>();
	}

	//modfiers
	public void add( String  word)
	{
		int loc = 0;
		list.add(word);
	}


	public void remove(String word)
	{
		list.remove(word);
	}

	public String toString()
	{
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).compareTo(list.get(j))>0)
				{
					String tmp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		}
		return Arrays.toString(list.toArray());
	}
}