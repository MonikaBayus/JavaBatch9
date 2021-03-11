package class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		int i=10;
		String str = "Hello";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		String name = scan.nextLine();
	
		System.out.println("Your name is: "+ name );
		
		System.out.println(" ");
		System.out.println("Please enter your last name:");
		
		String lastname = scan.nextLine();
		
		System.out.println("You are: " + name + " " + lastname);
	}

}


//scan.next().charAt(); -> Character
//scan.next.Line();  -> String
//scan.nextBoolean();
//