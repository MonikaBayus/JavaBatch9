package class011;

import java.util.Scanner;

public class Repl079 {

	public static void main(String[] args) {
	

			   Scanner scanner = new Scanner(System.in);

			   int []numbers = new int[5];

			   for(int i=0; i<numbers.length; i++){
			     numbers[i]=scanner.nextInt();
			   }

			   for(int i=0; i<numbers.length; i++){
			    System.out.println(numbers[i]*10);
			   }


	}

}
