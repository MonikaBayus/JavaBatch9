package class08;

public class ContinueKeyword {

	
	public static void main(String[] args) {
		
		
	for(int i=1; i<=10; i++) {
		System.out.println("Hello");
		
		if(i==3) {
			continue;
		}
		System.out.println("I am inside the loop");
	}
	
	//continue inside the condition most of the time;
		
		System.out.println("--------------------------------------------------------------");
		
		/*
		 * Print all numbers from 1 to 10 except 5 & 6;
		 */
		
		
		for(int i=1; i<=10; i++) {
			if(i == 5 || i==6) { //means -> skip 5 and 6;
				continue;
			}
			System.out.print(i+ " ");
		}
		
		System.out.println("--------------------------------------------------------------");

		/*
		 * Print numbers from 1 to 40 except those divisible by 4
		 */
	
		
		for(int i=1; i<=40; i++) {
			if(i%4==0) {//so it's skipping all numbers divisible by 4; 
				continue;
			}
			System.out.print(i+ " ");
		}
	}
}


