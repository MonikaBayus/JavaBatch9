package class10;

public class AdvanceForLoop {

	public static void main(String[] args) {
		
		int numbers[]= {10,34,56,78, 55, 43, 19};
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]%2==0) {
				System.out.print(numbers[i]+ " ");
			}
		}
		
		//for each, enhanced for loop, advance for loop
		
		System.out.println("--------------------------------");
		for(int num : numbers) {
			
			if(num%2==0) {
				System.out.print(num + " ");
			}
			
			//System.out.print(num + " ");
		}
		
		}

	}


