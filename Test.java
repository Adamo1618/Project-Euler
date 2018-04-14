package euler;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <int[]> list = new ArrayList <int[]>();
		int[] t = {1, 2};
		list.add(t);
		System.out.println(list.contains(new int[] {1, 2}));
		ArrayList <Integer> list2 = new ArrayList <Integer>();
		list2.add(2);
		System.out.println(list2.contains(2));
	}
}
