//TO SORT THE ELEMENTS IN AN ARRAY USING SLEELCTION SORT
public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {100, 25, 15, 45, 150, 10, 65};
		System.out.println("Before sorting: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		s_sort(arr);
		System.out.println();
		System.out.println("After sorting: ");
		for(int j=0; j<arr.length;j++) {
			System.out.print(arr[j] + " ");
		}
	}
	
	public static void s_sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int index = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallnum = arr[index];
			arr[index] = arr[i];
			arr[i] = smallnum;
		}
	}

}
