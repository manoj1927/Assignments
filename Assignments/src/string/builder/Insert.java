package string.builder;

public class Insert {
public static void main(String[] args) {
	StringBuilder builder = new StringBuilder("it is used to at the specified index posotion");
	
	System.out.println("Original String :"+builder);
	
	builder.insert(10," insert text");
	
	System.out.println("After Inserting text :"+builder);
}
}
