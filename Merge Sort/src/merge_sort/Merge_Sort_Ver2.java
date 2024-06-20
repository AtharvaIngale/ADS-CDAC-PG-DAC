package merge_sort;

public class Merge_Sort_Ver2 {
	
	//Function is used to sort the elements in the array ex. {12,32,34,56,67,3,14,22,35,55}
	public static void merge_Ver2(int arr[], int tar[], int low1, int high1, int low2, int high2) {
		int i = low1;
		int j = low2;
		int k = low1;
		while(i <= high1 && j <= high2) {
			if(arr[i] < arr[j]) {
				tar[k] = arr[i];
				i++;
				k++;
			}
			else {
				tar[k] = arr[j];
				j++;
				k++;
			}
//			else {
//				tar[k] = arr[i];
//				i++;
//				j++;
//				k++;
//			}
		}
		while(i <= high1) {
			tar[k] =  arr[i];
			i++;
			k++;
		}
		while(j <= high2) {
			tar[k] = arr[j];
			j++;
			k++;
		}
	}
	
	
	//The function is used to print elements given in a range
	public static void copy(int tar[], int arr[], int low, int high) {
		int i;
		for(i=0; i<high; i++) {
			tar[i] = arr[i];
		}
		return;
	}

}
