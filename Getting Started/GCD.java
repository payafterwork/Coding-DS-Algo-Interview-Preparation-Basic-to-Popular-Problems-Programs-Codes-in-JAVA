
public class GCD {
	public static void main(String[] args) {
	   int divisor = 24;
	   int dividend = 36;
	   
	   int remainder = dividend % divisor;
	   
	   // Long division using while
	   while(remainder!=0) {
		  divisor = dividend;
		  dividend = remainder;
          remainder = dividend % divisor;  		   
	   }
	   
	   System.out.println(divisor); // GCD is the last divisor
	
	}
}
