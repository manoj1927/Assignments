package string;

public class MethodsOfString {

	public static void main(String[] args) {
		
		String str="Java string pool to collection of string which is stored in heap memory";
		
		
		
		System.out.println("In Lower Case : "+str.toLowerCase());
		
		
		
		System.out.println("In Upper Case :"+str.toUpperCase());
		
	
		
		System.out.println("a Replaced With $ :" + str.replace('a', '$'));
		
	
		
		System.out.println(str.contains("collection"));
		
		String str5 = "java string pool to collection of string which is stored in heap memory";
		
			System.out.println(str==str5);
			
			System.out.println(str.equalsIgnoreCase(str5));
			
	}

}