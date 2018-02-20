package euler;

import java.util.ArrayList;

public class Problem14 {

	public static void main(String[] args) {
		// Solved
		int seed = 0;
		int maxsize = 0;
		int temp = 0;
		for(int i = 1; i < 1000000; i++)
		{
			seed = i;
			temp = collatzSequence(seed);
			maxsize = Math.max(maxsize, temp);
		}

		System.out.println(maxsize);
	}
	public static int nextCollatz(int number)
	{
		if(number % 2 == 0)
		{
			return number / 2;
		}
		else
		{
			return 3 * number + 1;
		}
	}
	
	public static int collatzSequenceSize(int num)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(num > 1)
		{
			list.add(num);
			num = nextCollatz(num);
		}
		return list.size();
	}
	
	public static int collatzSequence(int num)
	{
		//ArrayList<Integer> list = new ArrayList<Integer>();
		int size = 1;
		while(num > 1)
		{
			size++;
			num = nextCollatz(num);
		}
		return size;
	}

}
