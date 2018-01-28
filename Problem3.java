package euler;

import java.util.ArrayList;
import euler.Primelist;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solved
		
		//long n = 13195;
		long n = 600851475143L;
		ArrayList<Integer> list = Primelist.primesUpTo((int)Math.sqrt(n));
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++)
		{
			if(n % list.get(i) == 0)
			{
				list2.add(list.get(i));
			}
		}
		System.out.print(list2.get(list2.size() - 1));
	}
}
