
public class NthFibonnaci {
  
	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		int count =1;
		
		while(count<=n) {
			int c = a + b;
			a=b;
			b=c;
			count++;
		}
		System.out.println(a);
	}
}
