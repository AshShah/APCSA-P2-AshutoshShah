/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card test= new Card("jack", "clubs", 11);
		System.out.println(test);
		
		Card testOne= new Card("two", "spades", 2);
		System.out.println(testOne);
		
		Card testTwo= new Card("queen", "diamonds", 12);
		System.out.println(testTwo);
		
	}
}
