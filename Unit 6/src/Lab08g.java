//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		//add test cases
		LoopStats test= new LoopStats();
		test.setNums(2,5);
		test.getEvenCount();
		test.getOddCount();
		test.getTotal();
		System.out.println(test);
		System.out.print("\n");
		
		LoopStats testOne= new LoopStats();
		testOne.setNums(3,18);
		testOne.getEvenCount();
		testOne.getOddCount();
		testOne.getTotal();
		System.out.println(testOne);
		System.out.print("\n");
		
		LoopStats testTwo= new LoopStats();
		testTwo.setNums(20,50);
		testTwo.getEvenCount();
		testTwo.getOddCount();
		testTwo.getTotal();
		System.out.println(testTwo);
		System.out.print("\n");
	}
}