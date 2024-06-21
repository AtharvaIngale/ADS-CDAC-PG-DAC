package student_sorting;

public class Selection_Sort {
	
	public static void selection_Sort(Student arr[]) {
	int i,j,min;
	Student temp;
	
	for(i=0;i<arr.length-1;i++)
	{
		min=i;
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[j].getTot()<arr[min].getTot())
			min=j;
		}
		if(min!=i) {
			temp= arr[i];
			arr[i]= arr[min];
			arr[min]= temp;
		}
	}
	}

}
