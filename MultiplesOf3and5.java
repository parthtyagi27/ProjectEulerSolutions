
public class MultiplesOf3and5
{

	public static void main(String[] args)
	{
		int sum = 0; 
		long currentTime = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++)
		{
			if(i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		System.out.println(sum);
		System.out.println("It took " + (System.currentTimeMillis() - currentTime) + " ms to compute this solution.");
	}

}
