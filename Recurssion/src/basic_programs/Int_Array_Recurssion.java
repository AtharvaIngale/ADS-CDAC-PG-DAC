package basic_programs;

public class Int_Array_Recurssion {
	
	public Int_Array_Recurssion() {}
	
	static void display(int a[], int i) {
		if(i<9) {
			return;
		}
		display(a, i+1);
		System.out.println(a[i]);
	}
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		display(arr, 0);
	}

}
