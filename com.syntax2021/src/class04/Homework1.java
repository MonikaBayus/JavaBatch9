package class04;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String question;
		double balance = 0;
		
		System.out.println("Do you have a Credit Card? ");
		question = scanner.next();
		
		if(question.equalsIgnoreCase("yes")) {
			System.out.println("What is your balance? ");
			balance = scanner.nextDouble();
			if(balance>1000) {
				System.out.println("Please pay off imidetiley");
			}else {
				System.out.println("Enjoy shopping");
			}
		}else if(question.equalsIgnoreCase("no")) {
			System.out.println("Would you like a credit card?");
		}
		
		
		}

	}




/*
1. Create a Java program that will ask if user has a credit card or not.
 If you user does not have a credit card then offer them. 
 If they do have one ask what is balance on the card? If balance of the card is larger than 1000, 
 tell them to pay off immediately, otherwise you can tell them that they can spend more.
 
 




*/