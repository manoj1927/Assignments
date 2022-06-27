package string.builder;

public class Append {
  public static void main(String[] args) {

		StringBuilder str=new StringBuilder("String Buffer");
		
		System.out.println("Original String :"+str);
		
		str.append("is a peer class of string ");
		
		System.out.println(str);
		
		str.append("that provides much of ");
		
		System.out.println(str);
		
		str.append(" the functionality of string ");
		System.out.println(str);
}
}
