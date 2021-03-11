package class05;

import java.util.Scanner;

public class LogicalRecap {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int time;
		String timeOfTheDay = "Invalid";
	
		System.out.println("Please enter time in 24 hour format");
		time= scanner.nextInt();
		
		if(time>=1 && time<=11) {
			timeOfTheDay="Morning";	
		}else if(time>=12 && time<=13) {
			timeOfTheDay= "Noon";
		}else if(time>=14 && time<=17) {
			timeOfTheDay = "Afternoon";
		}else if(time>=18 && time<=21){
			timeOfTheDay = "Evening";
		}else if(time>=22 && time<=24) {
			timeOfTheDay ="Night";
//		}else {
//			timeOfTheDay= "Invalid";
				
			}
		System.out.println("Time of the day is " + timeOfTheDay);
		
		}
		
		
		
		
		
		
		
		
		

	}


