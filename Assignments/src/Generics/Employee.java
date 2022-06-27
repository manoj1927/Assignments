package Generics;

class Employee {
      int id;
      String name;
      double salary;
      String department;
	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
      
      public void displayDetails()
      {
    	  System.out.println("id:"+id);
    	  System.out.println("name:"+ name);
    	  System.out.println("salary:"+salary);
    	  System.out.println("department:"+department);
      }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	

}
