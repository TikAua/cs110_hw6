package utils;

public class Math {
	public static int factorial(int number){
		if (number <= 1){return 1;}
		return number * factorial(number-1);
	}
	
	public static int factorialLoop(int number){
		int result = 1;
		for (int i = number; i >= 1; i--)
		{
			result = result * i;
		}
		return result;
	}
}
