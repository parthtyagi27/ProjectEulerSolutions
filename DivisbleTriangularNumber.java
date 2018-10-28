
public class DivisbleTriangularNumber
{

	public static void main(String[] args)
	{
		int index = 1;
		while(findFactors(index) <= 500)
		{
			index++;
		}
		System.out.println((index * (index + 1) /2));
	}

	private static int findFactors(int index)
	{
		int n = index * (index + 1) /2;
		int factors = 1;
		
		for(int i = 1; i <= Math.ceil(Math.sqrt(n)); i++)
		{
			if(n % i == 0)
				factors+=2;
		}
		return factors;
	}

}
