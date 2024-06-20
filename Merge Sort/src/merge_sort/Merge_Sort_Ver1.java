package merge_sort;

public class Merge_Sort_Ver1 {
	
	//Merging two arrays in sorted order by ascending 
	//
	public static void merge_Ver1(int arr1[], int arr2[], int tar[]) {
		int i=0, j=0, k=0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				tar[k] = arr1[i];
				i++;
				j--;
			}
			if(arr2[j] < arr1[i]) {
				tar[k] = arr1[i];
				i++;
				j--;
				k++;
			}
		}
		while(i < arr1.length) {
			tar[k] = arr1[i];
			i++;
			k++;
		}
		while(j < arr2.length) {
			tar[k] = arr2[j];
			j++;
			k++;
		}
	}

}
