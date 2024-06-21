package student_sorting;

import java.util.Scanner;

public class Sorting_Main {
	
	public static void main(String[] args) {
		Student arr[]=null;
		int choice=0,no, mark1,mark2,rollno;
		String name;
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1. Insert Multiple Student");
			System.out.println("2. Bubble Sort");
			System.out.println("3. Insertion Sort");
			System.out.println("4. Selection Sort");
			System.out.println("5. Display");
			System.out.println("6. Exit");
			System.out.print("Enter your choice:");
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			switch (choice) {
			case 1:
				System.out.print("How many Student to enter :");
				no = s.nextInt();
				arr= Student.insertMany(no);				
				System.out.println("Added Successfully");
				break;
			case 2:
				Bubble_Sort.bubble_Sort(arr);
				break;
			case 3: 
				Insertion_Sort.insertion_Sort(arr);
				break;
			case 4:
				Selection_Sort.selection_Sort(arr);
				break;
			case 5:
				Student.display(arr);
				break;
			case 6:
				break;
			default:
				System.out.println("Enter Value is not between 1 to 6 Enter again!!!..");
				break;
			}
		} while (choice != 6);
		System.out.println("~~~ Thank you ~~~~");
	}

}
