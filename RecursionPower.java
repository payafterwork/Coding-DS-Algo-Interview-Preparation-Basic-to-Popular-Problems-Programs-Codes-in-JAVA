
public class RecursionPower{
    public static void main(String[] args) {
    	System.out.println(Power(2,3));
    }
    public static int Power(int x, int n) {
    	if(n==0) {
    		return 1;
    	}
       int xpnm1 = Power(x, n-1);
       int xpn = x*xpnm1;
       return xpn;
    }
}    
    