package euler;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem50 {

	public static void main(String[] args) {
		// Solved
		System.out.println(Arrays.toString(numberOfPrimes(1000000)));
	}
	public static int[] numberOfPrimes(int limit)
	{
		
		ArrayList<Integer> list = Primitives.primesUpTo(limit);
		int lowerbound = 0, upperbound = 1;
		int targetprime = 0;
		// Prime number, number of consecutive primes
		int[] max = {2, list.get(2), 0};
		for (int i = 2; i < list.size(); i++)
		{
			targetprime = list.get(i);
			lowerbound = 0;
			upperbound = 1;
			int sum = list.get(lowerbound) + list.get(upperbound);
			while(lowerbound < upperbound && upperbound < targetprime)
			{
				if(sum < targetprime)
				{
					upperbound++;
					sum += list.get(upperbound);
				}
				else
				{
					if(targetprime < sum)
					{
						sum -= list.get(lowerbound);
						lowerbound++;
					}
					else
					{
						if(max[0] < upperbound - lowerbound + 1)
						{
							max[0] = upperbound - lowerbound + 1;
							max[1] = targetprime;
							max[2] = lowerbound;
						}
						sum -= list.get(lowerbound);
						lowerbound++;
					}
				}
			}
		}
		return max;
	}
}
