package class07;

public class Homework {

	public static void main(String[] args) {
		
		
		int odd=0;
		int even =0;
		
		for(int i = 0; i<=50; i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		
		System.out.println("Sum off odd numbers: " + odd);
		System.out.println("Sum off even nubers: " + even);
		
		

	}

}





/*
 Calculate sum of odd and even numbers from 1 to 50 //separate from odd and even;
 */
