package Generics;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
		
    	HashSet<Employee> set = new HashSet();
    	Employee e = new Employee(101,"manoj",20000.00,"Analyst");
    	Employee e1 = new Employee(102,"bhavan",20000.00,"Analyst");
    	Employee e2 = new Employee(101,"poorva",20000.00,"Analyst");
    	
    	set.add(e);
    	set.add(e1);
    	set.add(e2);
    	//set.add(100);
    	System.out.println(set);
	}
}
