package euler;

public class Problem6 {

	public static void main(String[] args) {
		//Solved
		int n = 100;
		System.out.print(squareOfSum(n) - sumOfSquares(n));
	}
	public static int sumOfSquares(int number)
	{
		int sum = 0;
		for (int i = 1; i <= number; i++)
		{
			sum += (int)(0.5 + Math.pow(i, 2));
		}
		return sum;
	}
	public static int squareOfSum(int number)
	{
		int sum = 0; 
		for(int i = 1; i <= number; i++)
		{
			sum += i;
		}
		return (int)(0.5 + Math.pow(sum, 2));
	}

}
