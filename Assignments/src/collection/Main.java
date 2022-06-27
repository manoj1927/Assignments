package collection;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
public static void main(String[] args) {
	System.out.println("1.Id");
	System.out.println("2.Name");
	System.out.println("3.Department");
	System.out.println("4.Salary");
	Scanner sc=new Scanner(System.in);
	System.out.println("Type Your option");

	String str = sc.nextLine();

	
	 if(str.equals("Name")) {
		TreeSet<Employee> ts= new TreeSet<Employee>(new SortByName());
		ts.add(new Employee(4,"manoj","Hr",20000));
		ts.add(new Employee(9,"omkar", "Accounting", 30000));
		ts.add(new Employee(3,"bhavan","Development",25000));
		ts.add(new Employee(1,"smit","Accounting",50000));
		ts.add(new Employee(5,"mahendra", "Testing", 55000));
		ts.add(new Employee(6,"kunal","Hr",35000));
		ts.add(new Employee(7,"poorva", "Development", 45000));
		ts.add(new Employee(8,"ketki","Accounting",25000));
		ts.add(new Employee(2,"aniket","Testing",30000));
		ts.add(new Employee(10,"sanket", "Hr", 50000));

		for(Employee e:ts) {
			System.out.println(e);
		}
	}
	

}
}
