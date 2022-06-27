package string.buffer;

public class Insert {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("it is used to at the specified index posotion");
		
		System.out.println("Original String :"+buffer);
		
		buffer.insert(10," insert text");
		
		System.out.println("After Inserting text :"+buffer);
}
}