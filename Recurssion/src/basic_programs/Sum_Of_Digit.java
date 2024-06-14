package basic_programs;

public class Sum_Of_Digit {
	
	public static int sum_of_digit(int n) {
		if((n/10)==0) {
			return n;
		}
		return n%10 + sum_of_digit(n/10);
	}
	
	public static void main(String[] args) {
		System.out.println(sum_of_digit(98765));
	}

}
