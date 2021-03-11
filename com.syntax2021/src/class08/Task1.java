package class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int start;
		int end;
		int even = 0;
		int odd =0;
		
		System.out.println("Please enter first number: ");
		start= scanner.nextInt();
		System.out.println("Please enter last number: ");
		end = scanner.nextInt();
		
		if(start!=end && start<end){// or -> if(start<end) {	
		for(int i = start; i<=end; i++) {
			
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			
			}
			
		}
		
	System.out.println("Odd sum: " + odd);
	System.out.println("Even sum: " + even);
		
	}
//we wil have to write different loop here for where if we want start>end
}
}

//if(start!=end && start<end
//3.Write a program that reads a range of integers (start and end point), 
//provided by a user and then from that range prints the sum of the even and odd integers.


