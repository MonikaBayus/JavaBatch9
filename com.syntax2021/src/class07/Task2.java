package class07;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	
	int count = 5;
	
	while(count>0 ) {
	
	String name;
	System.out.println("Please enter your name:");
	name = scanner.next();
	System.out.println("Hello " + name );
	count--;
	
	}
	}

}
