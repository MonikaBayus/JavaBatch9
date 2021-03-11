package Review02;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your password:");
		String pass = scanner.next();
		System.out.println("Enert amount of monry to be transfer"); 
		double transferAmount = scanner.nextDouble();
		
		if(pass.equals("pass123") && transferAmount<1000) {
			System.out.println("Amount transfered");
		}else {
			System.out.println("Password not correct or deficient balance");
		}
		
		
		
		if(pass.equals("pass123")) {
			System.out.println("Enter the amount you want to transfer");
			transferAmount = scanner.nextDouble();
			if(transferAmount<1000) {
				System.out.println("Amount transfer");
			}else {
				System.out.println("Not enought balance");
			}
		}else System.out.println("password is not corect");

	}

}
