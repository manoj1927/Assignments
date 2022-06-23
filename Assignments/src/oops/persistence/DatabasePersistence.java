package oops.persistence;

public class DatabasePersistence extends Persistence{

	@Override
	void persist() {
		System.out.println("DATA SAVED IN DATABASE");
	}
	
	public static void main(String[] args) {
		//upcasting 
		Persistence p1= new DatabasePersistence(); 
		p1.persist();
	}
	
}