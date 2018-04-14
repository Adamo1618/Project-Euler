package euler;

import java.util.ArrayList;

public class Problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(d(220));
	}
	public static int d(int number)
	{
		ArrayList<Integer> list = Primitives.getProperDivisors(number);
		
		int sum = 0;
		for(int i : list)
		    sum += i;
		return sum;
	}
}
