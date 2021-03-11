package class08;

import java.util.Scanner;

public class Soda1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int money;
		
	System.out.println("Please pay for soda");
	money = scanner.nextInt();
	
	while(money !=3) {
		if(money<3) {
			System.out.println("more money");
		}else if(money>3) {
			System.out.println("less money");
		}
		
		money = scanner.nextInt();// we are capturing the second time money from  if condition;
	}
	System.out.println("Thank you for your purchase");	

	}

}

//for while we need condition