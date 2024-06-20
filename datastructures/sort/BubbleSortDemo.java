package datastructures.sort;

public class BubbleSortDemo {
	static void bubbleSort(int arr[],int n) {
		int i,j,temp;
		boolean swapped;
		for(i=0;i<-1;i++) {
			swapped = false;
			for(j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j +1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
				break;
		}
	}
		static void printArray(int arr[],int size) {
			int i;
			for(i=0;i<size;i++) {
				System.out.println(arr[i]+ " ");
			}
			System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {40,54,63,22,38,88};
		int n = arr.length;
		bubbleSort(arr,n);
		System.out.println("Sorted Array is:");
		printArray(arr,n);
		

	}}