package Assignments;

public class Task7 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c;
		
		for(int i=1; i<10; i++) {
			
			System.out.print(a+ " ");
			c=a+b;
			a=b;
			b=c;
			
			//System.out.print(c+ " ");
		}
		System.out.println("-----------------Another Way------------------------");
		
		int f1=0;
		int f2=1;
			for(int f=1;f<=10;f++) {
				System.out.print(f1+" ");
				f1=f1+f2;
				f2=f1-f2;		

	}
			
			System.out.println("-----------------Another Way------------------------");
	
			
			
			int Fibonacci = 0;
			 int Last = 1;
			 for (int i = 1; i <= 10; i++) {
			  System.out.print(Fibonacci+ " ");
			  Fibonacci = Fibonacci + Last;
			  Last = Fibonacci - Last;
			 } 
			 System.out.println();
			}
}



//7.Write a Java Program to print the first 10 numbers of Fibonacci series.
//the sum of two previous numbers give you third number; ->0+1=1 ->1+1=2->2+1=3->2+3=5->5+3=8;

