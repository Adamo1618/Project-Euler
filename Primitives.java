package euler;

import java.util.ArrayList;
import java.util.Collections;

public class Primitives {

	public static void addPrimeToList(ArrayList<Integer> list, int number)
	{
		// Adds one prime to the list and returns it

		int i = 0;
		boolean isprime = true;
		int root = (int) Math.sqrt(number);
		int size = list.size();
		while(i < size && list.get(i) <= root)
		{
			if(number % list.get(i) == 0)
			{
				isprime = false;
				break;
			}
			i++;
		}
		if(isprime)
		{
			list.add(number);
		}

		return;
	}
	public static ArrayList<Integer> numberOfPrimes(int num)
	{
		// Returns a list of num number of primes, starting with 2
		int i = 2;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int size = list.size();
		while(size < num)
		{
			addPrimeToList(list, i);
			i++;
		}
		return list;
	}
	public static ArrayList<Integer> primesUpTo(int num)
	{
		// Returns a list of primes less than num, starting with 2
		int i = 2;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(i < num)
		{
			addPrimeToList(list, i);
			i++;
		}
		return list;
	}
	public static ArrayList<Integer> primesUpTo(ArrayList<Integer> list, int num)
	{
		// Returns a list of primes less than num, starting with 2
		int i;
		if(list.size() == 0)
		{
			i = 2;
		}
		else
		{
			i = list.get(list.size() - 1);
		}
		
		while(i < num)
		{
			addPrimeToList(list, i);
			i++;
		}
		return list;
	}
	public static ArrayList<Integer> getDivisors(int number)
	{
		// Returns a list of the divisors/factors of the number.
		ArrayList<Integer> list = new ArrayList<Integer>();
		int root = (int) Math.sqrt(number);
		for (int i = 1; i <= root; i++)
		{
			if(number % i == 0)
			{
				list.add(i);
				list.add(number / i);
			}
		}
		Collections.sort(list);
		return list;
	}
	public static ArrayList<Integer> getProperDivisors(int number)
	{
		// Returns a list of the proper divisors/factors of the number.
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int root = (int) Math.sqrt(number);
		for (int i = 2; i <= root; i++)
		{
			if(number % i == 0)
			{
				list.add(i);
				list.add(number / i);
			}
		}
		Collections.sort(list);
		return list;
	}
	public static boolean isPalindrome(int number)
	{
		return number == reverse(number);
	}
	public static int reverse(int number)
	{
		int reverse = 0;
		while(number != 0)
		{
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number /= 10;
		}
		return reverse;
	}
}
