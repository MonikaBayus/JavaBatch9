package class011;

import java.util.Scanner;

public class Weekdays1 {

	public static void main(String[] args) {
		
		
	Scanner scanner = new Scanner(System.in);
	
	String []weekdays = new String[7];
	
	for(int i=0; i<7; i++) {
		System.out.println("Please enter " + (i+1)+ " day of the week");
		weekdays[i]= scanner.next();
	}
	for(String d:weekdays) {
		System.out.println(d);
		
	}

	}

}
