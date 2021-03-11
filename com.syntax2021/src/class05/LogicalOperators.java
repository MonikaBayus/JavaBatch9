package class05;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int age;
		String name;
		System.out.println("Please enter your name: ");
		name = scanner.next();
		
		System.out.println("Please enter your age: ");
		age = scanner.nextInt();
		
		if(age>=1 && age<=3) {
			System.out.println("You are a baby");
		}else if(age>=3 && age<=5) {
			System.out.println("You are a bigger baby");
		}else if(age>=5 && age<=12) {
			System.out.println("You are a kid");
		}else if(age>=13 && age<=19) {
			System.out.println("You are teenager");
		}else {
			System.out.println("You are an adult");
		}
		
		
		

	}

}
