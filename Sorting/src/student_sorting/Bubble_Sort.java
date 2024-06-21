package student_sorting;

public class Bubble_Sort {
	
	public static  void bubble_Sort(Student []arr) {
		int i ,j,flag=0;
		Student temp;
		
		for(i= arr.length-1;i>0;i--)
		{
			flag=0;
			for(j=0;j<i;j++)
			{
				if(arr[j].getTot()>arr[j+1].getTot())
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}

	}
}
