package euler;

import java.util.ArrayList;
import euler.Primitives;

public class Problem7 {

	public static void main(String[] args) {
		//Solved
		int i = 2;
		int num = 6;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		while(list.size() <= num)
		{
			Primitives.addPrimeToList(list, i);
			i++;
		}
		System.out.print(list.get(num));

	}
}
