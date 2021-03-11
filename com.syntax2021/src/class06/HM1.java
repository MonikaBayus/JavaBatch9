package class06;

import java.util.Scanner;

public class HM1 {

	public static void main(String[] args) {
		
		String country;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your orgin country:");
	
		country = scanner.next();
		String language;
			
		
		switch(country) {
		case "Poland":
			language = "polish";
			break;
		case "Germany":
			language = "german";
			break;
		case "Portugal":
			language = "portugese";
			break;
		case "Spain":
			language = "spanish";
			break;
			default:
			language= "unknown";	
		}
		System.out.println("You are speaking "+ language);
		
		
		
		

	}

}

/*
 * Ask user to enter their country and capture it. Once values are captured
 * print which language user speaks.
 * 
 * 
 */