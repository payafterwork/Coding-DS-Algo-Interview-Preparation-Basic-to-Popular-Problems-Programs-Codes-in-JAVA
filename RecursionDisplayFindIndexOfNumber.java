
public class RecursionDisplayFindIndexOfNumber {
   
	public static void main(String[] args) {
		int[] arr =  {5,3,9,12};
		System.out.print(WhereIsIt(arr,10,0));
	}
	
	public static int WhereIsIt(int[] arr,int data,int vindex) {
       if(vindex==arr.length) {
    	   return -1; // Reached end of array, couldn't find it.
       }
		if(arr[vindex]==data) {
	    	return vindex;
	    }else {
	    	int foundindex = WhereIsIt(arr, data, vindex+1);
	    	return foundindex;
	    }	
	}
	
}
