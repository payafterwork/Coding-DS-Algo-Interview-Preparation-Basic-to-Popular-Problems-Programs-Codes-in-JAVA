
/*Enter a number
5
0  
1  1  
2  3  5  
8  13  21  34  
55  89  144  233  377  
*/
import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		 	int a=0;
 		   int b=1;
 		
 	      int row =1;
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter a number");
		  int n =  scn.nextInt(); // Picks up user input and places in "n"
	
	       while(row<=n) { //Responsible for printing 'n' rows
	    	   // Logic for what within rows
	    	   int col=1;
	    	     while(col<=row) { // printing controller according to number of rows
	               System.out.print(a + "  ");
	    			int c = a + b;
	    			a=b;
	    			b=c;
	    			col++;
	    		}
	    	   //
	    	    System.out.print('\n');
	    	   row++;
	       }
		}
}
