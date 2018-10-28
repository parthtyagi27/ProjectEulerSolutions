
public class PrimeNumber
{

	public static void main(String[] args)
	{
		long currentTime = System.currentTimeMillis();
		long x = 0, index = 1;
		while(x < 10001)
		{
			index++;
			if(isPrime(index) == true)
				x++;
		}
		System.out.println(index);
		System.out.println("It took " + (System.currentTimeMillis() - currentTime) + " ms to compute this solution.");
	}
	
	private static boolean isPrime(long n)
	{
		if(n == 2 || n == 3)
			return true;
		else if(n % 2 == 0 || n % 3 == 0 || n == 1 || n == 0)
			return false;

		for(int i = 5; i <= Math.ceil( Math.sqrt(n)); i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}

}
