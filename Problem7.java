package euler;

import java.util.ArrayList;
import euler.Primelist;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solved
		int i = 2;
		int num = 6;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		while(list.size() <= num)
		{
			list = Primelist.addPrimeToList(list, i);
			i++;
		}
		System.out.print(list.get(num));
	}
}
