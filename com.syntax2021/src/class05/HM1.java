package class05;

import java.util.Scanner;

public class HM1 {

	public static void main(String[] args) {
		
		String birthmonth;
		String season;
		String text = "You were born in: ";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your birth month: ");
		birthmonth = scanner.next();
		
	
	
		
		if(birthmonth.equalsIgnoreCase("March") ||  birthmonth.equalsIgnoreCase("April") ||  birthmonth.equalsIgnoreCase("May")) {//spring	
			season = "Spring";
			
		}else if(birthmonth.equalsIgnoreCase("June") || birthmonth.equalsIgnoreCase("July") || birthmonth.equalsIgnoreCase("August")) {//fall
			season= "Summer";
		}else if(birthmonth.equalsIgnoreCase("December") || birthmonth.equalsIgnoreCase("January") || birthmonth.equalsIgnoreCase("February")) {
			season = "Winter";	
		}else if(birthmonth.equalsIgnoreCase("September") || birthmonth.equalsIgnoreCase("October") || birthmonth.equalsIgnoreCase("November")) {
			season = "Fall";	
		}else {
			season="Invalid month";		
		}
		
		System.out.println(text + season );
		
		}
			
			
		}
		
		
		
	


/*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =“Summer”.
At the end of the program we should see output as “You were born is season ______“.




*/