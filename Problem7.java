package euler;

import java.util.ArrayList;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solved
		int i = 2;
		int num = 10001;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		while(list.size() < num)
		{
			list = extendPrimeList(list, i);
			i++;
		}
		System.out.print(list.get(num-1));

	}
	public static ArrayList<Integer> extendPrimeList(ArrayList<Integer> list, int number)
	{
		
		int i = 0;
		boolean isprime = true;
		while(i < list.size() && i < Math.sqrt(number))
		{
			if(number % list.get(i) == 0)
			{
				isprime = false;
				break;
			}
			i++;
		}
		if(isprime)
		{
			list.add(number);
		}
		
		return list;
	}
}
