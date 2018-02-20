//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover test= new LetterRemover();
		test.setRemover("hagldkfhalsdfhljafhs", 'a');
		test.removeLetters();
		System.out.println(test);
		
		LetterRemover testOne= new LetterRemover();
		testOne.setRemover("When life gives you lemons, give them right back", 'z');
		testOne.removeLetters();
		System.out.println(testOne);
		
		LetterRemover testTwo= new LetterRemover();
		testTwo.setRemover("I eat everything everywhere", 'e');
		testTwo.removeLetters();
		System.out.println(testTwo);
	}
}