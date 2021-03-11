package class05;

import java.util.Scanner;

public class TaskOperators {

	public static void main(String[] args) {
		
		
	Scanner scanner = new Scanner(System.in);
	
	double height;
	
	System.out.println("Please enter your height in inches: ");
	height = scanner.nextDouble();
	
	if(height<60) {
		System.out.println("Classified as short");
	}else if(height<=60 && height<=72) {
		System.out.println("Classified  as medium");
	}else {
		System.out.println("Classified as tall");
		
	}
	
	

	}

}


/*


Prompt the user to enter person heights in inches. Person should be classified as one of the following:
short (under 60 inch)
medium(between 60 -72 inch)
tall (over 72 inch)


Write a program that will print whether it is a weekend or weekday. 
If any day from 1-5 → output “It is a weekday”, any day from 6-7 → output “It is a weekend”,
 any other day → output “Invalid day”





*/