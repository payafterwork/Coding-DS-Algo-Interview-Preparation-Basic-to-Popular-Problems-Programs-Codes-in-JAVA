
public class RecursionFactorial{
    public static void main(String[] args) {
    	System.out.println(Factorial(3));
    }
    public static int Factorial(int n) {
    	if(n==0) {
    		return 1;
    	}
       int fnm1 = Factorial(n-1);
       int fn = n*fnm1;
       return fn;
    }
}    
    