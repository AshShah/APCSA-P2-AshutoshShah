//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter test= new AtCounter();
		test.countAts(0, 0);
		System.out.println(test);
		
		AtCounter test1= new AtCounter();
		test1.countAts(2, 5);
		System.out.println(test1);
		
		AtCounter test2= new AtCounter();
		test2.countAts(5, 0);
		System.out.println(test2);
		
		AtCounter test3= new AtCounter();
		test3.countAts(9, 9);
		System.out.println(test3);
		
		AtCounter test4= new AtCounter();
		test4.countAts(3, 9);
		System.out.println(test4);
		//test the code
	}
}