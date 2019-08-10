
public class FibonnaciSeriesTillN {
	
	public static void main(String[] args) {
		int n=55; 
		int a=0;
		int b=1;
		
		while(a<=n) { // till this "n" all a to be printed
           System.out.println(a);
			int c = a + b;
			a=b;
			b=c;
		}
	}

}
