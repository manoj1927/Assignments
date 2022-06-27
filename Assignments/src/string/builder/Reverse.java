package string.builder;

public class Reverse {
public static void main(String[] args) {
	StringBuilder builder = new StringBuilder("This method return the reversed object on which it was called");
	
	System.out.println("Original String :"+builder);
	
	builder.reverse();
	
	System.out.println("Reversed String :"+builder);
}
}
