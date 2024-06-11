package check_expr;

import java.util.Scanner;

import stack_demo.Char_Stack;

public class Check_Exper {
	
	static String exp = new String();
	
	private static boolean match(char p1, char p2) {
		if((p1=='[') && (p2==']')) {
			return true;
		}
		if((p1=='{') && (p1=='}')) {
			return true;
		}
		if((p1=='(') && (p1==')')) {
			return true;
		}
		return false;
	}
	
	public static boolean check(String str) {
		char ch1, ch2;
		int i;
		Char_Stack st = new Char_Stack();
		
		for(i=0; i<exp.length(); i++) {
			ch1 = exp.charAt(i);
		
			if((ch1=='[') || (ch1=='{') || (ch1=='('))
				st.push(ch1);
			
			if((ch1==']') || (ch1=='}') || (ch1==')')) {
				if(st.isEmpty()) {
					System.out.println("Closing parenthesis are more...");
					return false;
				}
			}
			
			ch2=st.pop();
			if(!(match(ch1, ch2))) {
				System.out.println("Missmatch...");
				return false;
			}
			if(st.isEmpty()) {
				return true;
			}
				
			else {
				System.out.println("Opening parenthesis are more than closing");
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter the expression: ");
		str=sc.next();
		if(check(str)) {
			System.out.println("valid expression");
		}
		else {
			System.out.println("Not valid expression");
		}
	}

}
