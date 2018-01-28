package euler;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solved
		int n=1000;
		int sum = 0;
		int i = 1;
		while(i * 3 < n)
		{
			sum += i * 3;
			i++;
		}
		i = 1;
		while(i * 5 < n)
		{
			if (i % 3 != 0)
			{
				sum += i * 5;
			}
			i++;
		}
		System.out.print("" + sum);
	}

}
