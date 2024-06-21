package heap_sort;

public class Heap_Sort {
	
	public static void heapify(int arr[], int n, int s) {
		int t, largest=0;
		int left = (s*2)+1;
		int  right = (s*2)+2;
		if((left<n) && (arr[left]>arr[s])) {
			largest = left;
		}
		if((right < n) && (arr[right] > largest)) {
			largest = right;
		}
		if(s != largest) {
			t = arr[s];
			arr[s] = arr[largest];
			arr[largest] = t;
			heapify(arr, n, largest);
		}
	}
	
	public static void heap_Sort(int arr[]) {
		int n = arr.length;
		int temp;
		for(int i=n/2; i>=0; i--) {
			heapify(arr, n, i);
		}
		System.out.println(arr[0]);
		for(int i=n-1; i>=0; i--) {
			temp = arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr, n, 0);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {65,48,21,3,4,48};
		
		heap_Sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(" "+arr[i]);
		}
	}

}
