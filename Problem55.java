package euler;

public class Problem55 {

	public static void main(String[] args) {
		System.out.println(isLychrel(196));
	}
	public static boolean isLychrel(long number)
	{
		long number2 = 0;
		for(long i = 0; i < 50; i++)
		{
			number2 = number + reverse(number);
			if (number2 == reverse(number2))
			{
				return false;
			}
			number = number2;
			System.out.println(number);
		}
		return true;
	}
	public static long reverse(long number)
	{
		long reverse = 0;
		while(number != 0)
		{
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number /= 10;
		}
		return reverse;
	}
}