package class04;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int years;
		double salary;
		
		System.out.println("Please enter your total years worked: ");
		years= scanner.nextInt();
		
		
		if(years >=5) {
			System.out.println("Please enter your annual salary: ");
			salary = scanner.nextInt();
			if(salary>50000) {
				System.out.println("You are eligible for $5000 bonus.");
			}else {
				System.out.println("you are eligible for $3000.");
				
			}
			
		}else{
			System.out.println("You are not eligible for bonus.");
		}
		
	

	}

}


/*
2. Write a program to ask user to enter numbers of worked years and annual salary.
 If user worked for more or equals to 5 years than user is eligible
  for the bonus, otherwise he is not. Once user is eligible and salary
   is larger than 50000 than bonus = 5000, otherwise bonus=3000.
*/