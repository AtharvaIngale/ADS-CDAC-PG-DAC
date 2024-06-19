package quick_sort;

public class Quick_Sort_Main {
	
	public static void main(String[] args) {
		int arr[] = {22,12,23,43,21,97,4,67};
		
		System.out.println("Unsorted array");
		for(int i=0; i<arr.length; i++) {
			System.out.print("  "+arr[i]);
		}
		
		Quick_Sort q1 = new Quick_Sort();
		q1.quick_Sort(arr, 0, 7);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Sorted array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print("  "+arr[i]);
		}
	}
}
