package Assignments;

public class Task6 {

	public static void main(String[] args) {
		
		int num=11;
		boolean prime=true;
		
		if(num>1) {
		for(int i =2; i<=num; i++) {
			
			if(num%i==0) {
				prime =false;//Changing condition to false
				break;
			}
		}	
			
		}else {
			prime=false;
			
		}
		
		if(prime) {
			System.out.println(num + " is prime number");
			
		}else {
			System.out.println(num +" is not a prime number" );
		}
		

	}

}


//if (!prime) {
//	System.out.println(num+" is a prime number");
//}else {
//	System.out.println(num+" is a nonprim number");
//}

//6.Write a java program to check whether a given number is prime or not?
//prime number could be divided by 1 and itself, positive number; - 9 is not prime(because 3x3), 11 is prime;can't be divisible by 2,4  