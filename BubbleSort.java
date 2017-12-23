
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {100, 25, 15, 45, 150, 10, 65};
		System.out.println("Before sorting: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		b_sort(arr);
		System.out.println();
		System.out.println("After sorting: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void b_sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
