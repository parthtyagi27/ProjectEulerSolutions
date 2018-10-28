
public class SumSquareDifference
{

	public static void main(String[] args)
	{
		long currentTime = System.currentTimeMillis();
		long sum = 0, square = 0;
		for(int i = 1; i <= 100; i++)
		{
			sum += i;
			square += (long) Math.pow(i, 2);
		}
		sum = (long) Math.pow(sum, 2);
		System.out.println((sum - square));
		System.out.println("It took " + (System.currentTimeMillis() - currentTime) + " ms to compute this solution.");
	}

}
