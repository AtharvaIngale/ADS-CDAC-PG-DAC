package basic_programs;

public class Power_of_Number {
	
	public static int power(int a, int p) {
		if(p==0) {
			return 1;
		}
		return a*power(a,p-1);
	}
	
	public static void main(String[] args) {
		System.out.println(power(2,5));
	}

}
