package corejava;

import java.util.Scanner;

public class Average {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
    System.out.println("Enter the scores of the first student");
    int sub1 =sc.nextInt();
    int sub2=sc.nextInt();
    int sub3=sc.nextInt();
    
    System.out.println("Enter the scores of the second student");
    int subj1=sc.nextInt();
    int subj2=sc.nextInt();
    int subj3=sc.nextInt();
    
    System.out.println("Enter the score of the third student");
    int subject1=sc.nextInt();
    int subject2=sc.nextInt();
    int subject3=sc.nextInt();
    
    int tot=sub1+sub2+sub3;
    System.out.println("the total score of first student "+tot+" avg is "+tot/3);
    int tot1=subj1+subj2+subj3;
    System.out.println("the total score of second student "+tot1+" avg is "+tot1/3);
    int tot2 = subject1+subject2+subject3;
    System.out.println("the total score of third student "+tot2+" avg is "+tot2/3);
    System.out.println("*********");
    int mar=sub1+subj1+subject1;
    System.out.println("the total marks in the first subject "+mar+" avg is "+mar/3);
    int mar1=sub2+subj2+subject2;
    System.out.println("the total marks in the second subject "+mar1+" avg is "+mar1/3);
    int mar2=sub3+subj3+subject3;
    System.out.println("the total marks in the third subject "+mar2+" avg is "+mar2/3);
}
}