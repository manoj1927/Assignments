package string.buffer;

public class Reverse {
	public static void main(String[] args) {
		
	
	StringBuffer buffer = new StringBuffer("This method return the reversed object on which it was called");
	
	System.out.println("Original String :"+buffer);
	
	buffer.reverse();
	
	System.out.println("Reversed String :"+buffer);
}
}