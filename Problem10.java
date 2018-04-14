package euler;

import java.util.ArrayList;
import euler.Primitives;

public class Problem10 {

	public static void main(String[] args) {
		//Solved
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = Primitives.primesUpTo(2000000);
		for(int i = 0; i < list.size(); i++)
		{
			sum += list.get(i);
		}
		System.out.print(sum);

	}
}
