package Assignments;

public class Task1 {

	public static void main(String[] args) {
		
	int sum=0;	
	int [][]numbers= {{2,4,6,},{3,9,10}};	
	
	for(int i=0; i<numbers.length; i++) {
		for(int j=0; j<numbers[i].length; j++) {	
			sum+=numbers[i][j];	
		}
	
	}
	
	System.out.println(sum);

	}

}

//1.Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

//2.Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. 
//Develop a program which will identify/print the even numbers only.


//3.Create a 2D array or integer type where you will store integer values in 3 rows and 4 columns. 
//Develop a program which will calculate the sum of  even and odd numbers for that array.

//4.Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries. 
//Then print all values from that array using 2 different loops and calculate how many total countries have been stored.

//5.Write a program to swap 2 numbers without a temporary variable?

//6.Write a java program to check whether a given number is prime or not?

//7.Write a Java Program to print the first 10 numbers of Fibonacci series.

//8.Maximum and minimum number in the array?

//9.Write a java program to find the second largest number in the array?