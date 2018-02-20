package euler;

import java.util.ArrayList;

public class Problem35 {

	public static void main(String[] args) {
		// Solved
		ArrayList<Integer> primes = Primitives.primesUpTo(1000000);
		//System.out.println(isCircularPrime(49, primes));
		int count = 0;
		for(int i = 0; i < primes.size(); i++)
		{
			if(isCircularPrime(primes.get(i), primes))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static int rotate(int number)
	{
		// Rounds down to the closest power of 10
		int magnitude = (int)Math.pow(10, (int) Math.log10(number));
		
		return number % magnitude * 10 + number / magnitude;
	}
	public static boolean isCircularPrime(int prime, ArrayList<Integer> list)
	{
		int numberOfDigits = (int)Math.log10(prime);
		boolean b = true;
		for (int i = 0; i < numberOfDigits; i++)
		{
			prime = rotate(prime);
			if (!list.contains(prime))
			{
				b = false;
			}
			
		}
		return b;
	}
	
}
