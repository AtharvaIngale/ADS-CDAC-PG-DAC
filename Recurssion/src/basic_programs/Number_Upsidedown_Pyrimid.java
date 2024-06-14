package basic_programs;

public class Number_Upsidedown_Pyrimid {
	
	public Number_Upsidedown_Pyrimid() {}
	
	public static int count(int n) {
		System.out.println(n);
		if((n/10)==0) {
			return 1;
		}
		//System.out.println(n);
		count(n/10);
		//System.out.println(n);
		return 1;
	}
	
	public static void main(String[] args) {
		count(123456);
	}

}
