package euler;

import java.util.ArrayList;

public class Problem58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerator = 0;
		int denominator = 1;
		int n = 0;
		int current = 0;
		int index = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		do
			{
			n++;
			current = 4 * n * n + 1;
			Primitives.primesUpTo(list, current + 4 * n);
			while(index < list.size())
			{
				if(list.get(index) < current - 2 * n)
				{
					index++;
				}
				else
				{
					if(list.get(index) == current - 2 * n)
					{
						numerator++;
						index++;
					}
					else
					{
						break;
					}
				}
			}
			while(index < list.size())
			{
				if(list.get(index) < current)
				{
					index++;
				}
				else
				{
					if(list.get(index) == current)
					{
						numerator++;
						index++;
					}
					else
					{
						break;
					}
				}
			}
			while(index < list.size())
			{
				if(list.get(index) < current + 2 * n)
				{
					index++;
				}
				else
				{
					if(list.get(index) == current + 2 * n)
					{
						numerator++;
						index++;
					}
					else
					{
						break;
					}
				}
			}
			denominator += 4;
			
			//System.out.println((double) numerator / denominator);
			}
		while((double) numerator / denominator > 0.1);
		System.out.println(n);
	}
}
