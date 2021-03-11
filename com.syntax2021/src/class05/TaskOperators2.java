package class05;

import java.util.Scanner;

public class TaskOperators2 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	int day = 0;
	
	System.out.println("Please enter day of the week: ");
	day = scanner.nextInt();
		
	if(day>=1 && day<=5) {
		System.out.println("It is a weekday.");
	}else if(day==6 || day==7) {
		System.out.println("It is weekend.");
	}else {
		System.out.println("Invalid day.");
	}
		

	}

}

/*

Write a program that will print whether it is a weekend or weekday. 
If any day from 1-5 → output “It is a weekday”, any day from 6-7 → output “It is a weekend”,
 any other day → output “Invalid day”


*/