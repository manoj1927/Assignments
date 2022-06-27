package lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Remove {
	public static void main(String[] args) {
		        ArrayList<String> name = new ArrayList<>(Arrays.asList("manoj", "manu", "ram", "bhavan", "rahul"));
		        Predicate<String> filter = str -> (str.length() % 2 == 0);
		        
		        System.out.println("Orignal ArrayList " + name);
		        name.removeIf(filter);
		        System.out.println("ArrayList after removeIf() " + name);
		    }
}