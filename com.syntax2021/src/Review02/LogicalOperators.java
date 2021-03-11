package Review02;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your password:");
		String pass = scanner.next();
		
		if(pass.equals("pass123")) {
			System.out.println("Enter true to check your balance and false to close your application");
			boolean nextOp = scanner.nextBoolean();
			if(nextOp) {
				System.out.println("hello this is Monika");
			}else {
				System.out.println("Application closed");
				
			}
		}else {
			System.out.println("password is not correct");
		}
		
	

	}

}
