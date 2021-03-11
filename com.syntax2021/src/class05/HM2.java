package class05;

import java.util.Scanner;

public class HM2 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Please enter 3 distinc values: ");
		a= scanner.nextDouble();
		b= scanner.nextDouble();
		c= scanner.nextDouble();
		
		if(a>b && a>c) {
			System.out.println("a is the largest " + a);
		}else if(c>b) {
			System.out.println("c is the largest " + c);
		}else if(b>c) {
			System.out.println("b is the largest "+ b);
		}else {
			System.out.println("numbers are equal");
		}
				
		
		
		

	}

}


/*

Write a program to find largest of three double values
 using if-else..if and logical operators provided by a user (numbers must be distinct)







*/