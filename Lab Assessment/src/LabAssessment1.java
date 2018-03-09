
public class LabAssessment1 
{
	private static int number;
	private int counter;
	
	public static void setNumber(int num)
	{
		number=num;
	}
	
	public static void setCounter(int count)
	{
		counter=count;
	}
	
	public static boolean isGoofy(int num)
	{
		int ones= numb-(num/10*10);
		int tens=num/10*10;
		int onesRem=num%ones;
		int tensRem=num%tens;
		int sum=onesRem+tensRem;
		if(onesRem==0 && tensRem==0)
		{
			if(sum>0&&sum%2!=0)
			{
				return true;
			}
		}
		return false;
	}
	
	public static int[] getSomeGoofyNumbers(int count)
	{
		int[] goofyArray= new int[count];
		for(int i=1; i<count+1; i++)
		{
			for(int j=1;j<10000;j++)
			{
				if(isGoofy(j)==true && (goofyArray[i]!=goofyArray[i+1]||goofyArray[i]!=goofyArray[i-1]))
				{
					goofyArray[i]=j;
				}
			}
		}
		return goofyArray;
	}
	
	public static void Main(String[] args)
	{
		System.out.println(isGoofy(12));
		System.out.println(getSomeGoofyNumbers(4));
	}
}
