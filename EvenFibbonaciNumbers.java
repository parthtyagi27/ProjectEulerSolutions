
public class EvenFibbonaciNumbers
{

	public static void main(String[] args)
	{
		long currentTime = System.currentTimeMillis();
		long sum = 0, term = 1, previousTerm = 0;
		while(term < 4000000)
		{
			term += previousTerm;
			previousTerm = (term - previousTerm);
			if(term % 2 == 0)
				sum += term;
		}
		System.out.println(sum);
		System.out.println("It took " + (System.currentTimeMillis() - currentTime) + " ms to compute this solution.");
	}

}
