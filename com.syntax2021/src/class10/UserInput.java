package class10;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	int []numbers = new int[5];
	
	for(int i = 0; i<numbers.length; i++) {
		numbers[i] = scanner.nextInt();
	}
	
	for(int i=numbers.length-1; i>=0; i-- ) {
		System.out.println(numbers[i]);
	}
	

	}

}

//
//Scanner input = new Scanner(System.in);
//
//int [] a = new int[10];
//
//boolean present = true;
//
//for(int i = 0; i < a.length; i++) {
//
// a[i] = input.nextInt();//take 10 inputs from the user
//
