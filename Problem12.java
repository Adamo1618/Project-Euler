package euler;

import euler.Primitives;

public class Problem12 {
	// Solved
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
