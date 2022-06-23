package corejava;



import java.util.*;
public class Login {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String username="Manoj123";
	String password="Manoj@123";
	int count=3;
	for(int i=0;i<4;i++) {
		if(count>0) {
			System.out.print("Please Enter Your Username : ");
			String EnterUsername=sc.nextLine(); 
			System.out.print("Please Enter Your Password : ");
			String EnterPassword=sc.nextLine();
			if(EnterUsername.equals(username) && EnterPassword.equals(password)) {
				System.out.println("Welcome!!!");
				break;
			}
			else {
				System.out.println("Wrong username or password");
				count--;
			}
		}
	
		else {
			System.out.println("Contact Admin");
			break;
		}
	}
}
}