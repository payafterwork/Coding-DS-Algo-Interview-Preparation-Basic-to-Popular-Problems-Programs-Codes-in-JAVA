
public class isPrime {
    public static void main(String[] args) {
    	int n=7;
    	int counter=2; // Checking from 2 (1 divides every number anyway)

//BEST
    	while(counter*counter<=n) { // till square root of 'n' because after that root begins to repeat
    		if (n%counter==0) {
    			System.out.println("Not prime");
    		    return;
    		}
    		counter++;
    	}    	

      System.out.println("Prime");
    	
    }    	
//Better
//    	while(counter<=n/2) { // till n/2 because no root after half anyway 
//    		if (n%counter==0) {
//    			System.out.println("Not prime");
//    		    return;
//    		}
//    		counter++;
//    	}

//    	System.out.println("Prime");
    	
    	
// SIMPLEST   	while(counter<=n-1) { // till n-1 (because every no. divides itself)
//    		if (n%counter==0) {
//    			System.out.println("Not prime");
//    		    return;
//    		}
//    		counter++;
//    	}
//    	System.out.println("Prime");
    }

