
public class RecursionDisplayMaxInArray {
   
	public static void main(String[] args) {
		int[] arr =  {5,13,9,12};
		System.out.print(MaxInArray(arr,0));
	}
	
	public static int MaxInArray(int[] arr,int vindex) {
		if(vindex==arr.length-1) {
			return arr[vindex];
		}
		int max =  MaxInArray(arr, vindex+1);
		if (max > arr[vindex] ) {
			return max;
		}else {
			return arr[vindex];
		}
	}
	
}
