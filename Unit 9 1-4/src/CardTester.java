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
		CardModified test= new CardModified("jack", "clubs", 11);
		System.out.println(test);
		
		CardModified testOne= new CardModified("two", "spades", 2);
		System.out.println(testOne);
		
		CardModified testTwo= new CardModified("queen", "diamonds", 12);
		System.out.println(testTwo);
		
	}
}
