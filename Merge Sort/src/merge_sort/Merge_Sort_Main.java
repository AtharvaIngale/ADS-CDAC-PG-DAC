package merge_sort;

public class Merge_Sort_Main {
	
	public static void main(String[] args) {
				
//		int arr1[]= {12,32,34,56,67};
//		int arr2[]= {3,14,22,35,55};
//		
//		Merge_Sort_Ver1 m2 = new Merge_Sort_Ver1();		
//		m2.merge_Ver1(arr1, arr2, arr1);
//		
//		System.out.println("Sorted array: ");		
//		for(int i=0; i<arr1.length; i++) {
//			System.out.print(" "+arr1[i]);
//		}
		
		
		int arr[] = {64,234,65,64,54,4,7,21,87,48};
		Merge_Sort_Function m1 = new Merge_Sort_Function();
		m1.merge_Sort(arr, 0, arr.length-1);
		
		System.out.println("Sorted array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		
		
	}
	

}
