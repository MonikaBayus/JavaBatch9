package class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int number;
		int lotteryNumber = 17;
		
		//repetitive action inside the loop;
		
		//first action  - my action is entering number first;I can compare without first entering number;
		
		do {
		System.out.println("Please enter any number from 1 to 100 to win the lotter: ");
		number = scanner.nextInt();
		
		}while(number!=lotteryNumber);
			System.out.println("You are a winner, your lucky number is: " + number);
		
		}
		
	}


