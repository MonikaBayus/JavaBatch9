package class09;

public class Pattern {
	public static void main(String[] args) {
		
		//printing stars in one line
		
		for(int row=1; row<=6; row++) {
			//System.out.print(" * " );
			
			for(int column=1;column<=8; column++) {//first we are printing first column
				System.out.print(" * ");
				
			}
			System.out.println();//break after first row, to move to next row
			
			}
			
			
		
		System.out.println("--------------------------------------------");
		
		
		for (int a = 1; a<=4; a++) {
			for(int b =1; b<=5; b++) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------------------------");
		
		for(int c = 1; c<=5; c++) {
			for(int d=6; d>=1; d--) {
				System.out.print(d+ " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		
		for(int f=1;f<=5; f++ ) {
			for(int g=1; g<=5; g++) {
				System.out.print(f + " ");//I am printing my rows
			}
			System.out.println();
		}
		
		  System.out.println("--------------------------------------------");

		  
		  for(int i = 1; i<=5; i++) {
			  for(int  j=1; j<=i; j++) {//my column always have to be smaller or equal to my rows. Columns can not be bigger then rows
				  System.out.print("*");
			  }
			  System.out.println();
		  }

		
		}
	
		
	}


