package quick_sort;

public class Quick_Sort {
	
	//Function to make partition of the given array
	public static int partition(int arr[], int low, int high) {
		int left, right, pivot, t;
		pivot = arr[low];
		left = low;
		right = high;
		while(left <= right) {
			while((arr[left] <= pivot) && (left < high)) {
				left++;
			}
			while(arr[right] > pivot) {
				right--;
			}
			if(left < right) {
				t = arr[left];
				arr[left] = arr[right];
				arr[right] = t;
				left++;
				right--;
			}
			else {
				left++;
			}
		}
		arr[low] = arr[right];
		arr[right] =  pivot;
		return right;
	}
	
	
	//Quick sort function 
	public static void quick_Sort(int arr[], int low, int high) {
		int pivloc;
		if(low >= high) {
			return;
		}
		pivloc = partition(arr, low, high);
		quick_Sort(arr, low, pivloc-1);
		quick_Sort(arr, pivloc, high);
	}

}
