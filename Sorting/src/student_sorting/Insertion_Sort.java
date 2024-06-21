package student_sorting;

public class Insertion_Sort {
	
	public static void insertion_Sort(Student arr[]) {
	int i,j;
	Student k;
	
	for(i=1;i<arr.length;i++) {
		k= arr[i];
		for(j=i-1;j>=0 && k.getTot() < arr[j].getTot();j--)
			arr[j+1]=arr[j];
		
		arr[j+1]=k;
		}
	}

}
