package class05;

import java.util.Scanner;

public class HM3 {

	public static void main(String[] args) {
		
		
		int a;
		int b;
		int c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 didtinct numbers:");
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if(a>b) {
			
			if(a>c) 
				System.out.println("a is the largest number " + a);
				
			}else if(c>b){
				System.out.println("c is the largest number " + c);
				
				
			}else if(b>c) {
			 System.out.println("b is the larhest number " + b);
			 
			}else {
				System.out.println("numbers are euqual");
			}
			}
		}
	

		
		



/*
Write a program to find largest number among three numbers using nested if 
provided by a user (numbers must be distinct)

*/