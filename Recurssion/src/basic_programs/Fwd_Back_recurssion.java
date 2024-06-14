package basic_programs;

public class Fwd_Back_recurssion {
	
	public static void fun(int n)
	{
	 if(n>5) {
		 return;
	 }
	 System.out.println("Forward Recursive");
	 System.out.println(n); //forward recursive
	 
	 fun(n+1);
	 
	 System.out.println("Backward Recursive");
	 System.out.println(n);//backward recursive	 
	 return;
	}

	public static void main(String[] args) {
		fun(1);
	}
}
