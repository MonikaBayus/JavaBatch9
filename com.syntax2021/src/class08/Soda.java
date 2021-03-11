package class08;

import java.util.Scanner;

public class Soda {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int money;
		System.out.println("Please enter your soda payment $3");

		
		do {
			money = scanner.nextInt();
		
			if(money>3) {
				System.out.println("Please enter less money");
			}else if(money<3) {
			System.out.println("Please enter more money");
			}
		}while(money!=3);//the condition must be true to go back to loop, -> that's why we don't write money ==3;
		System.out.println("Thank you for your purchase");
			
		
		
		}	
		
	
		}
	


