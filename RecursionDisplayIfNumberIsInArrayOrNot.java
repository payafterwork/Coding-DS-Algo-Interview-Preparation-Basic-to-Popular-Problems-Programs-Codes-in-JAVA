
public class RecursionDisplayIfNumberIsInArrayOrNot {
   
	public static void main(String[] args) {
		int[] arr =  {5,3,9,12};
		System.out.print(InItOrNot(arr,5,0));
	}
	
	public static boolean InItOrNot(int[] arr,int data,int vindex) {
       if(vindex==arr.length) {
    	   return false; // Reached end of array, couldn't find it.
       }
		if(arr[vindex]==data) {
	    	return true;
	    }else {
	    	boolean fn = InItOrNot(arr, data, vindex+1);
	    	return fn;
	    }	
	}
	
}
