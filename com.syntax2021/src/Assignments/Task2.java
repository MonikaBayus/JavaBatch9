package Assignments;

public class Task2 {

	public static void main(String[] args) {
		
		int [][]numbers = {{4,7,8},{34,60,45,20}};
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				if(numbers[i][j]%2==0) {
					System.out.println(numbers[i][j]);
				}
			}
		
		}
		
	
		

	}

}

//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. 
//Develop a program which will identify/print the even numbers only.