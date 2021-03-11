package Review02;

import java.util.Scanner;

public class BankingApplication {
	
	public static void main (String [] args) {
		
		
		String name;
		String password;
		boolean isAllowed = true;
		double accountBalance = 1000;
		double amountToTransfer = 3000;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter name: ");
		name = scanner.next();
		System.out.println("Please enter your password");
		password = scanner.next();
		
		
		
		
		
		
		if(name.equalsIgnoreCase("Salma")) {
			
			if(password.equalsIgnoreCase("Salma123")) {	
				System.out.println("Welcome to Bank of America");
				System.out.println("Please enter amount to transfer");
				
				amountToTransfer = scanner.nextDouble();
				if(accountBalance>=amountToTransfer) {
					System.out.println("Amount to ransfer is: " + amountToTransfer );
					
					
				}else {
				System.out.println("insuficient balance");
			}
			
		}else {
			System.out.println("Incorrect password" );
		}
		
		}else {
			System.out.println("your user name is not correct, please try again");
		}
	}
}


	
		
//		if(name.equalsIgnoreCase("salma")) {
//		System.out.println("Welcome to Syntax Bank"); 
//		}
//		if(password.equalsIgnoreCase("Salma123")) {
//			System.out.println("Welcome to Syntax bank");
//		}
//		if(isAllowed) {
//			System.out.println("you can transfer money");
//		}
		//we can not use independent if conditions

