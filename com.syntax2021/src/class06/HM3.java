package class06;

import java.util.Scanner;

public class HM3 {

	public static void main(String[] args) {
		
	int num1;
	int num2;
	char sign;
	int math;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter 2 numbers:");
	num1 = scanner.nextInt();
	num2 = scanner.nextInt();
	System.out.println("Please enter arytmetic operator: ");
	
	sign = scanner.next().charAt(0);
		
	switch(sign){
	case '+':
		math= num1+num2;
	break;
	case '-':
		math = num1-num2;
	break;
	case '*':
		math = num1*num2;
	break;	
	case '/':
		math=num1/num2;
	break;
	default:
	math = 0;
	System.out.println("You entered invalid operator.");
	
		
	}
//	if(math !=0)
//	System.out.println(num1 + " " + math + " " + num2 + " " + " = " + math);
	
	System.out.println(math);
	

	}



}

/*
 HomeWork: Using scanner class create calculator. 
 Allow user to enter 2 numbers and operator(+,-,*,/). 
 Based on operator provide the result to user. 
 * 

 */
