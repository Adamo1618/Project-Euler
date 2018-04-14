package euler;

import java.util.ArrayList;

public class Problem47 {

	public static void main(String[] args) {
		// Solved
		int number = 3;
		ArrayList<Integer> list = Primitives.primesUpTo(number);
		while(true)
		{
			if(number > list.get(list.size() - 1))
			{
				list = Primitives.primesUpTo(number * 2);
			}
			if(hasConsecutivePrimeFactors(list, 4, number))
			{
				System.out.println(number);
				break;
			}
			else
			{
				number++;
			}
		}
		

	}
	public static boolean hasConsecutivePrimeFactors(ArrayList<Integer> list, int amount, int number)
	{
		for(int i = 0; i < amount; i++)
		{
			if(numberOfDistinctPrimeFactors(list, 0, number + i) == amount)
			{
				// YOLO
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static int numberOfDistinctPrimeFactors(ArrayList<Integer> list, int index, int num)
	{
		while(list.size() > index)
		{
			if(num % list.get(index) == 0)
			{
				return 1 + numberOfDistinctPrimeFactors(list, index + 1, num / list.get(index));
			}
			else
			{
				index++;
			}
		}
		return 0;
	}
}
