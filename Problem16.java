package euler;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solved
		System.out.print(sumOfDigits((int)Math.pow(2, 1000)));
	}
	public static int sumOfDigits(int number)
	{
		int sum = 0;
		while(number > 0)
		{
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

}
