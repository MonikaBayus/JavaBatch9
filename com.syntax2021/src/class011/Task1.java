package class011;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
	Scanner scanner = new Scanner(System.in);
	
	double sum = 0;
	
	
	System.out.println("How many double values would you like to store?");
	int values = scanner.nextInt();
	
	double [] doubValue = new double [values];
	
	for(int i = 0; i<values; i++) {
		
		System.out.println("Please enter Double value: ");
		doubValue[i] = scanner.nextDouble();
		sum+= doubValue[i];
	}
	
	System.out.println("The total value is: " + sum);
	
	sum=0;
	for(double num : doubValue) {
		sum+=num;
	}
	System.out.println("The sum of " + values + " elements from an array = "+ sum);
	
	
		
		
		

	}

}


//create array on double values using scanner
//calculate the sum of all stored elements in an array
