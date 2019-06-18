
public class AllPrime {
    public static void main(String[] args) {
    	int n=7;
    	int counter=2; // Checking from 2 (1 divides every number anyway)
        int checknum=2; // 2 se prime check kro until the number n 
    while(checknum<=n) {
    	while(counter*counter<=checknum) //2. 
    		{ // till square root of 'n' because after that root begins to repeat
    		if (checknum%counter==0) {
    		    break; //1.
    		}
    		counter++;
    	}   // 2 exist points for this loop:
    	 // 1. Not Prime Case: Where counter was able to divide checksum and break;  
    	 // 2. Prime Case: When 2. condition ran out as counter value increased, failing while condition, but as counter value was incremented counter*counter >n can be used to detect this way of exiting of loop.
    	 if(counter*counter>checknum) {
    		 System.out.println(checknum);
           }
   checknum++;  	
   }
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

