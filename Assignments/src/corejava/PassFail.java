package corejava;

import java.util.*;

public class PassFail {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kannada marks =");
        int kan = sc.nextInt();
        System.out.println("Enter math marks =");
        int math = sc.nextInt();
        System.out.println("Enter science marks =");
        int sci = sc.nextInt();
        if (kan >= 60 && math >= 60 && sci >= 60) {
            System.out.println("Passed");
        } else if ((kan >= 60 && math >= 60) || (kan >= 60 && sci >= 60) || (math >= 60 && sci >= 60)) {
            System.out.println("Promoted");
        } else if ((kan >= 60 && math < 60 && sci < 60) || (kan < 60 && math >= 60 && sci < 60)
                || (kan < 60 && math < 60 && sci >= 60) || (kan < 60 && math < 60 && sci < 60)) {
            System.out.println("fail");
        }
    }
}
