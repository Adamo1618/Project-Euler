package euler;

import java.util.ArrayList;
import euler.Primelist;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solved
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = Primelist.primesUpTo(2000000);
		for(int i = 0; i < list.size(); i++)
		{
			sum += list.get(i);
		}
		System.out.print(sum);

	}
}
