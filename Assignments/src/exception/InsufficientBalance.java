package exception;



class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);

    }

   
}

class IllegalBankTransactionException extends RuntimeException {
    public IllegalBankTransactionException(String message) {
        super(message);

    }

}  

public  class InsufficientBalance {
	public  void transaction(int amount,int balance)throws InsufficientBalanceException,IllegalBankTransactionException
	{
		 

	            if (amount > balance) {

	                throw new InsufficientBalanceException("Insufficient Balance");
	            }

	            else if (amount < 0) {

	                throw new IllegalBankTransactionException("Illegal Transaction");

	            }

	            else {

	                balance = balance - amount;

	                System.out.println("Your Transaction is Successful!!!");

	            }

	        }

	       
	    
	

    public static void main(String[] args) {
    	
    	InsufficientBalance insufficientBalance=new InsufficientBalance (); 
    	insufficientBalance.transaction(2100,2000);

       
}
}
