package exception;

class UnsupportedOperationException extends Exception{
	public UnsupportedOperationException(String message) {
		super(message);
	}
	
}


public class ArithmeticException2 {
	public static void division(int a,int b) throws UnsupportedOperationException
	{
		try {
		int c=b/a;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			
			throw new UnsupportedOperationException("handled");
		}
	}


	public static void main(String[] args) throws UnsupportedOperationException {
		division(2,10);
		division(0,10);
	}

}
