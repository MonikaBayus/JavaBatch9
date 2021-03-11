package Review02;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		
		
		char op;
		
		int num1;
		int num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st number");
		System.out.println("Enter 2st number");
		System.out.println("Enter 3st number");
		num1= scanner.nextInt();
		num2 = scanner.nextInt();
		
		op = scanner.next().charAt(0);
		if(op=='+') {
			System.out.println(num1+num2);
		}else if(op=='-') {
			System.out.println(num1-num2);
		}else {
			System.out.println("Unknow");
		}
		
		
		
		

	}

}
