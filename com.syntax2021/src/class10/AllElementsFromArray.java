package class10;

public class AllElementsFromArray {

	public static void main(String[] args) {
		
		
		int []numbers= {10,14,16,5,70,56,34};
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.print(numbers[i] + " ");
		}

		
		
		System.out.println("-----------------------");
		
		for(int i= numbers.length-1; i>=0; i-- ) {
			System.out.print(numbers[i]+ " ");
		}
		
	}

}
