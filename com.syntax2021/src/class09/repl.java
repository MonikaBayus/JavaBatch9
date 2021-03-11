package class09;

import java.util.Scanner;

public class repl {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
		    System.out.println("In: ");
		    int x;
		    x=scanner.nextInt();

		for(int i= x-1; i>=0; i--){
		  System.out.println(i);
		}

	}

}
