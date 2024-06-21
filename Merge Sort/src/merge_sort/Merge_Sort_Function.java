package merge_sort;

public class Merge_Sort_Function {
	
//	public Merge_Sort_Function() {}
	
	public void merge_Sort(int arr[], int low, int high) {
		int mid;
		int temp[] = new int[arr.length];
		if(low >= high) {
			return;
		}
		mid = (low + high)/2;
		
		//Recursive call to merge_Sort function
		merge_Sort(arr, low, mid);
		merge_Sort(arr, mid+1, high);
		
		//from class Merge_Sort_Ver2
		Merge_Sort_Ver2.merge_Ver2(arr, temp, low, mid, mid+1, high);
		Merge_Sort_Ver2.copy(arr, temp, low, high);
	}

}
