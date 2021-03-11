package Assignments;

public class Task3 {

	public static void main(String[] args) {
	int sumOdd=0;
	int sumEven = 0;
		
		int [][]numbers = {{4,6,5},{12,32,45,89}};
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++){
				
				if(numbers[i][j]%2==0) {
					sumEven+=numbers[i][j];
					
				}else if(numbers[i][j]!=0) {
					sumOdd+=numbers[i][j];
					
				}	
			}		
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
		

	}

}

//3.Create a 2D array or integer type where you will store integer values in 3 rows and 4 columns. 
//Develop a program which will calculate the sum of  even and odd numbers for that array.