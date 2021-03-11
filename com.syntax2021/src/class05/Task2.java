package class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double saleAmmount, commission;
		System.out.println("Please enter your daily sale emount");
		
		saleAmmount  = scanner.nextDouble();
		
		if(saleAmmount<=10) {
			commission=0;
		}else if(saleAmmount>=10 && saleAmmount<=100) {
			commission = saleAmmount*0.1;
		}else if(saleAmmount>100 && saleAmmount<=500) {
			commission= saleAmmount*0.2;
		}else if(saleAmmount>500 && saleAmmount<=1000) {
			commission = saleAmmount*0.3;
		}else {
			commission = saleAmmount*0.5;
		}
		
		System.out.println(commission);
		if(commission>500){
			System.out.println("You are an amazing seler");
			
		}
	}

}
