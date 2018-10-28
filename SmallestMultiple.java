
public class SmallestMultiple
{

	public static void main(String[] args)
	{
		long currentTime = System.currentTimeMillis();
		int n = 1;
		while(isDivisble(n) == false)
			n++;
		System.out.println(n);
		System.out.println("It took " + (System.currentTimeMillis() - currentTime) + " ms to compute this solution.");
	}
	
	private static boolean isDivisble(int n)
	{
		for(int i = 1; i <= 20; i++)
		{
			if(n % i != 0)
				return false;
		}
		return true;
	}

}
