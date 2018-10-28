
public class LargestPrimeFactor
{

	public static void main(String[] args)
	{
		long currentTime = System.currentTimeMillis();
		factorize(600851475143L);
		System.out.println("It took " + (System.currentTimeMillis() - currentTime) + " ms to compute this solution.");
	}
	
	private static void factorize(long n)
	{
		//This function basically factorizes a number passed as a parameter
		long currentFactor = 2;
		//the factors have a limit of sqrt(n) and this limit is decreased as n is reduced
		while(currentFactor < (Math.floor(Math.sqrt(n))))
		{
			if(n % currentFactor == 0)
			{
				//reduce n so it can be expressed as: currentFactor * n
				n /= currentFactor;
			}
			currentFactor++;
		}
		//The 2 factors of n (currentFactor and n) are left, and they both are prime factors
		System.out.println(Math.max(currentFactor, n));
	}

}
