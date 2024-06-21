package student_stack;

import java.util.Scanner;

public class Student_Stack_Main {
	
	public static void main(String[] args) {
		
		Student_Stack_Functions ssf = new Student_Stack_Functions();
		int ch;
		Student stud; 
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Exit");
			System.out.print("Enter your choice:");
			ch = s.nextInt();
			
			switch (ch) {
			case 1:
				System.out.print("Enter roll no:");
				int rn= s.nextInt();
				System.out.print("\nEnter name :");
				String name = s.next();
				System.out.print("\n Enter Marks1:");
				int mk1= s. nextInt();
				System.out.print("\n Enter Marks2:");
				int mk2= s. nextInt();
				Student s1 =new Student(rn, name, mk1, mk2);
				ssf.push(s1);
				break;
			case 2:
				stud = ssf.pop();
				if (stud.getRno()==0) {
					System.out.println("Stack is empty");
				} else {
					System.out.println("Popped Value is " + stud);
				}
				break;
			case 3:
				stud = ssf.peek();
				if (stud.getRno()==0) {
					System.out.println("Stack is empty");
				} else {
					System.out.println("Top Value is :" + stud);
				}
				break;
			case 4:
				break;
			default:
				System.out.println("Enter Value is not between 1 to 4 Enter again!!!..");
				break;
			}
		} while (ch != 4);
		System.out.println("~~~ Thank you ~~~~");
	}

}
