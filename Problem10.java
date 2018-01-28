package euler;

import java.util.ArrayList;
import euler.Primelist;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = primesUpTo(10);
		for(int i = 0; i < list.size(); i++)
		{
			sum += list.get(i);
		}
		System.out.print(sum);

	}
	public static ArrayList<Integer> primesUpTo(int num)
	{
		int i = 2;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(i < num)
		{
			list = Primelist.addPrimeToList(list, i);
			i++;
		}
		return list;
	}
}
