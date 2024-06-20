public class JumpSearchDemo {
	
	public static int jumpSearch(int[] arr,int target) {
		int len=arr.length;
		int step=(int)Math.floor(Math.sqrt(len));
		
		int prev=0;
		while(arr[Math.min(step, len)-1]<target) {
			prev=step;
			step+=(int)Math.floor(Math.sqrt(len));
			if(prev>=len) {
				return -1;
			}
		}
		
		while(arr[prev]<target) {
			prev++;
			if(prev==Math.min(step, len)) {
				return -1;
			}
		}
		
		if(arr[prev]==target) {
			return prev;
		}
		return -1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144, 233, 377, 610};
         int x = 55;

    // Find the index of 'x' using Jump Search
    int index = jumpSearch(arr, x);

    // Print the index where 'x' is located
    System.out.println("\nNumber " + x + " is at index " + index);

	}

}