
public class SpecialPythagoreanTriplet
{

	public static void main(String[] args)
	{
		long currentTime = System.currentTimeMillis();
		for(int a = 1; a < 1000; a++)
		{
			for(int b = a + 1; b < 1000; b++)
			{
				int c = 1000 - b - a; 
				if(square(a) + square(b) == square(c))
				{
					System.out.println(a * b * c);
					break;
				}
			}
		}
		System.out.println("It took " + (System.currentTimeMillis() - currentTime) + " ms to compute this solution.");
	}
	
	private static int square(int n)
	{
		return n * n;
	}
	

}
