package class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter start number");
		int start = scanner.nextInt();
		
		System.out.println("Please enter end number");
		int end = scanner.nextInt();
		
		int sumOdd=0;
		int sumEven =0;
		
		if(start<end) {
		for(int i = start; i<=end; i++) {
			if(i%2!=0) {
				sumOdd +=i;	
			}else {
				sumEven +=i;
			}
			
		}
		
		System.out.println("Odd numbers sum is: " + sumOdd);
		System.out.println("Even numbers sum is: " + sumEven);

		
		}
	}

}

