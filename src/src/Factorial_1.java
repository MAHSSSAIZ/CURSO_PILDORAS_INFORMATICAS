package src;

public class Factorial_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(200));
	}
	 
 
	static double factorial(double n)
	{
		if (n == 1.0)
			return 1.0;
		else
			return n*factorial(n-1);
	}
}