package class011;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
	
		
		String []array;
		
		System.out.println("How many elements would you like to store?");
		int size = scanner.nextInt();
		
		array = new String[size];

		for(int i = 0; i< size; i++) {//or array.length instead of size
			System.out.println("Please enter String: ");
			
			array[i] =scanner.next();	
			
		}
		System.out.println("-------------------Printing elements----------------------");
		
		for(String a:array) {
			System.out.println(a + " ");
		}
		
		
		
		
		
		

	}

}
