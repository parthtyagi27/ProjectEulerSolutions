
public class LargestPalindromeProduct
{

	public static void main(String[] args)
	{
		long currentTime = System.currentTimeMillis();
		int largestProduct = 0;
		for(int i = 0; i <= 999; i++)
		{
			for(int j = 0; j <= 999; j++)
			{
				if(isPalindrome((i * j)) == true)
				{
					if((i * j) > largestProduct)
						largestProduct = (i * j);
				}
			}
		}
		System.out.println(largestProduct);
		System.out.println("It took " + (System.currentTimeMillis() - currentTime) + " ms to compute this solution.");
	}
	
	private static boolean isPalindrome(int n)
	{
		String number = n + "";
		char[] digits = number.toCharArray();
		for(int i = 0; i < digits.length; i++)
		{
			if(digits[i] != digits[digits.length - 1 - i])
				return false;
		}
		return true;
	}

}
