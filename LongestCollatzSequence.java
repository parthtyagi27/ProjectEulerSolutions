
public class LongestCollatzSequence
{

	public static void main(String[] args)
	{
		long max = 999999;
		long largestChain= 0;
		long num = 0;
		while(max >= 1)
		{
			long temp = generateChain(max);
			if(temp > largestChain)
			{
				num = max;
				largestChain = temp;
			}
			max--;
		}
		System.out.println(num + " has a chain of: " + largestChain);
	}

	private static long generateChain(long i)
	{
		long count = 1;
		while(i != 1)
		{
			if(i % 2 == 0)
				i /= 2;
			else
				i = 3*i +1;
			count++;
		}
		return count;
	}

}
