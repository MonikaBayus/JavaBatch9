package class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double quiz;
		double term;
		double finale;
		double avarage;
		
		System.out.println("Please enter your scores from quiz: ");
		quiz = scanner.nextDouble();
		
		System.out.println("Please enter your score from term: ");
		term = scanner.nextDouble();
		
		System.out.println("Please enter your score from final: " );
		finale = scanner.nextDouble();
		
		avarage = (quiz+term+finale)/3;
		
		if(avarage>=90) {
			System.out.println("Got A");
		}else if(avarage>=70 && avarage<90) {
			System.out.println("Got B");
		}else if(avarage>=50 && avarage<70) {
			System.out.println("Got C");
		}else {
			System.out.println("Got F");
		}
			
		

	}

}

/*

Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F


*/