package class07;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number;
		int lotteryNumber = 17;
		
		//code repetition in this example comparing with while;
		System.out.println("Please enter any number from 1 to 100 to win the lotter: ");
		number = scanner.nextInt();
		
		while( number!=lotteryNumber) {
			System.out.println("Please enter any number from 1 to 100 to win"); 
			number = scanner.nextInt();
			
		}
		System.out.println("You are a winner, your lucky number is: " + number);

		
		

	}

}
