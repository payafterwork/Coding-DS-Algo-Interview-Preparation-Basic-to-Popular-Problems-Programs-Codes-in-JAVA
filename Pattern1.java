//Enter a number
//5
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
import java.util.Scanner;
public class Pattern1 {
	public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Enter a number");
	  int n =  scn.nextInt(); // Picks up user input and places in "n"
      int row =1;
       while(row<=n) { //Responsible for printing 'n' rows
    	   // Logic for what within rows
    	   int col=1;
    	   while(col<=row) {    	   
    	   System.out.print("* ");
    	   col++;
    	   }
    	   System.out.print('\n');
    	   //
    	   row++;
       }
	}
}
