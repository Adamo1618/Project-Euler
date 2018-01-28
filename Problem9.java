package euler;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solved
		for(int c = 3; c <= 997; c++)
		{
			for(int b = 2; b <= c; b++)
			{
				for(int a = 1; a <= b; a++)
				{
					if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a + b + c == 1000)
					{
						System.out.print(a + " " + b + " " + c + " " + a*b*c);
					}
				}
			}
		}
	}
}
