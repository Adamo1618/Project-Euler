package euler;

import euler.Primitives;

public class Problem12 {
	
	public static void main(String[] args) {
		// Solved
		int numberofdivisors = 0;
		int number = 0;
		int i = 1;
		
		while(numberofdivisors <= 500)
		{
			number += i;
			i++;
			numberofdivisors = Primitives.getDivisors(number).size();
			
		}
		System.out.println(number);
		
	}
}
