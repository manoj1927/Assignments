package corejava;

import java.util.Scanner;

public class SearchValue {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number to be searched");
	int n=sc.nextInt();
	int [] a= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(n==a[i]) {
			count++;
		}
	}
	
	if(count==1)
	{
		System.out.println("value is found");
	}
	else
	{
		System.out.println("value not found");
	}
		
		
}
}
