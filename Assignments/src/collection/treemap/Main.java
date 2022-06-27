package collection.treemap;

import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
	
		 TreeMap<Long,Contact> treemap = new TreeMap<>();
		 
		 Contact cd = new Contact(9384238979L, "Manoj", "manoj@gmail.com");
		 Contact cd1 = new Contact(9837641998L, "Manu", "manu@gmail.com");
		 Contact cd2 = new Contact(7667539872L, "Manasa", "manasa@gmail.com");
		 Contact cd3 = new Contact(7848945683L, "Dhoni", "dhoni@gmail.com");
		 
		 treemap.put(cd.getPhoneNumber(), cd);
		 treemap.put(cd1.getPhoneNumber(), cd1);
		 treemap.put(cd2.getPhoneNumber(), cd2);
		 treemap.put(cd3.getPhoneNumber(), cd3);
		
		 for(long L:treemap.keySet()) {
			 System.out.println(L+" ");
		 }
		 
		 System.out.println("-----------------------------");
		 System.out.println(treemap.get(cd.getPhoneNumber()));
		 System.out.println(treemap.get(cd1.getPhoneNumber()));
		 System.out.println(treemap.get(cd2.getPhoneNumber()));
		 System.out.println(treemap.get(cd3.getPhoneNumber()));
		 
		 System.out.println("-----------------------------");
		 System.out.println(treemap);
	}

}
