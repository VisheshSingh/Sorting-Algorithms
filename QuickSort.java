
public class QuickSort {
	public static void main(String[] args) {
		int arr[] = {100, 25, 15, 45, 150, 10, 65};
		System.out.println("Before sorting: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		int low = 0, high = arr.length - 1;
		
		q_sort(arr, low, high);
		System.out.println();
		System.out.println("After sorting: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void q_sort(int arr[], int low, int high) {
		
		int i = low, j = high;
		int middle = (low+high)/2;
		int pivot = arr[middle];
		while(i <= j ) {
			while(arr[i] < pivot) {
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			}
			
			if(i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			
		}
		
		if(low < j) {
			q_sort(arr, low, j);
		}
		if(high > i) {
			q_sort(arr, i, high);
		}
	}
}
