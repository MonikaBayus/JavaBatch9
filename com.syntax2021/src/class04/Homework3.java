package class04;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double loan;
		
		System.out.println("Please enter requested loan amount: ");
		loan = scanner.nextDouble();
		
		if(loan<=200_000) {
			System.out.println("Bank will lend you money");
		}else {
			System.out.println("Unfortuntely we are not able to lend you this amount.");
			
			
		}
		
		
	}

}


/*
You are a loan specialist and you need to ask user what is the amount of loan is needed. 
If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.










Create a Java program that will ask user to input city and temperature.
 Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”



*/