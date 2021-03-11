package class04;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int age;
	
	System.out.println("Please enter your age: ");
	
	age = scan.nextInt();
	
	if(age>=18) {
		System.out.println("We will issue a driver licence.");
	}else {
		System.out.println("Your age is below 18. Please apply for learners permit. ");
	}
	
		
		

	}

}


/*
 * 
You are DMV representative and you need to ask customer their age. 
If they are 18 and older you will issue a driver license to them, 
otherwise you will offer them to get a learners permit.
 */

