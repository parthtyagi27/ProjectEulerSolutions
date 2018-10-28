
public class LatticePaths
{

	long routes = 0;
	public static String[][] matrix = new String[2][2];
	
	public static void main(String[] args)
	{
		populateMatrix();
		printMatrix();
	}

	private static void printMatrix()
	{
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void populateMatrix()
	{
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				matrix[i][j] = "o";
			}
		}
		matrix[0][0] = "x";
	}

}
