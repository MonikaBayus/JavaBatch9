package class04;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int temp;
		String city;
		
		System.out.println("Please enter city name: ");
		city = scanner.nextLine();
		
		System.out.println("Please enter temperature: ");
		temp = scanner.nextInt();
		
		int citytemp = (temp - 32)* 5/9;
		
		System.out.println("The temperature in the " + city + " is " + citytemp + " celcius. ");
		
		

	}

}

/*
Create a Java program that will ask user to input city and temperature.
 Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
//(32°F − 32) × 5/9 = 0°C

*/