
public class RecursionDisplayReverseArray {
   
	public static void main(String[] args) {
		int[] arr =  {5,3,9,12};
		DisplayArray(arr,0);
	}
	
	public static void DisplayArray(int[] arr,int vindex) {
		if(vindex==arr.length) { return; }
		DisplayArray(arr, vindex+1);
		System.out.println(arr[vindex]);
		
	}
	
}
