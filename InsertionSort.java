
public class InsertionSort {

		public static void main(String[] args) {
			int arr[] = {100, 25, 15, 45, 150, 10, 65};
			System.out.println("Before sorting: ");
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
			
			i_sort(arr);
			System.out.println();
			System.out.println("After sorting: ");
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
		}
		
		public static void i_sort(int arr[]){
			for(int i=1;i<arr.length;i++) {
				int j=i;
				while(j>0 && arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					j=j-1;
				}
			}
		}

	}
