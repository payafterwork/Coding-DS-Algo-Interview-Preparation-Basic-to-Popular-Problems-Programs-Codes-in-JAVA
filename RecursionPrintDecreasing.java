
public class PrintDecreasing {
    public static void main(String[] args) {
    	printDecreasing(5);
    }
    public static void printDecreasing(int n) {
    	if(n==0) {
    		return;
    	}
    	System.out.println(n);
    	printDecreasing(n-1);
    }
}    
    