package euler;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solved
		int sum = 0;
		int f1 = 0;
		int f2 = 1;
		int f3 = 1;
		while(f3 < 4000000)
		{
			f1 = f2;
			f2 = f3;
			
			System.out.print(f3 + "\n");
			if(f3 % 2 == 0)
			{
				sum += f3;
			}
			f3 = f2 + f1;
			
		}
		System.out.print("\n" + sum);
	}

}
