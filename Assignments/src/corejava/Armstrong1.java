package corejava;

public class Armstrong1 {
	 public static boolean armStrong(int number) {
	        int result = 0;
	        int orignum = number;
	        while (number != 0) {
	            int remainder = number % 10;
	            result = result + (remainder * remainder * remainder);
	            number = number / 10;
	        }
	        
	        if (orignum == result) {
	            return true;
	        }

	        return false;
	    }

	public static void main(String[] args) {
		System.out.println(armStrong(153));

	}

}
