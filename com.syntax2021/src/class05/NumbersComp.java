package class05;

import java.util.Scanner;

public class NumbersComp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int num1;
		int num2;
		int num3;
		int largest;
		
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		
		if(num1==num2 && num2==num3) {
			System.out.println("Numbers are equal");
			
		}else {
			if(num1 > num2) {//we are assuming number 1 is bigger than number 2;
				
			
				if(num1>num3) {
					largest = num1;
				}else {
					largest = num3;	
				}
			}else {//assuming  number 2 is bigger than number 1
				if(num2>num3) {
					largest = num2;
				}else {
					largest = num3;
				}
			}
			System.out.println("The largest number among " + num1 + ", " + num2 + ", " + num3 + ", is " + largest);
		}
		
		System.out.println("-------------------------------I am done--------------------------");
		
		

	}
}


