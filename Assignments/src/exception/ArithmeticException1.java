package exception;

public class ArithmeticException1 {
	public static void division(int a,int b)
	{
		try {
		int c=b/a;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("Arithmetic Exception is Handled");
		}
	}


	public static void main(String[] args) {
		division(2,10);
		division(0,10);
	}

}
