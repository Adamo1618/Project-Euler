package euler;
import java.util.ArrayList;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solved
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = 0;
		for(int i = 1; i < 1000; i++)
		{
			for (int j = i; j < 1000; j++)
			{
				num = i * j;
				if(Primitives.isPalindrome(num))
				{
					list.add(num);
				}
			}
		}
		num = 0;
		for(int i = 0; i < list.size(); i ++)
		{
			num = Math.max(list.get(i), num);
		}
		System.out.print("\n" + num);
	}
}
