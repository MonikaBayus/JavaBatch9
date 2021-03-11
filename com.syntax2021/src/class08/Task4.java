package class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String item;
		int price;
		int money;
		int total;
		int remainder;
		int sum=0;
	
	
		System.out.println("Please enter your item: ");
		item= scanner.nextLine();
		System.out.println("Please enter the price: " + item);
		price = scanner.nextInt();
		
		do {
		
		//System.out.println("Please pay for the item: ");
		money = scanner.nextInt();
		sum+=money;//I should be looking at total amount you give me, not at the amount you enter
		
		if(sum<price) {
			remainder = price - sum;
			System.out.println("Enter more " + remainder);
		}else if(sum>price) {
			remainder = sum-price;
			System.out.println("Here is your change " + remainder);
			break;
		}else {
			System.out.println("Amout is correct");
		
		}
		
		}while(price!=sum);//price == true
		//as long asit's not equal let's continue; let's loop 
		//if the price is not equal to money -> true goes back 
		System.out.println("Thank you for shopping");
			
		}
	}
	

		

/*4.Write a program to ask a user to enter item they want to buy and the price of that item. 
Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
If user give more money program should return a change. 
Whenever a user done with payments program should say “Thank you for shopping!”
*/