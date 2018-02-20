package euler;

public class Problem28 {

	public static void main(String[] args) {
		// Solved
		int sum = 1;
		// number of layers outside of 1
		int layers = 500;
		for(int i = 1; i <= layers; i++)
		{
			sum += spiralCornerSum(i);
		}
		System.out.println(sum);
	}
	public static int spiralCornerSum(int n)
	{
		// returns 16n^2 + 4n + 4
		return (16 * (int)(Math.pow(n, 2) + 0.5) + 4 * n + 4);
	}
}
