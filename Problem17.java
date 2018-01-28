package euler;

public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solved
		int n = 999;
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			sum += numberToString(i).length();
		}
		sum += "onethousand".length();
		System.out.print(sum);
	}
	public static String numberToString(int number)
	{
		String s = "";
		if(number > 99)
		{
			s = digitToString(number / 100) + "hundred";
			if(number % 100 != 0)
			{
				s += "and";
			}
		}
		
		if(number % 100 > 19)
		{
			s += decadeToString((number % 100) / 10);
			s += digitToString(number % 10);
		}
		else
		{
			if(number % 100 > 9)
			{
				s += teenToString(number % 100);
			}
			else
			{
				s += digitToString(number % 100);
			}
				
		}
		return s;
	}
	public static String digitToString(int digit)
	{
		String s = "";
		switch(digit)
		{
		case 0: s = "";
		break;
		case 1: s = "one";
		break;
		case 2: s = "two";
		break;
		case 3: s = "three";
		break;
		case 4: s = "four";
		break;
		case 5: s = "five";
		break;
		case 6: s = "six";
		break;
		case 7: s = "seven";
		break;
		case 8: s = "eight";
		break;
		case 9: s = "nine";
		break;
		}
		return s;
	}
	public static String decadeToString(int decade)
	{
		String s = "";
		switch(decade)
		{
		case 2: s = "twenty";
		break;
		case 3: s = "thirty";
		break;
		case 4: s = "forty";
		break;
		case 5: s = "fifty";
		break;
		case 6: s = "sixty";
		break;
		case 7: s = "seventy";
		break;
		case 8: s = "eighty";
		break;
		case 9: s = "ninety";
		break;
		}
		return s;
	}
	public static String teenToString(int teen)
	{
		String s = "";
		switch(teen)
		{
		case 10: s = "ten";
		break;
		case 11: s = "eleven";
		break;
		case 12: s = "twelve";
		break;
		case 13: s = "thirteen";
		break;
		case 14: s = "fourteen";
		break;
		case 15: s = "fifteen";
		break;
		case 16: s = "sixteen";
		break;
		case 17: s = "seventeen";
		break;
		case 18: s = "eighteen";
		break;
		case 19: s = "nineteen";
		break;
		}
		return s;
	}

}
