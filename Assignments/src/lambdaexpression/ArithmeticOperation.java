package lambdaexpression;

interface Operation
{
	public int arithmetic(int a,int b);
}
public class ArithmeticOperation {
	public static void main(String[] args) {
		
	
	Operation add = (a,b)->(a+b);
	System.out.println("Addition:"+add.arithmetic(10, 20));
	
	Operation sub = (a,b)->(a-b);
	System.out.println("Subtraction:"+sub.arithmetic(20, 10));
	
	Operation mul = (a,b)->(a*b);
	System.out.println("Multiplication:"+mul.arithmetic(10, 20));
	
	Operation div = (a,b)->(a/b);
	System.out.println("Division:"+div.arithmetic(20, 10));

}
}