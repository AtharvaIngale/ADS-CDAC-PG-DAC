package basic_programs;

public class Reverse_Number {
	
	public static void display_Reverse(int n) {
		if((n/10)==0) {
			System.out.println(n);
			return;
		}
		System.out.print(n%10);
		display_Reverse(n/10);
	}
	
	public static void main(String[] args) {
		display_Reverse(98765);
	}

}
