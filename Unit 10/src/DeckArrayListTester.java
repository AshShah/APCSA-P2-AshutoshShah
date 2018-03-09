
public class DeckArrayListTester 
{

	public static void main(String[] args) 
	{
		String[] ranks={"ace","two","three","four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String[] suits={"clubs","spades", "diamonds","hearts"};
		int[] values={1,2,3,4,5,6,7,8,9,10,11,12,13};
		DeckArrayList test=new DeckArrayList(ranks, suits, values);
		test.shuffle();
		for (int i=ranks.length*suits.length; i>0;i--)
		{
			System.out.println(test.deal());
		}
	}
}
