package collection;


import java.util.TreeSet;

public class Duplicate {
	public static void main(String[] args) {
		TreeSet<Integer> value = new TreeSet();
		value.add(7);
		value.add(1);
		value.add(18);
		value.add(45);
		value.add(17);
		value.add(10);
		value.add(7);
		
		System.out.println(value);
	}

}